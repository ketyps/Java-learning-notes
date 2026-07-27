package com.itheima.test;

/*
 * final 修饰类：
 *   该类不能被继承（没有子类）
 *   例如：String、Math、Integer 等都是 final 类
 *
 * 尝试继承会报错：Cannot inherit from final class
 */
public final class FinalClass {
    public void method() {
        System.out.println("我是 final 类中的方法，我可以正常被调用");
        System.out.println("但我不能被继承，因为类被 final 修饰了");
    }
}

// 下面的代码如果取消注释会编译错误：
// class SubClass extends FinalClass {}   // 编译错误！final 类不能被继承
