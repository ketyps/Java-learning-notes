package com.itheima.test;

public class Test5 {
    public static void main(String[] args) {
        //1.定义数组
        int[] arr = {11, 22, 33, 44, 55};

        //2.调用方法遍历数组
        printArr(arr);
    }

    //定义方法用于数组的遍历
    //1, 我要干嘛? 遍历数组
    //2, 我干这件事情需要什么才能完成? 数组
    //3, 方法的调用处是否需要继续使用结果? 不需要返回值
    public static void printArr(int[] arr) {
        System.out.print("["); // 先打印左括号，注意这里用 print 而不是 println
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                // 如果是最后一个元素，只打印数字和右括号，不加逗号
                System.out.print(arr[i] + "]");
            } else {
                // 如果不是最后一个元素，打印数字和逗号加空格
                System.out.print(arr[i] + ", ");
            }
        }
    }
}