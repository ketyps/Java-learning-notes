package com.itheima.stringdemo;

import java.util.Scanner;

public class StringDemo7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入数组长度");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("请录入数字");
            int temp = sc.nextInt();
            arr[i] = temp;
        }
        System.out.println(arrToString(arr));
    }

    private static String arrToString(int[] arr) {
        if (arr == null) {
            return "";
        }

        if(arr.length==0){
            return "[]";
        }

        String result = "";
        for (int i = 0; i < arr.length-1; i++) {
            result=result+arr[i]+" , ";
        }

        return "["+result+arr[arr.length-1]+"]";
    }
}
