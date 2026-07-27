package com.itheima.demo2feature;

/*
 * 接口新特性演示 —— JDK 8+ default / static / private 方法
 */
public class Test {
    public static void main(String[] args) {
        System.out.println("========== 接口常量 ==========");
        System.out.println(Inter.INFO);

        System.out.println();
        System.out.println("========== 抽象方法 ==========");
        Inter impl = new InterImpl();
        impl.show();
        impl.print();

        System.out.println();
        System.out.println("========== default 方法 ==========");
        // default 方法可以被实现类直接调用，就像继承普通类的方法一样
        impl.log("这是一条日志信息");

        System.out.println();
        System.out.println("========== default 方法调用 private 方法 ==========");
        // 接口的 private 方法对外部不可见
        // impl.commonCode();   // ❌ 编译错误！private 方法外部不可见
        impl.doWork();
        impl.doRest();

        System.out.println();
        System.out.println("========== 接口 static 方法 ==========");
        // 接口中的静态方法只能用 接口名.方法名() 调用
        Inter.staticMethod();
        // impl.staticMethod();    // ❌ 编译错误！不能通过实现类对象调用
        // InterImpl.staticMethod(); // ❌ 编译错误！不能通过实现类名调用

        System.out.println();
        System.out.println("========== 实现类自己的静态方法 ==========");
        InterImpl.myStaticMethod();     // ✅ 实现类自己的静态方法正常调用
    }
}
