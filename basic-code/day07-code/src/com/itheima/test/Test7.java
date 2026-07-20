package com.itheima.test;

public class Test7 {
    public static void main(String[] args) {
        //需求：
        //把整数上的每一位都添加到数组当中
        //反向推导

        //1. 定义一个整数（假定为正数）
        int number = 12345;

        //2. 先计算这个整数有几位（用来确定数组的长度）
        int temp = number;
        int count = 0;
        while (temp != 0) {
            temp = temp / 10; // 每次除以10去掉最后一位
            count++;          // 计数器加1
        }

        //3. 根据位数，创建一个长度合适的数组
        int[] arr = new int[count];

        //4. 反向推导：把数字重新赋给 temp，因为刚才的 temp 已经变成0了
        temp = number;

        //5. 从数组的最后一位索引开始，倒序存入提取出来的数字
        for (int i = count - 1; i >= 0; i--) {
            // 拿到 temp 的个位
            int ge = temp % 10;
            // 把个位存进数组的对应位置
            arr[i] = ge;
            // 去掉 temp 的最后一位，继续下一次循环
            temp = temp / 10;
        }

        //6. 遍历打印最终生成的正序数组
        System.out.print("转换后的数组为：[");
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                System.out.print(arr[i]);
            } else {
                System.out.print(arr[i] + ", ");
            }
        }
        System.out.println("]");
    }
}