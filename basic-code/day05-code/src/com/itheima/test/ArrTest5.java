package com.itheima.test;

import java.util.Random;

public class ArrTest5 {
    public static void main(String[] args) {
        Random r = new Random();
        int[] arr = new int[10]; // 推荐写法：int[] 放在前面
        int sum = 0;

        //1. 生成10个随机数并求和
        for(int i = 0; i < 10; i++){
            arr[i] = r.nextInt(100) + 1;
            sum += arr[i];
        }

        //2. 计算精确的平均数 (关键修改点：除以 10.0)
        double avg = sum / 10.0; // 或者写成 (double) sum / 10

        //3. 遍历统计小于平均数的个数
        int cnt = 0;
        for(int i = 0; i < 10; i++) {
            System.out.println(arr[i]);
            if (arr[i] < avg) { // 使用精确的 avg 进行比较
                cnt++;
            }
        }

        //4. 打印结果（打印平均时也使用 avg 变量，保留小数部分）
        System.out.println("和为" + sum + ", 平均数为" + avg + ", 有" + cnt + "个数小于平均数");
    }
}