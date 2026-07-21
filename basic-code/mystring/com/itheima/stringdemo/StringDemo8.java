package com.itheima.stringdemo;

import java.util.Scanner;

public class StringDemo8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入字符串");
        String str = sc.next();
        System.out.println("反转结果:" + resrever(str));
    }

    private static String resrever(String str) {
        String result = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            char c = str.charAt(i);
            result += c;
        }
        return result;
    }
}
