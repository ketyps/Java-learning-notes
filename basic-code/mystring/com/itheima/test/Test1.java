package com.itheima.test;

import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        //1. 键盘录入一个字符串
        Scanner sc = new Scanner(System.in);
        String str = "";
        while (true) {
            System.out.println("请输入一个字符串");
            str = sc.next(); // 注意：这里应该用 str = sc.next()，而不是重新声明 String str，否则外面的 str 没用到

            //2. 校验字符串是否满足规则
            boolean flag = checkStr(str);
            if (flag) {
                break;
            } else {
                System.out.println("当前的字符串不符合规则，请重新输入");
                continue;
            }
        }

        // 【新增】3. 将校验通过的字符串转换为罗马数字
        String result = convertToRoman(str);
        System.out.println("转换为罗马数字的结果为: " + result);
    }

    // 【新增】4. 校验方法实现
    private static boolean checkStr(String str) {
        // 判空、长度校验：不能为空，且长度不能大于9（题目要求）
        if (str == null || str.length() == 0 || str.length() > 9) {
            return false;
        }

        // 校验只能是数字
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c < '0' || c > '9') {
                return false;
            }
        }
        return true;
    }

    // 【新增】5. 数字转罗马数字方法实现
    private static String convertToRoman(String str) {
        // 把 1~9 的罗马数字提前定义在数组中
        String[] romans = {"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c == '0') {
                continue;
            }
            // 将字符 '1' 转成数字 1：利用 ASCII 码，'1' - '0' = 1
            int num = c - '0';
            // 根据数字去 romans 数组中找对应的罗马数字并拼接
            sb.append(romans[num - 1]);
        }
        return sb.toString();
    }
}