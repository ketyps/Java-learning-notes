package com.itheima.stringdemo;

import java.util.Scanner;

public class StringDemo10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入手机号:");
        String phoneNumber = sc.next();

        // 1. 校验是否都是数字（保留了你原来的校验）
        for (int i = 0; i < phoneNumber.length(); i++) {
            if (phoneNumber.charAt(i) > '9' || phoneNumber.charAt(i) < '0') {
                System.out.println("号码中含非法字符");
                return; // 有非法字符直接结束
            }
        }

        System.out.println("请输入开始屏蔽的位数");
        int beginIndex = sc.nextInt();
        if(beginIndex > phoneNumber.length() || beginIndex < 1){
            System.out.println("非法索引");
            return;
        }

        System.out.println("请输入结束屏蔽的位数");
        int endIndex = sc.nextInt();
        if(endIndex < beginIndex || endIndex > phoneNumber.length()){
            System.out.println("非法索引");
            return;
        }

        // 2. 使用 substring 拼接【核心重构部分】
        // 注意：beginIndex-1 和 endIndex-1 是为了跟你的数学逻辑对齐 (用户说第4位，程序里是下标3)
        String startStr = phoneNumber.substring(0, beginIndex - 1);
        String endStr = phoneNumber.substring(endIndex - 1);

        // 3. 拼接结果 (中间直接拼 ****)
        String result = startStr + "****" + endStr;

        System.out.println("屏蔽效果:" + result);
    }
}