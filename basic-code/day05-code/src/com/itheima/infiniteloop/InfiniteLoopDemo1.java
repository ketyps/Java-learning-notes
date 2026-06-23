package com.itheima.infiniteloop;

public class InfiniteLoopDemo1 {
    public static void main(String[] args) {
        //for格式的无限循环（被注释掉了，不会执行）
        /*for(;;){
            System.out.println("学习");
        }*/

        //while格式的无限循环（被注释掉了，不会执行）
        /*while(true){
            System.out.println("学习");
        }*/

        //注意事项
        //【错误解析】：无限循环的下面不能写其他代码。
        //因为 while(true) 是一个死循环，程序会一直困在这里打印。
        //Java 编译器检测到下面的代码永远没有机会被执行，所以会直接报错！

        while(true){
            System.out.println("给女神表白");
        }

        // 💡 红色感叹号报错：Unreachable statement（无法访问的语句）
        // 只要上面 while(true) 还在运行，这行代码一辈子也执行不到。
        //System.out.println("女神答应我了");
    }
}