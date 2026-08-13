package com.itheima.mysort;

public class Test3 {
    public static void main(String[] args) {
        /*
         * 有一堆桃子，猴子第一天吃了其中的一半，并多吃了一个！
         * 以后每天猴子都吃当前剩下的一半，然后再多吃一个，
         * 第10天的时候（还没吃），发现只剩下一个桃子了，请问，最初总共多少个桃子？
         */
        System.out.println(initPeachmount(1, 10));
    }

    public static int initPeachmount(int lastMount, int day) {
        if(day==1){
            return lastMount;
        }

        lastMount = (lastMount + 1) * 2 ;
        day--;

        return initPeachmount(lastMount, day);
    }

}