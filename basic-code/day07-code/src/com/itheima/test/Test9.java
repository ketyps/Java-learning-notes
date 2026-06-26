package com.itheima.test;

import java.util.ArrayList;
import java.util.Collections;

public class Test9 {
    public static void main(String[] args) {
        /* 需求：
        一个大V直播抽奖，奖品是现金红包，分别有{2, 588 , 888, 1000, 10000}五个奖金。
        请使用代码模拟抽奖，打印出每个奖项，奖项的出现顺序要随机且不重复。 */

        // 1. 定义奖金列表（使用 ArrayList 集合）
        ArrayList<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(588);
        list.add(888);
        list.add(1000);
        list.add(10000);

        // 2. 核心：直接使用 Java 自带的方法将列表打乱
        Collections.shuffle(list);

        // 3. 遍历打印结果
        for (Integer prize : list) {
            System.out.println(prize + "元的奖金被抽出");
        }
    }
}