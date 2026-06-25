package com.itheima.test;

public class Test6 {
    public static void main(String[] args) {
        //1.定义数组
        int[] arr = {1, 5, 7, 3, 8, 10};

        //2.调用方法求最大值
        int max = getMax(arr);

        //3.打印
        System.out.println(max);
    }

    //1.我要干嘛? 求最大值
    //2.我干这件事情, 需要什么才能完成? 数组
    //3.是否返回? 返回
    public static int getMax(int[] arr){
        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if(arr[i] > max){
                max = arr[i];
            }
        }

        return max;
    }
}