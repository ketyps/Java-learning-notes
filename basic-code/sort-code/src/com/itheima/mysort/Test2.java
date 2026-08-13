package com.itheima.mysort;

public class Test2 {
    public static void main(String[] args) {
        /* 有一个很有趣的数学逻辑题叫做不死神兔问题，有一对兔子，从出生后第三个月起每个月都生一对兔子，
        小兔子长到第三个月后每个月又生一对兔子，假如兔子都不死，问第十二个月的兔子对数为多少？
            1月：1
            2月：1
            3月：2
            4月：3
            5月：5
            6月：8
        */

        //求解1:
        /* //1.创建一个长度为12的数组
        int[] arr = new int[12];
        //2.手动给0索引和1索引的数据进行赋值
        arr[0] = 1;
        arr[1] = 1;
        //3.利用循环给剩余的数据进行赋值
        for (int i = 2; i < arr.length; i++) {
            arr[i] = arr[i - 1] + arr[i - 2];
        }
        //1 1 2 3 5 8....

        //4.获取最大索引上的数据即可
        System.out.println(arr[11]);*/

        //求解2:
        //递归的方式去完成
        //1. 递归的出口
        //2. 找到递归的规律
        //Fn(12) = Fn(11) + Fn(10);
        //Fn(11) = Fn(10) + Fn(9);
        //Fn(10) = Fn(9) + Fn(8);
        //...
        //Fn(3) = Fn(1) + Fn(2);
        //Fn(2) = 1;
        //Fn(1) = 1;
        System.out.println(getSum(12));
    }

    public static int getSum(int month){
        if(month==0){
            return 0;
        }else if(month==1){
            return 1;
        }

        return getSum(month-1)+getSum(month-2);
    }
}