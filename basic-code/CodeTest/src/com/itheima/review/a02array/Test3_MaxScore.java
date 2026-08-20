package com.itheima.review.a02array;

import java.util.Scanner;

public class Test3_MaxScore {
    public static void main(String[] args) {
        /*
            题目：键盘录入 5 个学生的成绩,存入数组
            1. 求出最高分和最低分
            2. 去掉一个最高分和一个最低分,求剩下 3 个成绩的平均分(保留一位小数)
            输入示例: 88 90 75 85 92
            最高分 92, 最低分 75
            平均分 = (88 + 90 + 85) / 3 = 87.7
            提示:
                - 求最值: 先假设 arr[0] 是最大/最小,再循环比较
                - 平均分: 用总和 - 最高分 - 最低分 再除以 3
                - 用 System.out.printf("%.1f%n", 平均值) 保留一位小数
        */

        Scanner sc = new Scanner(System.in);
        int[] scores = new int[5];

        System.out.println("请输入 5 个成绩:");
        for (int i = 0; i < scores.length; i++) {
            scores[i] = sc.nextInt();
        }

        // TODO: 求最高分 max、最低分 min

        // TODO: 去掉一个最高分和一个最低分,求平均分并用 %.1f 打印

    }
}
