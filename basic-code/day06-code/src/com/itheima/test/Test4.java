package com.itheima.test;

public class Test4 {
    public static void main(String[] args) {
        /*需求：使用方法重载的思想，设计比较两个整数是否相同的方法。
        要求：兼容全整数类型 (byte,short,int,long) */

        // 调用各种重载的方法进行测试
        System.out.print("byte比较: ");
        compare((byte)10, (byte)20); // 强制转为byte，让它匹配对应方法

        System.out.print("short比较: ");
        compare((short)20, (short)20);

        System.out.print("int比较: ");
        compare(30, 40);

        System.out.print("long比较: ");
        compare(50L, 50L); // 加L表示long类型
    }

    // 会把相同功能的方法名起成一样的名字
    // 好处1：定义方法的时候可以不用那么多的单词了
    // 好处2：调用方法的时候也不需要那么麻烦了
    public static void compare(byte b1 , byte b2){
        System.out.println(b1 == b2);
    }

    public static void compare(short s1 , short s2){
        System.out.println(s1 == s2);
    }

    public static void compare(int i1 , int i2){
        System.out.println(i1 == i2);
    }

    public static void compare(long n1 , long n2){
        // 【修复】原图中这里是 n1 == n1（自己和自己比）
        System.out.println(n1 == n2);
    }
}