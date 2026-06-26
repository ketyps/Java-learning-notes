package com.itheima.twodimensionarr;

public class TwoDimensionDemo2 {
    public static void main(String[] args) {
        /*
        二维数组动态初始化格式：
                    数据类型[][] 数组名 = new 数据类型[m][n];
                    m表示这个二维数组，可以存放多少个一维数组
                    n表示每一个一维数组，可以存放多少个元素
        */

        // 1. 动态初始化一个 3 行 4 列的二维数组（m=3，n=4）
        // 这种方式只开辟了内存空间，没有存储具体的数据，默认填入 int 的默认值 0
        int[][] arr = new int[3][4];

        // 2. 打印默认初始值
        System.out.println("--- 刚初始化时的默认值（全为0） ---");
        for (int i = 0; i < arr.length; i++) { // 外层循环控制行（m）
            for (int j = 0; j < arr[i].length; j++) { // 内层循环控制列（n）
                System.out.print(arr[i][j] + " ");
            }
            System.out.println(); // 每行打印完换行
        }

        // 3. 给二维数组的元素赋值
        arr[0][0] = 11; // 第1行第1列
        arr[0][1] = 12; // 第1行第2列
        arr[1][0] = 21; // 第2行第1列
        arr[2][3] = 34; // 第3行第4列

        // 4. 打印赋值后的二维数组
        System.out.println("--- 赋值后的状态 ---");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}