package com.itheima.test;

import java.util.Scanner;

public class LoopTest2 {
    public static void main(String[] args) {
        //1.键盘录入一个整数
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个整数");
        int number = sc.nextInt();
        //2.从1开始循环判断
        //开始：1 结束：number
        for (int i = 1; i <= number; i++) {
            //用i * i 再跟number进行比较
            if(i * i == number){
                System.out.println(i + "就是" + number + "的平方根");
                //一旦找到了，循环就可以停止了，后面的数字就不需要再找了，提高代码的运行效率。
                break;
            }else if(i * i > number){
                System.out.println((i - 1) + "就是" + number + "平方根的整数部分");
                break;
            }
        }
    }
}
