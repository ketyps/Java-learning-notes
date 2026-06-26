package com.itheima.test;

import java.util.Random;
import java.util.Scanner;

public class Test11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("========== 欢迎来到双色球模拟系统 ==========");
        System.out.println("请按照提示，先输入你的投注号码。");

        // 1. 用户输入自己的号码
        int[] userNumbers = getUserNumbers(sc);

        // 2. 系统生成开奖号码
        int[] winningNumbers = generateWinningNumbers();

        // 3. 打印双色球开奖结果
        printWinningNumbers(winningNumbers);

        // 4. 核验中奖情况
        checkPrize(userNumbers, winningNumbers);
    }

    // 方法：获取用户输入的号码
    public static int[] getUserNumbers(Scanner sc) {
        int[] userNumbers = new int[7]; // 前6个存红球，第7个存蓝球

        System.out.println("请输入 6 个红球号码（1~33，用空格隔开）：");
        for (int i = 0; i < 6; i++) {
            userNumbers[i] = sc.nextInt();
        }

        System.out.println("请输入 1 个蓝球号码（1~16）：");
        userNumbers[6] = sc.nextInt();

        return userNumbers;
    }

    // 方法：生成系统开奖号码（红球不重复，蓝球独立）
    public static int[] generateWinningNumbers() {
        Random r = new Random();
        int[] winningNumbers = new int[7];

        // 生成 6 个不重复的红球（范围 1-33）
        int count = 0;
        while (count < 6) {
            int num = r.nextInt(33) + 1;
            boolean isExist = false;
            // 检查是否已经存在
            for (int i = 0; i < count; i++) {
                if (winningNumbers[i] == num) {
                    isExist = true;
                    break;
                }
            }
            // 如果不存在，才存入数组
            if (!isExist) {
                winningNumbers[count] = num;
                count++;
            }
        }

        // 生成 1 个蓝球（范围 1-16）
        winningNumbers[6] = r.nextInt(16) + 1;

        return winningNumbers;
    }

    // 方法：打印系统开奖结果
    public static void printWinningNumbers(int[] winningNumbers) {
        System.out.print("本期开奖结果为：红球 [ ");
        for (int i = 0; i < 6; i++) {
            System.out.print(winningNumbers[i] + " ");
        }
        System.out.println("] + 蓝球 [ " + winningNumbers[6] + " ]");
    }

    // 方法：根据规则核对中奖情况
    public static void checkPrize(int[] userNumbers, int[] winningNumbers) {
        int redHit = 0;
        int blueHit = 0;

        // 核对红球命中数量
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                if (userNumbers[i] == winningNumbers[j]) {
                    redHit++;
                    break; // 红球找到匹配就跳出内层循环
                }
            }
        }

        // 核对蓝球命中情况
        if (userNumbers[6] == winningNumbers[6]) {
            blueHit = 1;
        }

        System.out.println("你命中了 " + redHit + " 个红球，" + (blueHit == 1 ? "命中了" : "未命中") + " 蓝球。");
        System.out.print("恭喜你获得：");

        // 根据图片规则进行判断
        if (redHit == 6 && blueHit == 1) {
            System.out.println("一等奖！最高 1000 万元奖金！");
        } else if (redHit == 6 && blueHit == 0) {
            System.out.println("二等奖！最高 500 万元奖金！");
        } else if (redHit == 5 && blueHit == 1) {
            System.out.println("三等奖！3000 元奖金！");
        } else if (redHit == 5 && blueHit == 0 || redHit == 4 && blueHit == 1) {
            System.out.println("四等奖！200 元奖金！");
        } else if (redHit == 4 && blueHit == 0 || redHit == 3 && blueHit == 1) {
            System.out.println("五等奖！10 元奖金！");
        } else if (blueHit == 1) { // 符合 0+1, 1+1, 2+1 的情况
            System.out.println("六等奖！5 元奖金！");
        } else {
            System.out.println("很遗憾，未中奖。再接再厉！");
        }
    }
}