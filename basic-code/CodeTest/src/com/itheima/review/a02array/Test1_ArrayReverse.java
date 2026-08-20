package com.itheima.review.a02array;

public class Test1_ArrayReverse {
    public static void main(String[] args) {
        /*
            题目：将给定数组反转(原地反转,不借助新数组)
            输入: {1, 2, 3, 4, 5}
            预期输出: 5 4 3 2 1
            提示: 双指针 —— left 从索引 0 开始,right 从末尾开始,
                  交换 arr[left] 与 arr[right],然后 left++ 和 right-- 向中间靠拢,
                  当 left >= right 时停止。
        */

        int[] arr = {1, 2, 3, 4, 5};
        reverse(arr);

        // 打印结果
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    // TODO: 实现原地反转数组
    private static void reverse(int[] arr) {

    }
}
