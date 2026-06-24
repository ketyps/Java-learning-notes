package com.itheima.test;

import java.util.Random;
import java.util.Scanner;

public class LoopTest7 {
    public static void main(String[] args) {
        //需求：程序自动生成一个1-100之间的随机数字，使用程序实现猜出这个数字是多少?

        // 1. 生成一个1-100之间的随机数字
        Random r = new Random();
        int number = r.nextInt(100) + 1;

        // 2. 准备接收用户的输入
        Scanner sc = new Scanner(System.in);
        int count = 0; // 用于统计猜了多少次

        // 3. 使用死循环，直到猜中才停止
        while (true) {
            System.out.println("请输入你要猜的数字(1-100):");
            int guessNumber = sc.nextInt();
            count++; // 每猜一次，次数+1

            // 4. 判断两个数字给出不同的提示
            if (guessNumber > number) {
                System.out.println("大了，再小一点！");
            } else if (guessNumber < number) {
                System.out.println("小了，再大一点！");
            } else {
                System.out.println("恭喜你，猜中了！");
                System.out.println("你一共猜了 " + count + " 次。");
                break; // 🔴 核心：猜中后，必须用 break 跳出 while(true) 循环，游戏才会结束
            }
        }
    }
}