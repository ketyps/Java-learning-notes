package com.itheima.demo2feature;

/*
 * 接口新特性（JDK 8+）
 *
 *   成员类型            JDK 7 及以前       JDK 8          JDK 9
 *   ─────────────────────────────────────────────────────────────
 *   常量                  ✅               ✅               ✅
 *   抽象方法              ✅               ✅               ✅
 *   默认方法(default)                       ✅               ✅
 *   静态方法(static)                        ✅               ✅
 *   私有方法(private)                                        ✅
 *
 *   1. default 方法
 *      - 用 default 修饰，有方法体
 *      - 子类可以继承/重写
 *      - 用于在不破坏实现类的前提下给接口增加新方法
 *
 *   2. static 方法
 *      - 用 static 修饰，有方法体
 *      - 只能通过 接口名.方法名() 调用，不能被实现类继承
 *
 *   3. private 方法
 *      - JDK 9 引入，用于抽取 default/static 方法的公共代码
 *      - 只能在本接口内被 default/static 方法调用
 */
public interface Inter {

    // ─── JDK 7 ─── 常量 ───
    String INFO = "接口新特性演示";

    // ─── JDK 7 ─── 抽象方法 ───
    void show();
    void print();

    // ─── JDK 8 ─── 默认方法（有方法体，可继承可重写） ───
    default void log(String msg) {
        // 调用了私有方法来记录日志
        System.out.println("[日志] " + msg);
    }

    // ─── JDK 8 ─── 静态方法（接口名直接调用） ───
    static void staticMethod() {
        System.out.println("[静态方法] 接口中的静态方法，只能通过 接口名.调用");
    }

    // ─── JDK 9 ─── 私有方法（抽取公共代码） ───
    private void commonCode(String action) {
        System.out.println("┌─────────────────────────────┐");
        System.out.println("  执行操作：" + action);
        System.out.println("  操作时间：系统时间戳");
        System.out.println("  操作人：系统");
        System.out.println("└─────────────────────────────┘");
    }

    // default 方法中调用 private 方法
    default void doWork() {
        commonCode("工作");
        System.out.println("  [工作] 正在处理业务逻辑...");
    }

    default void doRest() {
        commonCode("休息");
        System.out.println("  [休息] 正在放松...");
    }
}
