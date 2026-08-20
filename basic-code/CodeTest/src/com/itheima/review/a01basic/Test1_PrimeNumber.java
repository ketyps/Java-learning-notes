package com.itheima.review.a01basic;

import java.util.Scanner;

public class Test1_PrimeNumber {
    public static void main(String[] args) {
        /*
            题目：判断一个整数是否为素数(质数)
            素数：大于 1 的自然数,除了 1 和它本身外,不能被其他自然数整除
            测试用例:
                7   -> true
                9   -> false
                1   -> false
                2   -> true
            提示: 用 for 循环从 2 遍历到 Math.sqrt(n),只要找到一个能整除的数就不是素数
        */

        Scanner sc = new Scanner(System.in);
        System.out.print("请输入一个整数 n: ");
        int n = sc.nextInt();

        boolean result = isPrime(n);
        System.out.println(n + " 是素数吗? " + result);
    }

    /**
     * TODO: 判断 n 是否为素数
     * 边界: n <= 1 时直接返回 false
     * 优化: 只需要判断到 Math.sqrt(n) 即可
     */
    private static boolean isPrime(int n) {
        // TODO: 在这里实现判断素数的逻辑

        return false;   // 占位返回值,保证能编译,实现后删除
    }
}
