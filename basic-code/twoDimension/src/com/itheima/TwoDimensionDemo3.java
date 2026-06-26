package com.itheima.twodimensionarr;

public class TwoDimensionDemo3 {
    public static void main(String[] args) {
        /* 某商城每个季度的营业额如下：单位(万元)
        第一季度：22,66,44 一维数组
        第二季度：77,33,88 一维数组
        第三季度：25,45,65 一维数组
        第四季度：11,66,99 一维数组
        要求计算出每个季度的总营业额和全年的总营业额*/

        //1. 定义一个二维数组，静态初始化每季度的营业额
        int[][] quarters = {
                {22, 66, 44}, // 第一季度
                {77, 33, 88}, // 第二季度
                {25, 45, 65}, // 第三季度
                {11, 66, 99}  // 第四季度
        };

        //2. 定义一个变量，用于累加计算全年的总营业额
        int yearSum = 0;

        //3. 遍历二维数组进行计算
        for (int i = 0; i < quarters.length; i++) {
            // 进入一个新季度时，把季度总和清零
            int quarterSum = 0;

            // 遍历当前季度（一维数组）内的每一个数据
            for (int j = 0; j < quarters[i].length; j++) {
                quarterSum += quarters[i][j];
            }

            // 打印本季度的总营业额
            System.out.println("第" + (i + 1) + "季度的总营业额为：" + quarterSum + "万元");

            // 将本季度的总和加到全年总营业额中
            yearSum += quarterSum;
        }

        //4. 打印全年的总营业额
        System.out.println("全年的总营业额为：" + yearSum + "万元");
    }
}