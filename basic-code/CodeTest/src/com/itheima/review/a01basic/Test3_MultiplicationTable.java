package com.itheima.review.a01basic;

public class Test3_MultiplicationTable {
    public static void main(String[] args) {
        /*
            题目：打印九九乘法表(嵌套 for 循环)
            预期输出:
            1*1=1
            1*2=2	2*2=4
            1*3=3	2*3=6	3*3=9
            ...(以此类推到 9*9=81)
            提示:
                - 外层循环 i 控制行(1~9)
                - 内层循环 j 控制列,每行只打印到 j <= i
                - 用 System.out.print("列*行=结果\t") 不换行,\t 是制表符对齐
                - 每行结束 println() 换行
        */

        for (int i = 1; i <= 9; i++) {
            // TODO: 内层循环打印第 i 行的内容,格式 j*i=结果,每列用 \t 分隔

            System.out.println();   // 一行打完换行
        }
    }
}
