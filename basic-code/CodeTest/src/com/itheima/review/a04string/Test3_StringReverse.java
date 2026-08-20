package com.itheima.review.a04string;

public class Test3_StringReverse {
    public static void main(String[] args) {
        /*
            题目：将给定字符串反转
            输入: "abcde"
            输出: "edcba"
            提示: 两种常见思路
                1. StringBuilder: new StringBuilder(s).reverse().toString()
                2. 倒着遍历: for (int i = s.length() - 1; i >= 0; i--) 拼到 StringBuilder 里
        */

        System.out.println("abcde 反转后 = " + reverse("abcde"));   // 期望 edcba
        System.out.println("你好世界 反转后 = " + reverse("你好世界")); // 期望 界世好你
    }

    // TODO: 实现字符串反转
    private static String reverse(String s) {
        return "";   // 占位返回值,实现后删除
    }
}
