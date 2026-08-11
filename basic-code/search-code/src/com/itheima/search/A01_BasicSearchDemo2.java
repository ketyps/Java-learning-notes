package com.itheima.search;

import javax.print.attribute.standard.ReferenceUriSchemesSupported;
import java.util.ArrayList;

public class A01_BasicSearchDemo2 {
    public static void main(String[] args) {
        //课堂练习1：
        //需求：定义一个方法利用基本查找，查询某个元素在数组中的索引
        //要求：不需要考虑数组中元素是否重复


        //课堂练习2：
        //需求：定义一个方法利用基本查找，查询某个元素在数组中的索引
        //要求：需要考虑数组中元素有重复的可能性
        //{131, 127, 147, 81, 103, 23, 7, 79, 81}
        //我要查找81，想要返回的是所有索引 3 8

        int[] arr = {131, 127, 147, 81, 103, 23, 7, 79, 81};
        System.out.println(search1(arr, 81));
        System.out.println(search2(arr, 81));
    }

    private static ArrayList search2(int[] arr, int val) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (val == arr[i]) {
                list.add(i);
            }
        }
        return list;
    }

    private static int search1(int[] arr, int val) {
        for (int i = 0; i < arr.length; i++) {
            if (val == arr[i]) {
                return i;
            }
        }
        return -1;
    }

    //参数：
    //一：数组
    //二：要查找的元素

    //返回值：
    //元素是否存在

    //心得：
    //如果我们要返回多个数据的话，可以把这些数据放到数组或者集合中。

}
