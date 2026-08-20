package com.itheima.review.a03method;

public class Test1_Fibonacci {
    public static void main(String[] args) {
        /*
            题目：斐波那契数列(不死神兔)
            第 1、2 个数都是 1,从第 3 个数开始,每个数是前两个数之和
            数列: 1, 1, 2, 3, 5, 8, 13, 21, 34, 55 ...
            求第 n 项的值
            测试用例:
                n = 10 -> 55
                n = 7  -> 13
            提示(递归):
                - 出口: n == 1 或 n == 2 时返回 1
                - 递推: fibonacci(n) = fibonacci(n-1) + fibonacci(n-2)
        */

        int n = 10;
        System.out.println("第 " + n + " 项 = " + fibonacci(n));   // 期望 55
        System.out.println("第 7 项 = " + fibonacci(7));           // 期望 13
    }

    // TODO: 用递归实现斐波那契
    private static int fibonacci(int n) {
        return 0;   // 占位返回值,实现后删除
    }
}
