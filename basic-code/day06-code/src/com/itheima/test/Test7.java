package com.itheima.test;

public class Test7 {
    public static void main(String[] args) {
        //1.定义数组
        int[] arr = {1, 5, 8, 12, 56, 89, 34, 67};

        //2.判断一个数字在数组中是否存在的（补全调用）
        int targetNumber = 12; // 我们可以定义一个要查找的目标数字
        boolean isExist = contains(arr, targetNumber); // 调用方法
        System.out.println("数字 " + targetNumber + " 在数组中是否存在？ " + isExist); // 打印结果
    }

    //1.我要干嘛? 判断数字在数组中是否存在
    //2.我干这件事情, 需要什么才能完成? 数组 数字
    //3.调用处是否需要继续使用结果? 返回 true false
    public static boolean contains(int[] arr, int number){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == number){
                return true; // 只要找到了，立刻返回 true
            }
        }
        // 【关键补全】如果整个数组都遍历完了，依然没有找到相同的数字，
        // 那么循环结束之后，必须返回 false。
        return false;
    }
}