package com.itheima.review.a10api;

public class Test3_RegexCheck {
    public static void main(String[] args) {
        /*
            题目：用正则表达式做格式校验
            需要补全三个正则:
                1. phoneRegex 手机号: 1 开头,第二位 3~9,共 11 位
                    规则: 1[3-9]\d{9}
                2. emailRegex 邮箱: 用户名(字母数字下划线,至少1位)@域名.(com/cn 等 2~4 位字母)
                    规则: \w+@[a-zA-Z0-9]+(\.[a-zA-Z]{2,})+
                3. idRegex 身份证号(简版): 前 17 位数字,最后一位数字或大写 X
                    规则: \d{17}[\dX]

            补全后运行,以下都应为 true:
                "13912345678".matches(phoneRegex)
                "abc@163.com".matches(emailRegex)
                "11010119900307777X".matches(idRegex)
        */

        // TODO: 补全三个正则
        // String phoneRegex = "";
        // String emailRegex = "";
        // String idRegex = "";

        // TODO: 用上面三个正则验证字符串并打印结果
        // System.out.println("13912345678".matches(phoneRegex));        // 期望 true
        // System.out.println("abc@163.com".matches(emailRegex));        // 期望 true
        // System.out.println("11010119900307777X".matches(idRegex));    // 期望 true
    }
}
