package com.itheima.mysort;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ComparatorDemo {

    public static void main(String[] args) {
        // 1. 准备测试数据
        List<Person> people = new ArrayList<>();
        people.add(new Person("张三", 25, 8000.0));
        people.add(new Person("李四", 30, 12000.0));
        people.add(new Person("王五", 25, 9500.0));
        people.add(new Person("赵六", 20, 6000.0));
        people.add(new Person(null, 28, 11000.0)); // 名字为 null，测试空值处理
        people.add(new Person("孙七", 30, 15000.0));

        System.out.println("========== 原始数据 ==========");
        System.out.println(people + "\n");

        // ==========================================
        // 演示 1：按单个属性排序 (利用 Comparator.comparing 提取属性)
        // ==========================================
        System.out.println("========== 1. 按年龄升序 (Comparator.comparingInt) ==========");
        // 等效于：people.sort((p1, p2) -> p1.getAge() - p2.getAge());
        // 但 comparingInt 更加安全，且语义明确
        people.sort(Comparator.comparingInt(Person::getAge));
        System.out.println(people + "\n");

        // ==========================================
        // 演示 2：多级链式排序 (实际开发中最常用的姿势)
        // ==========================================
        System.out.println("========== 2. 先按年龄升序，年龄相同再按工资升序 ==========");
        // .thenComparing 会在前一个条件相等时，启动下一个比较条件
        people.sort(Comparator.comparingInt(Person::getAge)
                .thenComparingDouble(Person::getSalary));
        System.out.println(people + "\n");

        // ==========================================
        // 演示 3：反向排序 (reversed)
        // ==========================================
        System.out.println("========== 3. 按名字长度倒序排序 ==========");
        // 注意：如果 name 是 null，直接 .reversed() 可能会抛异常，所以我们拿掉 null 测试
        // 这里只为了演示 .reversed() 用法
        people.sort(Comparator.comparingInt((Person p) -> p.getName() == null ? 0 : p.getName().length()).reversed());
        System.out.println(people + "\n");

        // ==========================================
        // 演示 4：安全处理属性的 Null 值 (实战防崩溃核心)
        // ==========================================
        System.out.println("========== 4. 按名字字母升序，但名字为 null 的排最后 ==========");
        // 核心写法：在 .comparing 的第二个参数传入处理 null 的比较器
        people.sort(Comparator.comparing(
                Person::getName,
                Comparator.nullsLast(Comparator.naturalOrder())
        ));
        System.out.println(people + "\n");

        // ==========================================
        // 演示 5：处理 List 里面本身包含 null 对象
        // ==========================================
        System.out.println("========== 5. 如果列表本身存在 null 对象，如何排？ ==========");
        people.add(null); // 加入一个空的 Person 对象
        // 外层包裹 nullsLast，让 "null对象" 排在所有 "有数据的对象" 最后面
        people.sort(Comparator.nullsLast(
                Comparator.comparing(Person::getName, Comparator.nullsLast(Comparator.naturalOrder()))
        ));
        System.out.println(people + "\n");
    }

    /**
     * 简单的实体类
     */
    static class Person {
        private String name;
        private int age;
        private double salary;

        public Person(String name, int age, double salary) {
            this.name = name;
            this.age = age;
            this.salary = salary;
        }

        public String getName() { return name; }
        public int getAge() { return age; }
        public double getSalary() { return salary; }

        @Override
        public String toString() {
            // 优雅处理 name 为 null 时的字符串拼接
            String nameStr = (name == null) ? "null" : "'" + name + "'";
            return "{name=" + nameStr + ", age=" + age + ", salary=" + salary + "}";
        }
    }
}