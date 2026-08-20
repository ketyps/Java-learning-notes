package com.itheima.review.a04string;

public class Test2_IdCard {
    public static void main(String[] args) {
        /*
            题目：从 18 位身份证号中提取个人信息
            身份证格式: 前 6 位地区码, 第 7~14 位出生日期(yyyyMMdd), 第 17 位性别(奇数为男,偶数为女)
            输入: "110101199003077777"
                出生日期: 第 7~14 位 -> "19900307"
                性别: 第 17 位 -> '7',奇数 -> 男
            预期输出:
                出生日期: 1990年3月7日
                性别: 男
            提示: 用 substring(开始索引, 结束索引) 截取,注意索引从 0 开始、含头不含尾;
                  数字转 int 用 Integer.parseInt(); '7' - '0' 或 Character 也可以取数字。
        */

        String id = "110101199003077777";

        // TODO: 截取出生日期并格式化打印
        // TODO: 判断性别并打印

    }
}
