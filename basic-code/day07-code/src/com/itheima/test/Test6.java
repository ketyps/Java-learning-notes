package com.itheima.test;

public class Test6 {
    public static void main(String[] args) {
        /*
        某系统的数字密码（大于0）。比如1983，采用加密方式进行传输，
        规则如下：
        每位数加上5
        再对10求余，
        最后将所有数字反转，
        得到一串新数。
        */

        // 1. 以数组的方式存储原密码 (例如 1983)
        int[] password = {1, 9, 8, 3};

        // 2. 第一步与第二步：每位数加上5，再对10求余
        for (int i = 0; i < password.length; i++) {
            password[i] = (password[i] + 5) % 10;
        }

        // 3. 第三步：将所有数字反转
        // 利用首尾双指针交换元素
        for (int i = 0; i < password.length / 2; i++) {
            int temp = password[i];
            password[i] = password[password.length - 1 - i];
            password[password.length - 1 - i] = temp;
        }

        // 4. 输出加密后的新密码
        System.out.print("加密后的新密码为：");
        for (int i = 0; i < password.length; i++) {
            System.out.print(password[i]);
        }
    }
}