package com.itheima.review.a02array;

public class Test2_BinarySearch {
    public static void main(String[] args) {
        /*
            题目：在升序排列的数组中,用二分查找找到目标值,返回索引
            输入: arr = {1, 3, 5, 7, 9, 11, 13},  target = 7
            预期输出: 3
            找不到时返回 -1
            提示:
                - 维护两个指针 min = 0, max = length - 1
                - 每轮取中间位置 mid = (min + max) / 2
                - arr[mid] == target 则返回 mid
                - arr[mid] < target 则 target 在右半区,min = mid + 1
                - arr[mid] > target 则 target 在左半区,max = mid - 1
                - min > max 说明找完都没有,返回 -1
        */

        int[] arr = {1, 3, 5, 7, 9, 11, 13};

        System.out.println("7 的索引 = " + binarySearch(arr, 7));    // 期望 3
        System.out.println("1 的索引 = " + binarySearch(arr, 1));    // 期望 0
        System.out.println("8 的索引 = " + binarySearch(arr, 8));    // 期望 -1
    }

    // TODO: 实现二分查找
    private static int binarySearch(int[] arr, int target) {
        return -1;   // 占位返回值,实现后删除
    }
}
