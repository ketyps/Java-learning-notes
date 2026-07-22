package com.itheima.test;

public class Test6 {
    public static void main(String[] args) {
        // 测试用例（你可以替换为示例 1、2、3 来测试）
        String s = "luffy is still joyboy";

        System.out.println("最后一个单词的长度为: " + lengthOfLastWord(s));
    }

    private static int lengthOfLastWord(String s) {
        // 倒着遍历
        int count = 0; // 用于记录最后一个单词的长度
        int index = s.length() - 1;

        // 1. 先跳过字符串最后面可能存在的空格
        while (index >= 0 && s.charAt(index) == ' ') {
            index--;
        }

        // 2. 开始统计最后一个非空单词的长度
        while (index >= 0 && s.charAt(index) != ' ') {
            count++;
            index--;
        }

        return count;
    }
}