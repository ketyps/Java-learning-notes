package com.itheima.test;

/*
 * final 修饰方法：
 *   该方法不能被重写（override）
 *   但可以被继承使用
 */
public class Fu {
    // final 方法 —— 子类不能重写
    public final void show() {
        System.out.println("父类的 final 方法 show() —— 子类不能重写我");
    }

    // 普通方法 —— 子类可以重写
    public void show2() {
        System.out.println("父类的普通方法 show2() —— 子类可以重写我");
    }
}
