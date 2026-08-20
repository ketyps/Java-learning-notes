package com.itheima.review.a09lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Test1_StreamPractice {
    public static void main(String[] args) {
        /*
            题目：用 Stream 链式完成一组操作
            原始集合: {3, 8, 2, 5, 8, 1, 9, 5}
            步骤:
                1. filter 过滤出奇数
                2. distinct 去重
                3. sorted 升序排序
                4. map 每个数乘以 10
                5. collect 收集成 List 并打印
            预期输出: [10, 30, 50, 90]
            (过程: 奇数 -> 3 5 1 9 5 -> 去重 3 5 1 9 -> 升序 1 3 5 9 -> 乘10)
        */

        List<Integer> nums = new ArrayList<>(List.of(3, 8, 2, 5, 8, 1, 9, 5));

        // TODO: 用 Stream 链式完成 过滤 -> 去重 -> 排序 -> map -> collect,并打印

    }
}
