package com.itheima.review.a01basic;

public class Test2_NarcissisticNumber {
    public static void main(String[] args) {
        /*
            题目：打印 100~999 之间所有的水仙花数,并统计个数
            水仙花数: 一个三位数,各位数字的立方和等于它本身
            例如: 153 = 1^3 + 5^3 + 3^3
            预期输出: 153 370 371 407
            个数: 4
            提示: 取一个三位数 i 的个位(i % 10)、十位(i / 10 % 10)、百位(i / 100)
        */

        int count = 0;
        for (int i = 100; i <= 999; i++) {
            // TODO: 取出 i 的个位、十位、百位
            // TODO: 判断是否满足水仙花数条件(各位立方和 == 本身)
            //       满足则打印该数(用空格分隔),并让 count++

        }
        System.out.println();
        System.out.println("水仙花数共有 " + count + " 个");   // 期望 4
    }
}
