package com.itheima.review.a10api;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Test2_BigDecimalCalc {
    public static void main(String[] args) {
        /*
            题目：购物结算(用 BigDecimal 避免浮点误差)
            商品 A: 单价 0.1 元,买 3 件
            商品 B: 单价 0.2 元,买 2 件
            步骤:
                1. 计算总价 total = 0.1 * 3 + 0.2 * 2
                2. 打 8.5 折(乘以 0.85)
                3. 结果保留两位小数输出
            预期: 总价 = 0.7,折后 = 0.60(保留两位)
            提示:
                - BigDecimal.multiply(另一个 BigDecimal),单价乘以数量时用 BigDecimal.valueOf(count)
                - divide 除不尽要指定精度;保留两位用 setScale(2, RoundingMode.HALF_UP)
                - 比较用 compareTo,不要用 equals(两者精度不同会误判)
        */

        BigDecimal priceA = new BigDecimal("0.1");
        int countA = 3;
        BigDecimal priceB = new BigDecimal("0.2");
        int countB = 2;

        // TODO: 计算总价 total 并打印,期望 0.7

        // TODO: 打 8.5 折并保留两位小数打印,期望 0.60

    }
}
