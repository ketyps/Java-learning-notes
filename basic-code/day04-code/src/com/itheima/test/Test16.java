package com.itheima.test;

import java.util.Scanner;

public class Test16 {
    public static void main(String[] args) {
        /* 需求：键盘录入两个数字，表示一个范围。
        统计这个范围中。
        既能被3整除，又能被5整除数字有多少个？ */

        //分析：
        //1.键盘录入两个数字
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个数字表示范围的开始");
        int start = sc.nextInt();
        System.out.println("请输入一个数字表示范围的结束");
        int end = sc.nextInt();
        //2.利用循环获取这个范围中的每一个数字
        //开始条件：start
        //结束条件：end

        // 【补全】定义一个变量 count，用来记录满足条件的数字个数
        int count = 0;

        for (int i = start; i <= end; i++) {
            //3.对每一个数字进行判断，统计有多少个满足要求的数字
            // 既能被3整除，又能被5整除
            if (i % 3 == 0 && i % 5 == 0) {
                count++; // 满足条件，计数器加1
            }
        }

        // 【补全】打印最终统计的结果
        System.out.println("这个范围内既能被3整除又能被5整除的数字有 " + count + " 个");
    }
}