package com.itheima.test;

public class ArrTest4 {
    public static void main(String[] args) {
        //定义数组求最大值: 33,5,22,44,55

        //1.定义数组用来存储5个值
        int[] arr = {33,5,22,44,55};
        //2.定义一个变量max用来存储最大值
        //临时认为0索引的数据是最大的
        int max = arr[0];
        //3.循环获取数组中的每一个元素
        //拿着每一个元素跟max进行比较
        for (int i = 0; i < arr.length; i++) {
            //i 索引 arr[i] 元素
            if(arr[i] > max){
                max = arr[i];
            }
        }
        //4.当循环结束之后，max记录的就是数组中的最大值
        System.out.println(max);
    }
}