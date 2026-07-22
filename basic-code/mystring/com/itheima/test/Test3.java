package com.itheima.test;

import java.util.Random;
import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {
        //键盘输入任意字符串，打乱里面的内容
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入字符串");
        String str = sc.next();
        System.out.println("打乱后:" + shuffle(str));
    }

    private static String shuffle(String str) {
        StringBuilder sb = new StringBuilder(str);
        Random r = new Random();
        for (int i = 0; i < sb.length(); i++) {
            int index = r.nextInt(i + 1);
            char temp = sb.charAt(index);
            sb.setCharAt(index, sb.charAt(i));
            sb.setCharAt(i, temp);
        }
        return sb.toString();
    }
}