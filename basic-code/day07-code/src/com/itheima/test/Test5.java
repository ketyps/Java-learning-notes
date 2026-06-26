package com.itheima.test;

import java.util.Scanner;

public class Test5 {
    public static void main(String[] args) {
        // 在 main 方法中调用方法获取最终得分
        double finalScore = getFinalScore();
        System.out.println("选手的最终得分为：" + finalScore);
    }

    //1.我要干嘛？ 定义一个数组，用来存储6名评委的打分(0~100)，并计算出最终得分
    //2.我需要什么？ 都不需要（方法内部自己处理）
    //3.干完了这件事情，是否需要返回？ 需要，返回最终得分（小数）
    public static double getFinalScore() {
        Scanner sc = new Scanner(System.in);
        int[] scores = new int[6]; // 存储6个分数

        // 1. 录入6个评委的打分
        for (int i = 0; i < scores.length; i++) {
            System.out.println("请第 " + (i + 1) + " 位评委打分(0-100)：");
            scores[i] = sc.nextInt();
        }

        // 2. 求最大值、最小值、总和
        int max = scores[0];
        int min = scores[0];
        int sum = 0;

        for (int i = 0; i < scores.length; i++) {
            // 更新最大值
            if (scores[i] > max) {
                max = scores[i];
            }
            // 更新最小值
            if (scores[i] < min) {
                min = scores[i];
            }
            // 累加总分
            sum += scores[i];
        }

        // 3. 按照规则计算平均分（去掉一个最高分和一个最低分）
        // 注意：除以 4.0 而不是 4，这样能保留小数，符合实际比赛分数的需求
        double avg = (sum - max - min) / 4.0;

        return avg; // 返回最终得分
    }
}