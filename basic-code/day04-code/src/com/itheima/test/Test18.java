package com.itheima.test;

public class Test18 {
    public static void main(String[] args) {
        int x = 121;
        boolean result = false;

        // 特殊情况：负数绝对不是回文（例如 -121 倒过来是 121-）
        if (x >= 0) {
            int temp = x; // 用一个临时变量来操作
            long reverse = 0; // 用 long 防止反转时 int 溢出

            // 通过循环不断取出末位数字拼接到 reverse 上
            while(temp != 0){
                int ge = temp % 10; // 取出当前的最后一位
                reverse = reverse * 10 + ge; // 拼接到反转结果上
                temp = temp / 10; // 去掉原数字的最后一位
            }

            // 如果反转后的数字和原数字相等，就是回文数
            if (reverse == x) {
                result = true;
            }
        }

        System.out.println(result);
    }
}