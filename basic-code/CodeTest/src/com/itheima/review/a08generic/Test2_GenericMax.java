package com.itheima.review.a08generic;

public class Test2_GenericMax {
    public static void main(String[] args) {
        /*
            题目：泛型方法求数组中的最大值
            要求方法签名: <T extends Comparable<T>> T max(T[] arr)
            说明: 约束 T 必须实现了 Comparable 接口,才能用 compareTo 比较
            测试:
                Integer[] {5, 9, 1, 7}  -> 9
                String[]  {"a", "c", "b"} -> "c"
            提示:
                - 先假设 arr[0] 是最大值
                - 遍历数组,用 currentMax.compareTo(arr[i]) < 0 判断是否更大
                - 用 compareTo 比较,不能用 > <(那是基本数据类型)
        */

        Integer[] nums = {5, 9, 1, 7};
        String[] strs = {"a", "c", "b"};

        System.out.println("整数最大值 = " + max(nums));   // 期望 9
        System.out.println("字符串最大值 = " + max(strs));  // 期望 c
    }

    // TODO: 补全泛型方法 max
    private static <T extends Comparable<T>> T max(T[] arr) {
        return null;   // 占位返回值,实现后删除
    }
}
