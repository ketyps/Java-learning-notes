package com.itheima.a06myset;

import java.util.HashSet;
import java.util.Set;

public class A01_SetDemo {
    public static void main(String[] args) {
        /*
            Set系列集合的特点：
                1.无序：存取顺序不一致
                2.不重复：可以去除重复
                3.无索引：没有带索引的方法，所以不能使用普通for循环遍历

            注意点：
                Set是一个接口，不能直接创建他的对象。
                所以，现在我们学习他的方法时，只能创建他实现类的对象。
                实现类：HashSet
        */

        //1.创建一个Set集合的对象
        Set<String> set = new HashSet<>();

        //2.添加元素
        //细节：如果当前要添加的元素不存在，add方法返回true，表示添加成功
        //      如果当前要添加的元素已经存在，add方法返回false，表示添加失败
        //      因为Set系列集合不允许重复。
        boolean r1 = set.add("张三");
        boolean r2 = set.add("李四");
        boolean r3 = set.add("王五");
        boolean r4 = set.add("张三");//重复，添加失败

        System.out.println(r1);
        System.out.println(r2);
        System.out.println(r3);
        System.out.println(r4);

        //3.打印集合
        //细节：打印的顺序和添加的顺序不一定一致，因为Set集合是无序的
        System.out.println(set);

        //4.遍历（因为无索引，所以不能使用普通for循环）
        //迭代器
        /*Iterator<String> it = set.iterator();
        while (it.hasNext()) {
            String s = it.next();
            System.out.println(s);
        }*/

        //增强for
        /*for (String s : set) {
            System.out.println(s);
        }*/

        //Lambda表达式
        //set.forEach(s -> System.out.println(s));
    }
}
