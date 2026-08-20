package com.itheima.review.a01basic;

import java.util.Scanner;

public class Review_Basic {
    public static void main(String[] args) {
        /*
            一、基本数据类型(8 种)
                整数: byte(1字节) short(2) int(4) long(8)
                浮点: float(4) double(8)
                字符: char(2)
                布尔: boolean
        */
        byte b = 127;
        short s = 1000;
        int i = 100000;
        long l = 10000000000L;      // long 类型字面量要加 L
        float f = 3.14F;            // float 类型字面量要加 F
        double d = 3.1415926;
        char c = '中';               // char 用单引号,能存一个中文字符
        boolean flag = true;

        /*
            二、类型转换
                1. 自动类型转换(小 -> 大): byte -> short -> int -> long -> float -> double
                2. 强制类型转换(大 -> 小): 可能损失精度
        */
        int num = (int) 3.99;       // 强制转换,结果为 3
        double d2 = i;              // 自动转换

        /*
            三、运算符
                算术: + - * / %   (整数相除结果还是整数, 3 / 2 = 1)
                赋值: = += -= *= /= %=
                比较: == != > < >= <=   (结果都是 boolean)
                逻辑: && || !   (短路运算符,&& 左边为 false 右边不再执行)
                三元: 条件 ? 值1 : 值2
        */
        int a = 10, a2 = 20;
        int max = a > a2 ? a : a2;  // 三元运算符求较大值
        System.out.println("较大值是 " + max);

        /*
            四、流程控制
                分支: if / else if / else  ,  switch
                循环: for ,  while ,  do...while
                跳转: break(结束整个循环),  continue(跳过本次循环继续)
        */

        // if-else 示例: 判断成绩等级
        int score = 85;
        if (score >= 90) {
            System.out.println("优秀");
        } else if (score >= 80) {
            System.out.println("良好");
        } else if (score >= 60) {
            System.out.println("及格");
        } else {
            System.out.println("不及格");
        }

        // switch 示例: JDK14+ 箭头写法,无需 break
        int week = 3;
        switch (week) {
            case 1 -> System.out.println("周一");
            case 2 -> System.out.println("周二");
            case 3 -> System.out.println("周三");
            default -> System.out.println("其他");
        }

        // for 循环示例: 求 1~100 的和
        int sum = 0;
        for (int j = 1; j <= 100; j++) {
            sum += j;
        }
        System.out.println("1~100 的和 = " + sum);

        // while 循环示例: 反转一个整数
        int x = 12345, reversed = 0;
        while (x != 0) {
            reversed = reversed * 10 + x % 10;
            x /= 10;
        }
        System.out.println("反转后的数字 = " + reversed);

        // break / continue 示例
        for (int j = 1; j <= 10; j++) {
            if (j == 5) {
                continue;   // 跳过 5,不打印
            }
            if (j == 8) {
                break;      // 到 8 结束整个循环
            }
            System.out.print(j + " ");   // 打印: 1 2 3 4 6 7
        }
        System.out.println();

        /*
            五、键盘录入 Scanner
                文件顶部需要 import java.util.Scanner
                nextInt()   录入整数
                nextDouble() 录入小数
                next()      录入字符串(遇空格停止)
                nextLine()  录入一行(含空格)
        */
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入你的名字: ");
        String name = sc.next();
        System.out.println("你好, " + name + "!");
    }
}
