package com.itheima.modifier;

/*
 * 同包下的子类 —— 可以访问父类的 public / protected / default
 * 不能访问 private
 */
public class Zi extends Fu {

    public void testAccess() {
        System.out.println(">>> 同包子类 Zi 继承 Fu，测试能访问哪些方法 <<<");

        publicMethod();         // ✅ public —— 任何地方
        protectedMethod();      // ✅ protected —— 同包或子类
        defaultMethod();        // ✅ default —— 同包

        // privateMethod();     // ❌ 编译错误！private 仅本类可见
    }
}
