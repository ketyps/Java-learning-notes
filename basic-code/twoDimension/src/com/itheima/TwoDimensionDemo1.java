package com.itheima.twodimensionarr;

public class TwoDimensionDemo1 {
    public static void main(String[] args) {
        /*
        二维数组静态初始化格式：
                    数据类型[][] 数组名 = new 数据类型[][] {{元素1, 元素2},{元素1, 元素2}};
        简化格式：
                    数据类型[][] 数组名 = {{元素1, 元素2}, {元素1, 元素2}};

        元素访问：
                    数组名[索引][索引];

        二维数组遍历：
                    先得到一维数组，再遍历一维数组获取元素
        */

        // 1. 简化格式静态初始化一个二维数组 (3行3列)
        int[][] arr = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        // 2. 元素访问演示
        // 访问第2行（索引为1）、第3列（索引为2）的元素
        System.out.println("访问 arr[1][2] 的元素值为: " + arr[1][2]);

        System.out.println("-------- 开始二维数组遍历 --------");

        // 3. 二维数组的嵌套遍历
        // 外层循环：遍历二维数组的每一行（获取一维数组）
        for (int i = 0; i < arr.length; i++) {
            // 内层循环：遍历当前行里面的每一个元素
            for (int j = 0; j < arr[i].length; j++) {
                // 打印元素，中间加个空格隔开
                System.out.print(arr[i][j] + " ");
            }
            // 每一行打印完毕后换行
            System.out.println();
        }
    }
}