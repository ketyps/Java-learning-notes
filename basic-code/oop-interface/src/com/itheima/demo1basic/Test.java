package com.itheima.demo1basic;

/*
 * 接口基础演示 —— 定义、实现、多实现、多态
 *
 * 接口（interface）：
 *   1. 接口是一种引用数据类型，比抽象类更抽象
 *   2. 接口中的成员变量默认是 public static final（常量）
 *   3. 接口中的抽象方法默认是 public abstract
 *   4. 类通过 implements 关键字实现接口
 *   5. 一个类可以实现多个接口（弥补 Java 单继承的不足）
 *   6. 接口不能实例化，但可以作为多态引用
 */
public class Test {
    public static void main(String[] args) {
        System.out.println("========== 访问接口常量 ==========");
        System.out.println("Swim.NAME = " + Swim.NAME);
        System.out.println("Fly.NAME  = " + Fly.NAME);
        // Swim.NAME = "xxx";    // ❌ 编译错误！接口常量不能被修改

        System.out.println();
        System.out.println("========== 接口多态（父接口引用指向实现类对象） ==========");

        Fly f = new Bird("小燕子");
        f.fly();                // 调用的是 Bird 的 fly()
        // f.sing();            // ❌ 编译错误！f 是 Fly 类型，没有 sing() 方法

        System.out.println();
        System.out.println("--- 向下转型，调用子类特有方法 ---");
        Bird bird = (Bird) f;
        bird.sing();

        System.out.println();
        System.out.println("========== 多实现（一个类实现多个接口） ==========");

        Duck duck = new Duck("唐老鸭");
        duck.swim();
        duck.fly();

        // 同一个对象可以赋值给不同接口类型
        Swim s = duck;          // 作为 Swim 看待
        s.swim();

        Fly fly = duck;         // 作为 Fly 看待
        fly.fly();

        System.out.println();
        System.out.println("========== 多态数组 ==========");
        // 同接口的不同实现类可以放入同一个数组
        Fly[] flyers = {
            new Bird("麻雀"),
            new Duck("野鸭"),
            new Bird("海鸥")
        };
        for (Fly flyer : flyers) {
            flyer.fly();
        }

        System.out.println();
        System.out.println("========== instanceof 类型判断 ==========");
        Fly f1 = new Bird("鹦鹉");
        Fly f2 = new Duck("鸳鸯");

        System.out.println("f1 是否是 Bird: " + (f1 instanceof Bird));     // true
        System.out.println("f1 是否是 Duck: "  + (f1 instanceof Duck));    // false
        System.out.println("f2 是否是 Swim: "  + (f2 instanceof Swim));    // true（Duck 实现了 Swim）
        System.out.println("f2 是否是 Fly: "   + (f2 instanceof Fly));     // true
    }
}
