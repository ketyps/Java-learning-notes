package com.itheima.review.a09lambda;

import java.util.*;
import java.util.stream.Collectors;

public class Review_LambdaStream {
    public static void main(String[] args) {
        /*
            一、Lambda 表达式
                作用: 简化"匿名内部类"的写法(前提: 接口是函数式接口,只有一个抽象方法)
                语法: (参数列表) -> { 方法体 }
                省略规则:
                    - 参数类型可以省略
                    - 只有一个参数时,括号可以省略
                    - 方法体只有一句话时,大括号和 return 可以省略
        */
        // 传统匿名内部类
        Runnable r1 = new Runnable() {
            @Override
            public void run() {
                System.out.println("传统匿名内部类写法");
            }
        };
        // Lambda 简化
        Runnable r2 = () -> System.out.println("Lambda 写法");
        r1.run();
        r2.run();

        Comparator<Integer> cmp = (a, b) -> a - b;   // 比较器也能用 Lambda 简化

        /*
            二、Stream 流
                把集合/数组转成"流",用链式方法声明式地操作数据,不修改原数据
                三步曲:
                    1. 获取流: 集合.stream() / 数组 Arrays.stream(数组)
                    2. 中间操作(可以有多个,惰性执行):
                         filter 过滤  map 映射转换  sorted 排序
                         distinct 去重  limit 截取前几个  skip 跳过前几个
                    3. 终结操作(只能有一个):
                         forEach 遍历  collect 收集回集合  count 计数
                         max/min 最大/最小  anyMatch/allMatch 匹配判断
        */
        List<Integer> nums = new ArrayList<>(List.of(5, 1, 3, 1, 9, 2, 7));

        // filter 过滤偶数 -> sorted 升序 -> distinct 去重 -> collect 收集
        List<Integer> even = nums.stream()
                .filter(n -> n % 2 == 0)
                .sorted()
                .distinct()
                .collect(Collectors.toList());
        System.out.println("偶数升序去重: " + even);   // [2]

        // map 转换: 每个元素加 10
        List<Integer> plus10 = nums.stream()
                .map(n -> n + 10)
                .collect(Collectors.toList());
        System.out.println("每个加10: " + plus10);

        // limit / skip 截取和跳过
        System.out.println("前3个: " + nums.stream().limit(3).collect(Collectors.toList()));
        System.out.println("跳过前3个: " + nums.stream().skip(3).collect(Collectors.toList()));

        // count 计数 / max 最大 / anyMatch 匹配
        long cnt = nums.stream().filter(n -> n > 3).count();
        System.out.println("大于3的个数: " + cnt);
        Optional<Integer> max = nums.stream().max(Integer::compareTo);
        System.out.println("最大值: " + max.orElse(-1));
        System.out.println("是否存在 9: " + nums.stream().anyMatch(n -> n == 9));

        /*
            三、对象流操作(方法引用 :: 简化 Lambda)
        */
        List<Person> people = new ArrayList<>(List.of(
                new Person("张三", 18),
                new Person("李四", 25),
                new Person("王五", 18),
                new Person("赵六", 30)
        ));

        // 按年龄分组
        Map<Integer, List<Person>> group = people.stream()
                .collect(Collectors.groupingBy(Person::getAge));
        System.out.println("按年龄分组: " + group);

        // 取所有姓名
        List<String> names = people.stream()
                .map(Person::getName)
                .collect(Collectors.toList());
        System.out.println("姓名列表: " + names);

        /*
            四、Optional(容器对象,解决空指针)
                of(x)         里面不能为 null,否则抛异常
                ofNullable(x) 里面可以为 null
                empty()       空容器
                isPresent()   判断是否有值
                get()         取值(没值会抛异常,不推荐)
                orElse(默认值) 有值取值,没值给默认值
        */
        Optional<String> opt = Optional.ofNullable(null);
        System.out.println("取不到时用默认值: " + opt.orElse("默认值"));
        System.out.println("有值: " + Optional.of("abc").orElse("默认值"));
    }
}

class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return name + "(" + age + ")";
    }
}
