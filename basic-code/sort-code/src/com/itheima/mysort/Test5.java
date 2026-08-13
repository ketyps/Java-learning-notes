package com.itheima.mysort;

public class Test5 {
    public static void main(String[] args) {
        /*
            可爱的小明特别喜欢爬楼梯，他有的时候一次爬一个台阶，有的时候一次爬两个台阶，有的时候一次爬三个台阶。
            如果这个楼梯有20个台阶，小明一共有多少种爬法呢？

            ? ? ?
            课堂练习
        */
        System.out.println(fun(20));
    }
    public static int fun(int mount){
        if(mount==0){
            return 0;
        }else if(mount==1){
            return 1;
        } else if (mount==2) {
            return 2;
        } else if (mount==3) {
            return 4;
        }else {
            return fun(mount-1)+fun(mount-2)+fun(mount-3);
        }
    }
}