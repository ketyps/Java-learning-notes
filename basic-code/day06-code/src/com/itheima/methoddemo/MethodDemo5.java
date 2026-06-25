package com.itheima.methoddemo;

public class MethodDemo5 {
    public static void main(String[] args) {
        // 测试输出调用
        System.out.println("普通3个数相加: " + getSum(10, 20, 30));

        // 测试可变参数（传5个数）
        System.out.println("5个数相加: " + getSum(10, 20, 30, 40, 50));

        // 测试整数溢出保护（传入接近int最大值的数）
        System.out.println("大数相加: " + getSum(2000000000, 2000000000, 2000000000));
    }

    // 完善后的方法：使用可变参数，且返回值改为 long 防止溢出
    public static long getSum(int... nums) {
        long sum = 0;
        for (int num : nums) {
            sum += num;
        }
        return sum;
    }
}