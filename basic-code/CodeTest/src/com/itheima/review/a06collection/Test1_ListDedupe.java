package com.itheima.review.a06collection;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;

public class Test1_ListDedupe {
    public static void main(String[] args) {
        /*
            题目：给一个 ArrayList 去重,保留第一次出现的顺序
            输入: [1, 2, 2, 3, 4, 4, 4, 5]
            输出: [1, 2, 3, 4, 5]
            提示: 两种思路
                1. LinkedHashSet 去重且保持插入顺序,再把集合复制回 List
                2. 遍历原集合,用 contains 判断结果集合里是否已有,没有才添加
        */

        List<Integer> list = new ArrayList<>(List.of(1, 2, 2, 3, 4, 4, 4, 5));

        // TODO: 去重并打印结果,期望 [1, 2, 3, 4, 5]

    }
}
