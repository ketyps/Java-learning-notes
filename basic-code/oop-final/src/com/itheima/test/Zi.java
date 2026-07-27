package com.itheima.test;

/*
 * 子类继承 Fu：
 *   - show() 方法被 final 修饰，不能重写
 *   - show2() 是普通方法，可以重写
 */
public class Zi extends Fu {
    // @Override
    // public void show() {       // 编译错误！不能重写父类的 final 方法
    //     System.out.println("尝试重写 final 方法");
    // }

    @Override
    public void show2() {
        System.out.println("子类重写了 show2() 方法");
    }
}
