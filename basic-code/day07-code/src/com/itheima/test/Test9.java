package com.itheima.test;

import java.util.Random;

public class Test9 {
    public static void main(String[] args) {
        // 1. 定义奖金数组
        int[] arr = {2, 588, 888, 1000, 10000};
        Random r = new Random();

        // 2. 循环遍历数组，打乱数组中的每一个元素（洗牌算法）
        for (int i = 0; i < arr.length; i++) {
            // 生成一个随机索引
            int randomIndex = r.nextInt(arr.length);
            // 将 i 索引和 randomIndex 索引的数据进行交换
            int temp = arr[i];
            arr[i] = arr[randomIndex];
            arr[randomIndex] = temp;
        }

        // 3. 遍历打印最终打乱后的顺序
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + "元的奖金被抽出");
        }
    }
}