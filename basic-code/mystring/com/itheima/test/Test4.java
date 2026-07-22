package com.itheima.test;

import java.util.Random;

public class Test4 {
    public static void main(String[] args) {
        System.out.println("获得五位验证码:" + getCode());
    }

    private static String getCode() {
        Random r = new Random();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 4; i++) {
            if (r.nextInt(2) == 1) {
                sb.append((char) ('a' + r.nextInt(26)));
            } else {
                sb.append((char) ('A' + r.nextInt(26)));
            }
        }
        sb.append(r.nextInt(10));
        int rindex = r.nextInt(5);
        char temp = sb.charAt(rindex);
        sb.setCharAt(rindex, sb.charAt(sb.length() - 1));
        sb.setCharAt(sb.length() - 1, temp);
        return sb.toString();
    }
}
