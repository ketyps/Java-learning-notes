package com.itheima.test;

public class Test2 {
    public static void main(String[] args) {
        //判断 101 ~ 200 之间有多少个素数，并输出所有素数
        int cnt = 0;
        for (int i = 101; i < 201; i++) {
            boolean bool = true;
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    bool = false;
                    break;
                }
            }
            if (bool) {
                cnt++;
                System.out.print(i + " ");
            }
        }
        System.out.println();
        System.out.println("101~200以内共" + cnt + "个素数");
    }
}