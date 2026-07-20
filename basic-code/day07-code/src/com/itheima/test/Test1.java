package com.itheima.test;

import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        /* 机票价格按照淡季旺季、头等舱和经济舱收费、输入机票原价、月份和头等舱或经济舱。
        按照如下规则计算机票价格：旺季（5-10月）头等舱9折，经济舱8.5折，淡季（11月到来年4月）头等舱7折，经济舱6.5折。 */
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入机票价格" + ":");
        double price = sc.nextDouble();
        System.out.println("请输入月份" + ":");
        int month = sc.nextInt();
        System.out.println("是否为头等舱" + ":");
        String flag = sc.next();
        if (month >= 5 && month <= 10) {
            if ("是".equals(flag)) {
                price = price * 0.9;
            } else {
                price = price * 0.85;
            }
        } else {
            if ("是".equals(flag)) {
                price = price * 0.7;
            } else {
                price = price * 0.65;
            }
        }
        System.out.println("您的机票最终价格为" + ":");
        System.out.println(price);
    }
}