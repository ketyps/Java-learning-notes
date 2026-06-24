package com.itheima.test;

import java.util.Scanner;

public class LoopTest4 {
    public static void main(String[] args) {
        // 1. 键盘录入一个整数
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个正整数：");
        int number = sc.nextInt();

        // 2. 核心逻辑（采用注释中“简化思路”）
        // 从 1 开始尝试，一直到 i * i 大于 number 为止
        int i = 1;
        while (i * i <= number) {
            i++;
        }

        // 3. 输出结果
        // 当 while 循环结束时，说明当前 i * i 已经大于 number 了。
        // 所以它的整数平方根就是循环最后一次成功时的 i，也就是当前的 i - 1。
        System.out.println(number + " 的算术平方根的整数部分是：" + (i - 1));
    }
}