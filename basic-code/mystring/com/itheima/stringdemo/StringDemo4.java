package com.itheima.stringdemo;

import java.util.Scanner;

public class StringDemo4 {
    public static void main(String[] args) {
        /*已知正确的用户名和密码,请用程序实现模拟用户登录.
        总共给三次机会,登录之后,给出相应提示*/
        String rightUsername = "zhangsan";
        String rightPassword = "123456";
        Scanner sc = new Scanner(System.in);
        System.out.println("欢迎,请登录");
        for (int i = 0; i < 3; i++) {
            System.out.println("请输入用户名");
            String username = sc.next();
            System.out.println("请输入密码");
            String password = sc.next();
            if (rightUsername.equals(username) && rightPassword.equals(password)) {
                System.out.println("欢迎回来" + rightUsername);
                break;
            } else {
                if (i < 2) {
                    System.out.println("用户名或密码错误,请检查后重试,还有" + (2 - i) + "次机会");
                } else {
                    System.out.println("你已连续三次登录失败,已退出系统");
                    System.exit(0);
                }
            }
        }
    }
}