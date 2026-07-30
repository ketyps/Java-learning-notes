package com.itheima.test;

import java.util.Random;

public class Test {
    public static void main(String[] args) {
        // 需求：
        // 把一个一维数组中的数据：0~15 打乱顺序
        // 然后再按照4个一组的方式添加到二维数组当中

        // 1.定义一个一维数组
        int[] tempArr = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 };

        // 2.打乱数组中的数据顺序
        // 遍历数组，得到每一个元素，拿着每一个元素跟随机索引上的数据进行交换
        Random r = new Random();
        for (int i = 0; i < tempArr.length; i++) {
            // 获取到随机索引
            int index = r.nextInt(tempArr.length);
            // 拿着遍历到的每一个数据，跟随机索引上的数据进行交换
            int temp = tempArr[i];
            tempArr[i] = tempArr[index];
            tempArr[index] = temp;
        }

        // 3.创建一个二维数组，按照 4 个一组的方式（总长 16，即 4x4）
        int[][] resultArr = new int[4][4];

        // 4.将一维数组的数据添加到二维数组中
        for (int i = 0; i < tempArr.length; i++) {
            // 行索引 = 当前元素索引 / 4
            // 列索引 = 当前元素索引 % 4
            resultArr[i / 4][i % 4] = tempArr[i];
        }

        // (可选) 打印验证结果
        for (int i = 0; i < resultArr.length; i++) {
            for (int j = 0; j < resultArr[i].length; j++) {
                System.out.print(resultArr[i][j] + " ");
            }
            System.out.println();
        }
    }
}