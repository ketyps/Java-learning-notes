package com.itheima.a06myset;

import java.util.LinkedHashSet;

public class A03_LinkedHashSetDemo {
    public static void main(String[] args) {
        /*
            LinkedHashSet的特点：
                1.有序：存取顺序一致
                2.不重复
                3.无索引

            底层原理：
                哈希表（数组、链表或红黑树）+ 双向链表记录元素的添加顺序
        */

        //1.创建集合
        LinkedHashSet<String> set = new LinkedHashSet<>();

        //2.添加元素
        set.add("张三");
        set.add("李四");
        set.add("王五");
        set.add("张三");//重复，添加失败

        //3.打印集合
        //细节：这里存取顺序是一致的，和HashSet的无序形成对比
        System.out.println(set);
    }
}
