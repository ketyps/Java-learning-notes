package com.itheima.mysort;

import java.util.*;

public class SortApiDemo {

    public static void main(String[] args) {
        System.out.println("========== 1. 基本类型数组排序 (Arrays.sort) ==========");
        int[] intArr = {5, 1, 9, 3, 7};
        System.out.println("原始数组: " + Arrays.toString(intArr));
        // 底层使用双轴快速排序 (Dual-Pivot QuickSort)
        Arrays.sort(intArr);
        System.out.println("升序排序: " + Arrays.toString(intArr) + "\n");


        System.out.println("========== 2. 对象类型数组排序 ==========");
        String[] strArr = {"Bob", "Alice", "Charlie", "David"};
        System.out.println("原始数组: " + Arrays.toString(strArr));
        // 底层使用 TimSort (稳定排序)
        Arrays.sort(strArr);
        System.out.println("自然升序: " + Arrays.toString(strArr) + "\n");


        System.out.println("========== 3. 集合排序 (List.sort 与 Collections.sort) ==========");
        List<Integer> numList = new ArrayList<>(Arrays.asList(10, 3, 8, 1, 6));
        System.out.println("原始List: " + numList);

        // 3.1 传统写法：使用 Collections 工具类
        Collections.sort(numList);
        System.out.println("Collections默认升序: " + numList);

        // 3.2 Java 8+ 推荐写法：直接调用 List 接口自身的 sort 方法，并用 Lambda 表达降序
        // Lambda 简化： (o1, o2) -> o2 - o1 表示降序
        numList.sort((o1, o2) -> o2 - o1);
        System.out.println("List.sort + Lambda 降序: " + numList);

        // 3.3 甚至可以使用 Comparator 内置的工厂方法 (更清爽)
        numList.sort(Comparator.reverseOrder()); // 再次降序
        System.out.println("Comparator内置逆序: " + numList + "\n");


        System.out.println("========== 4. 自定义对象排序 (多级排序与链式调用) ==========");
        List<Person> people = new ArrayList<>();
        people.add(new Person("张三", 25));
        people.add(new Person("李四", 30));
        people.add(new Person("王五", 25));
        people.add(new Person("赵六", 20));
        people.add(new Person(null, 22)); // 测试空值处理

        System.out.println("原始人员列表: " + people);

        // 4.1 使用 Lambda 按年龄升序
        // (p1, p2) -> p1.getAge() - p2.getAge()
        // 如果年龄相同，原顺序会被保留 (因为TimSort是稳定的)
        people.sort((p1, p2) -> p1.getAge() - p2.getAge());
        System.out.println("Lambda按年龄升序: " + people);

        // 4.2 使用 Comparator.comparing 提取属性 (方法引用 :: )
        // 等价于：people.sort(Comparator.comparing(p -> p.getName()));
        // 并且内置了空指针保护 (nullsLast)
        people.sort(Comparator.nullsLast(
                Comparator.comparing(Person::getName, Comparator.nullsLast(Comparator.naturalOrder()))
        ));

        // 4.3 多级排序：先按年龄升序，年龄相同的，再按名字字母升序
        // 这就是 TimSort 稳定的威力，也是链式调用的魅力
        people.sort(Comparator.comparingInt(Person::getAge)
                .thenComparing(Person::getName, Comparator.nullsLast(Comparator.naturalOrder())));
        System.out.println("多级排序 (年龄 -> 名字): " + people + "\n");


        System.out.println("========== 5. 流式操作 (不修改原集合) ==========");
        // 如果你不想破坏原 List 的顺序，只想拿到一个排好序的副本：
        List<Person> sortedCopy = people.stream()
                .filter(Objects::nonNull) // 先过滤掉 null
                .sorted(Comparator.comparingInt(Person::getAge).reversed()) // 按年龄降序
                .toList();
        System.out.println("原列表 (未改变): " + people);
        System.out.println("流处理得到的倒序副本: " + sortedCopy);
    }

    /**
     * 定义简单的实体类 Person (静态内部类，方便演示)
     */
    static class Person {
        private String name;
        private int age;

        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public String getName() { return name; }
        public int getAge() { return age; }

        @Override
        public String toString() {
            return "{name='" + name + "', age=" + age + "}";
        }
    }
}