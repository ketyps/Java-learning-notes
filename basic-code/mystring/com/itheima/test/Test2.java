package com.itheima.test;

public class Test2 {
    public static void main(String[] args) {
        /* 给定两个字符串，A和B。
        A的旋转操作就是将A 最左边的字符移动到最右边。
        例如，若A = 'abcde'，在移动一次之后结果就是'bcdea'
        如果在若干次调整操作之后，A能变成B，那么返回True。
        如果不能匹配成功，则返回false*/

        //1. 定义两个字符串
        String strA = "abcde";
        String strB = "cdeab";

        //2. 旋转字符串
        if (rotate(strA, strB)) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }

    private static boolean rotate(String strA, String strB) {
        if (strA.length() != strB.length()) {
            return false;
        }

        StringBuilder sb = new StringBuilder(strA);

        for (int i = 0; i < strA.length(); i++) {
            char c = sb.charAt(0);
            sb.deleteCharAt(0);
            sb.append(c);
            if (sb.toString().equals(strB)) {
                return true;
            }
        }
        return false;
    }
}