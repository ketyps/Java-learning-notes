package com.itheima.test;

import java.util.Scanner;

public class Test5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n1 = sc.next();
        String n2 = sc.next();
        System.out.println("乘积为" + getExtent(n1, n2));
    }

    private static String getExtent(String n1, String n2) {
        if (n1.equals("0") || n2.equals("0")) return "0";

        char[] c1 = n1.toCharArray();
        char[] c2 = n2.toCharArray();

        int[] res = new int[c1.length + c2.length];

        for (int i = c1.length - 1; i >= 0; i--) {
            int num1 = c1[i] - '0';
            for (int j = c2.length - 1; j >= 0; j--) {
                int num2 = c2[j] - '0';
                int sum = res[i + j + 1] + num1 * num2;
                res[i + j + 1] = sum % 10;
                res[i + j] += sum / 10;
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < res.length; i++) {
            if (sb.length() == 0 && res[i] == 0) continue;
            sb.append(res[i]);
        }
        return sb.toString();
    }
}