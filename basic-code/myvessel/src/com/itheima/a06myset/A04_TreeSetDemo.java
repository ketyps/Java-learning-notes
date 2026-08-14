package com.itheima.a06myset;

import java.util.TreeSet;

public class A04_TreeSetDemo {
    public static void main(String[] args) {
        /*
            TreeSet的特点：
                1.排序：可以按照规则对元素进行排序（默认升序）
                2.不重复
                3.无索引
                4.底层原理：红黑树

            两种排序方式：
                1.默认排序（自然排序）：Integer、String等类型底层已经实现了Comparable接口，直接用即可
                2.自定义排序：存储自定义对象时，需要我们自己指定排序规则（详见A05_TreeSetDemo2）
        */

        //1.存储Integer类型（默认升序排列）
        TreeSet<Integer> ts = new TreeSet<>();
        ts.add(5);
        ts.add(1);
        ts.add(3);
        ts.add(2);
        ts.add(4);
        System.out.println(ts);//[1, 2, 3, 4, 5]

        //2.存储String类型（按照字符的字典顺序排列）
        TreeSet<String> ts2 = new TreeSet<>();
        ts2.add("aaa");
        ts2.add("cba");
        ts2.add("bac");
        ts2.add("bbb");
        System.out.println(ts2);

        //3.存储自定义对象
        //细节：如果Student类没有实现Comparable接口，也没有传入Comparator对象，这里运行时会报错。
        //TreeSet<Student> ts3 = new TreeSet<>();
        //ts3.add(new Student("zhangsan", 23));
    }
}
