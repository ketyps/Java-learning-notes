package com.itheima.logicoperator;

public class LogicoperatorDemo1 {
    public static void main(String[] args) {
        //1.& 并且
        //两边都为真，结果才是真
        System.out.println(true & true);//true
        System.out.println(false & false);//false
        System.out.println(true & false);//false
        System.out.println(false & true);//false

        //2. | 或者
        //两边都为假，结果才是假
        System.out.println(true | true);//true
        System.out.println(false | false);//false
        System.out.println(true | false);//true
        System.out.println(false | true);//true

        //3. 短路逻辑运算符具有短路效果
        //简单理解：当左边的表达式能确定最终的结果，那么右边就不会参与运行了
        int a = 10;
        int b = 10;
        boolean result = ++a < 5 && ++b < 5;
        System.out.println(result);//false
        System.out.println(a);//11
        System.out.println(b);//11
    }
}
//一般或和一般与在C和Python都没有,值得关注一下
//逻辑运算符,很难不让我想起大一上学期学的离散数学