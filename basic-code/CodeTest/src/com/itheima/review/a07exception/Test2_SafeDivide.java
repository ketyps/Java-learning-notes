package com.itheima.review.a07exception;

import java.util.Scanner;

public class Test2_SafeDivide {
    public static void main(String[] args) {
        /*
            题目：健壮的两个整数除法(程序不能崩溃)
            要求:
                1. 输入不是数字时,提示"输入的不是整数,请重新输入"并重新录入
                2. 除数为 0 时,提示"除数不能为 0"并重新录入
                3. 直到成功输出商才结束
            输入示例: a 5   /   10 0   /   10 2  -> 输出 5
            提示:
                - 用 sc.nextLine() 读一行字符串,再 Integer.parseInt(str) 转数字
                - parseInt 失败会抛 NumberFormatException,除零会抛 ArithmeticException
                - 用 while(true) + try-catch,成功时 break
        */

        Scanner sc = new Scanner(System.in);

        // TODO: 用 while + try-catch 实现,成功计算并输出商后 break

    }
}
