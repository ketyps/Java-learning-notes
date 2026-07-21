package com.itheima.stringdemo;

import java.util.Scanner;

public class StringDemo9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输金额");
        String number = sc.next();
        if (Integer.parseInt(number) > 9999999 || Integer.parseInt(number) < 0) {
            System.out.println("金额不合法");
            return;
        }
        System.out.println("转换结果:" + convertToChinese(number));
    }

    private static String convertToChinese(String number) {
        char[] arr = {'零', '壹', '贰', '叁', '肆', '伍', '陆', '柒', '捌', '玖'};
        char brr[] = new char[7];
        for (int i = 0; i < 7; i++) {
            if (number.length() > i) {
                brr[i] = arr[number.charAt(number.length() - 1 - i) - '0'];
            } else {
                brr[i] = '零';
            }
        }
        return brr[6] + "佰" + brr[5] + "拾" + brr[4] + "万" + brr[3] + "仟" + brr[2] + "佰" + brr[1] + "拾" + brr[0] + "元";
    }
}
