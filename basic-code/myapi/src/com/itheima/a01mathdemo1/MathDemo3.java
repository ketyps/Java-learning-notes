package com.itheima.a01mathdemo1;

public class MathDemo3 {
    public static void main(String[] args) {
        //要求1：统计一共有多少个水仙花数。
        //要求2：判断一下为什么没有两位自幂数。（课后作业）
        //要求3：统计一共有多少个四叶玫瑰数，五角星数（课后作业）

        //水仙花数：100 ~ 999
        int count = 0;
        //得到每一个三位数
        for (int i = 100; i <= 999; i++) {
            //个位 十位 百位
            int ge = i % 10;
            int shi = i / 10 % 10;
            int bai = i / 100 % 10;
            //判断：
            //每一位的三次方之和 跟本身 进行比较。
            double sum = Math.pow(ge, 3) + Math.pow(shi, 3) + Math.pow(bai, 3);
            if (sum == i) {
                count++;
                //System.out.println(i);
            }
        }
        System.out.println(count);

        System.out.println("------------------");

        count = 0;
        for (int i = 10; i < 99; i++) {
            int ge = i % 10;
            int shi = i / 10 % 10;
            double sum = Math.pow(ge, 2) + Math.pow(shi, 2);
            if (sum == i) {
                count++;
                System.out.println(i);
            }
        }
        System.out.println("共有" + count + "个两位数自幂数");

        System.out.println("------------------");

        count = 0;
        for (int i = 1000; i < 9999; i++) {
            int ge = i % 10;
            int shi = i / 10 % 10;
            int bai = i / 100 % 10;
            int qian = i / 1000 % 10;
            double sum = Math.pow(ge, 4) + Math.pow(shi, 4) + Math.pow(bai, 4) + Math.pow(qian, 4);
            if (sum == i) {
                count++;
                System.out.println(i);
            }
        }
        System.out.println("共有" + count + "个四叶玫瑰数");

        System.out.println("------------------");

        count = 0;
        for (int i = 10000; i < 99999; i++) {
            int ge = i % 10;
            int shi = i / 10 % 10;
            int bai = i / 100 % 10;
            int qian = i / 1000 % 10;
            int wan = i / 10000 % 10;
            double sum = Math.pow(ge, 5) + Math.pow(shi, 5) + Math.pow(bai, 5) + Math.pow(qian, 5)+Math.pow(wan, 5);
            if (sum == i) {
                count++;
                System.out.println(i);
            }
        }
        System.out.println("共有" + count + "个五角星数");
    }
}