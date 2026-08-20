package com.itheima.review.a04string;

import java.util.Arrays;

public class Review_String {
    public static void main(String[] args) {
        /*
            一、String 的特性
                - 字符串常量池: 直接 "..." 创建的字符串,内容相同则复用同一个对象
                - new String() 每次都会创建新对象(不经过常量池)
                - 字符串是不可变的: 一旦创建,内容不能修改(每次"修改"都会产生新对象)
        */
        String s1 = "abc";
        String s2 = "abc";
        String s3 = new String("abc");
        System.out.println(s1 == s2);       // true   常量池中复用同一个对象
        System.out.println(s1 == s3);       // false  s3 是 new 出来的新对象,地址不同
        System.out.println(s1.equals(s3));  // true   比较内容用 equals,不要用 ==

        /*
            二、String 常用方法
        */
        String str = "HelloWorld";
        System.out.println(str.length());            // 10      长度
        System.out.println(str.charAt(0));           // H       取指定索引的字符
        System.out.println(str.substring(5));        // World   从索引 5 截到末尾
        System.out.println(str.substring(0, 5));     // Hello   截取 [0, 5) 含头不含尾
        System.out.println(str.indexOf('o'));        // 4       字符首次出现的索引
        System.out.println(str.lastIndexOf('o'));    // 6       字符最后出现的索引
        System.out.println(str.toUpperCase());       // HELLOWORLD
        System.out.println(str.toLowerCase());       // helloworld
        System.out.println(str.replace('l', 'L'));   // HeLLoWorLd  替换
        System.out.println(str.contains("World"));   // true      包含
        System.out.println("  ab  ".trim());         // ab       去掉首尾空格
        System.out.println(str.startsWith("Hell"));  // true      以...开头
        System.out.println(str.endsWith("ld"));      // true      以...结尾

        // 分割与拼接
        String[] parts = "a,b,c".split(",");
        System.out.println(Arrays.toString(parts));  // [a, b, c]
        System.out.println(String.join("-", parts)); // a-b-c

        // 字符串 与 char 数组互转
        char[] chars = str.toCharArray();
        String back = new String(chars);

        /*
            三、StringBuilder(可变字符串,适合频繁拼接,效率高)
                常用方法:
                    append(拼接) / insert(插入) / replace(替换)
                    delete(删除) / reverse(反转) / toString(转成 String)
        */
        StringBuilder sb = new StringBuilder("Hello");
        sb.append(" ").append("World");      // 链式拼接
        sb.insert(5, ",");                    // Hello, World
        System.out.println(sb);               // Hello, World

        StringBuilder sb2 = new StringBuilder("abcdef");
        System.out.println(sb2.reverse());    // fedcba  反转

        /*
            四、StringJoiner(JDK8+,可以指定分隔符 / 前缀 / 后缀拼接)
        */
        java.util.StringJoiner sj = new java.util.StringJoiner("-", "[", "]");
        sj.add("a").add("b").add("c");
        System.out.println(sj);               // [a-b-c]
    }
}
