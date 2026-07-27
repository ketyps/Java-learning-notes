package com.itheima.demo2feature;

/*
 * 实现类 —— 必须重写接口中的所有抽象方法
 * default 方法可以选择重写或不重写
 * static 方法不能被继承，也不能被重写
 */
public class InterImpl implements Inter {

    @Override
    public void show() {
        System.out.println("InterImpl 实现了 show() 方法");
    }

    @Override
    public void print() {
        System.out.println("InterImpl 实现了 print() 方法");
    }

    // 可以选择重写 default 方法
    @Override
    public void log(String msg) {
        System.out.println("【自定义日志】" + msg);
    }

    // 注意：不能重写接口中的 static 方法
    // @Override
    // public static void staticMethod() {}   // ❌ 编译错误！接口 static 方法不能被重写

    // 可以定义自己的静态方法，但与接口的 static 方法无关
    public static void myStaticMethod() {
        System.out.println("这是实现类自己的静态方法");
    }
}
