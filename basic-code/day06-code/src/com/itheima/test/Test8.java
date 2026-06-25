package com.itheima.test;

import java.util.Arrays; // 用于打印数组

public class Test8 {
    public static void main(String[] args) {
        /*需求：
        定义一个方法copyOfRange(int[] arr, int from, int to)
        功能：
        将数组arr中从索引from（包含from）开始。
        到索引to结束（不包含to）的元素复制到新数组中，
        将新数组返回。
        */

        //1.定义原始数组
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        //2.调用方法拷贝数据
        // 根据截图中的箭头图，从索引 3 开始（包含），到索引 7 结束（不包含）
        int[] newArr = copyOfRange(arr, 3, 7);

        //3.打印结果（使用 Arrays.toString 可以快速以 [a, b, c] 格式打印数组）
        System.out.println("原数组: " + Arrays.toString(arr));
        System.out.println("拷贝后的新数组: " + Arrays.toString(newArr));
    }

    //将数组arr中从索引from（包含from）开始，到索引to结束（不包含to）的元素复制到新数组中
    // 【修改】返回值类型从 void 改成了 int[]
    public static int[] copyOfRange(int[] arr, int from, int to){
        //1.根据 from 和 to 计算新数组的长度
        int[] newArr = new int[to - from];

        //2.循环遍历原数组，将指定范围的元素赋值给新数组
        // 伪代码思路：newArr[0] 对应 arr[from], newArr[1] 对应 arr[from+1]...
        for (int i = from; i < to; i++) {
            newArr[i - from] = arr[i];
        }

        //3.将新数组返回
        return newArr;
    }
}