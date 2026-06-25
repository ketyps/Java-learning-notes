package com.itheima.test;

public class Test3 {
    public static void main(String[] args) {
        //目标：要能区分出什么时候使用带返回值的方法
        //需求：定义方法，比较两个长方形的面积

        // 调用方法进行测试（传参：长1,宽1, 长2,宽2）
        compare(5.0, 3.0, 4.0, 6.0);
        compare(4.0, 4.0, 5.0, 3.2);
    }

    //1.我要干嘛？比较两个长方形的面积
    //2.需要什么？两个长 两个宽
    public static void compare(double length1, double width1, double length2, double width2) {
        // 计算两个长方形的面积
        double area1 = length1 * width1;
        double area2 = length2 * width2;

        // 比较并输出结果
        if (area1 > area2) {
            System.out.println("第一个长方形的面积更大，面积为：" + area1);
        } else if (area2 > area1) {
            System.out.println("第二个长方形的面积更大，面积为：" + area2);
        } else {
            System.out.println("两个长方形的面积相等，面积为：" + area1);
        }
    }
}