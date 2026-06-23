package com.itheima.test;

import java.util.Scanner;

public class Test19 {
    public static void main(String[] args) {
        /*需求：给定两个整数，被除数和除数（都是正数，且不超过int的范围）。
        将两数相除，要求不使用乘法、除法和 % 运算符。
        得到商和余数。*/

        // 1. 键盘录入两个数
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入被除数：");
        int dividend = sc.nextInt();
        System.out.println("请输入除数：");
        int divisor = sc.nextInt();

        // 2. 定义变量记录商
        int quotient = 0;

        // 3. 核心逻辑：利用循环减法求得商和余数
        // 只要被除数还大于等于除数，就说明还能再减去一个除数
        // 每减一次，商就加 1
        while (dividend >= divisor) {
            dividend = dividend - divisor;
            quotient++;
        }

        // 4. 当循环结束时，dividend 的值已经变成了最终无法再减的余数
        // 而 quotient 记录的就是两数相除的商

        System.out.println("商为：" + quotient);
        System.out.println("余数为：" + dividend);
    }
}