package com.itheima.review.a03method;

public class Test2_MonkeyPeach {
    public static void main(String[] args) {
        /*
            题目：猴子吃桃(经典递归逆推题)
            猴子第一天摘了若干桃子,当天吃了一半,还不过瘾,又多吃了一个
            以后每天早上都吃掉前一天剩下的一半再加一个
            到第 10 天早上想吃时,发现只剩 1 个桃子了
            问: 第一天一共摘了多少个桃子?
            答案: 1534
            思路:
                - 第 10 天早上剩下 1 个
                - 第 n-1 天剩下的 = (第 n 天剩下的 + 1) * 2
                  因为第 n-1 天吃了一半多一个后 = 第 n 天剩下的
                - 即 peach(n) 已知,可逆推 peach(n-1) = (peach(n) + 1) * 2
            提示(递归):
                - 出口: day == 10 时返回 1
                - 递推: peach(day) = (peach(day + 1) + 1) * 2
        */

        System.out.println("第一天摘的桃子数 = " + peach(1));   // 期望 1534
    }

    // 返回"第 day 天早上"剩下的桃子数
    private static int peach(int day) {
        // TODO: 实现递归

        return 0;   // 占位返回值,实现后删除
    }
}
