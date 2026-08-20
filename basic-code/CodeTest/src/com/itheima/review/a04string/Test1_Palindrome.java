package com.itheima.review.a04string;

public class Test1_Palindrome {
    public static void main(String[] args) {
        /*
            题目：判断一个字符串是否为回文字符串(正着读和倒着读一样)
            测试用例:
                "上海自来水来自海上"  -> true
                "hello"            -> false
                "level"            -> true
            提示: 两种常见思路
                1. 双指针: left 从 0,right 从 length-1,两端往中间比较字符,一旦不等返回 false
                2. StringBuilder.reverse() 反转后与原串 equals 比较
        */

        System.out.println("上海自来水来自海上 是回文? " + isPalindrome("上海自来水来自海上"));  // 期望 true
        System.out.println("hello 是回文? " + isPalindrome("hello"));                        // 期望 false
        System.out.println("level 是回文? " + isPalindrome("level"));                        // 期望 true
    }

    // TODO: 实现判断回文
    private static boolean isPalindrome(String s) {
        return false;   // 占位返回值,实现后删除
    }
}
