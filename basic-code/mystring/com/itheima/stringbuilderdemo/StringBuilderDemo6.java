package com.itheima.stringbuilderdemo;

import java.util.Scanner;

public class StringBuilderDemo6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入数字");
        String str = sc.next();

        // 调用判断方法
        if (isSymmetric(str)) {
            System.out.println("该字符串是对称字符串");
        } else {
            System.out.println("该字符串不是对称字符串");
        }
    }

    private static boolean isSymmetric(String str) {
        // 如果输入为空，直接判定为不是对称（防止后面调用反转时抛出空指针异常）
        if (str == null) {
            return false;
        }

        // 核心逻辑：
        // 1. new StringBuilder(str)：把字符串丢进 StringBuilder
        // 2. .reverse()：直接反转整个字符序列
        // 3. .toString()：反转完再变回字符串
        // 4. .equals(str)：和原始字符串对比内容是否完全相等
        return new StringBuilder(str).reverse().toString().equals(str);
    }
}