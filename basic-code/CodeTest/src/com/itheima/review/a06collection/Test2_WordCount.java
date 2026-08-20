package com.itheima.review.a06collection;

import java.util.HashMap;
import java.util.Map;

public class Test2_WordCount {
    public static void main(String[] args) {
        /*
            题目：统计一句话中每个单词出现的次数
            输入: "i love java and java love me"
            输出示例(顺序不限): i=1 love=2 java=2 and=1 me=1
            提示:
                - 用 str.split(" ") 按空格把句子切成单词数组
                - 遍历数组,用 HashMap<String, Integer> 统计:
                  第一次出现 -> put(单词, 1)
                  再次出现   -> put(单词, 原来的次数 + 1)
                  也可以用 map.merge / getOrDefault 简化
                - 最后遍历 map 打印
        */

        String sentence = "i love java and java love me";

        // TODO: 统计每个单词出现次数并打印

    }
}
