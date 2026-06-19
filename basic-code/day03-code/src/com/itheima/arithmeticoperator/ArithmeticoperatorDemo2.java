package com.itheima.arithmeticoperator;

public class ArithmeticoperatorDemo2 {
    //结论:
    //1.整数参与计算,结果只能是整数
    //2.小数参与计算,结果有可能不是精确的,如果我们需要精确计算,那么需要用到后面的知识
    static void main(String[] args) {
        //除法
        System.out.println(10/2);//5
        System.out.println(10/3);
        System.out.println(10.0/3);

        //取模,取余,实际上也是触发运算,只不过得到的是余数而已.
        System.out.println(10%2);//0
        System.out.println(10%3);//1

        // 应用场景：
        // 1. 可以用取模来判断，A 是否可以被 B 整除
        // A % B    10 % 3
        // 2. 可以判断 A 是否为偶数
        // A % 2 如果结果为 0，那么证明 A 是一个偶数。如果结果为 1，那么证明 A 是一个奇数
        // 3. 在以后，斗地主发牌
        // 三个玩家
        // 把每一张牌都定义一个序号
        // 拿着序号 % 3 如果结果为 1，就发给第一个玩家。
        // 如果结果为 2，那么就发给第二个玩家
        // 如果结果为 0，那么就发给第三个玩家
    }
}
