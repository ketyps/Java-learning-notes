package com.itheima.arithmeticoperator;

public class ArithmeticoperatorDemo3 {
    static void main(String[] args) {
        byte b1=10;
        byte b2=20;
        //现在我们要强转的结果是谁?
        //(byte)b1 + b2 强转的是b1,并不是最终的结果
        byte result=(byte)(b1+b2);
        System.out.println(result);//结果就发生错误了,因为要转换的数据过大.
    }
}
