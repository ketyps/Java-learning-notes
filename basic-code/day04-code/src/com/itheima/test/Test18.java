package com.itheima.test;

public class Test18 {
    public static void main(String[] args) {
        int x = 121;
        boolean result = true;

        // 1. 转为字符串
        String str = String.valueOf(x);
        // 2. 定义左右指针
        int left = 0;
        int right = str.length() - 1;
        // 3. 左右向中间靠拢并判断
        while(left < right){
            if(str.charAt(left) != str.charAt(right)){
                result = false;
                break; // 一旦发现不一致，直接判定不是回文
            }
            left++;
            right--;
        }
        // 4. 打印最终结果
        System.out.println(result);
    }
}