package com.itheima.modifier;

/*
 * 权限修饰符 —— 控制成员的访问范围
 *
 *                    本类    同包    不同包子类    任意位置
 *   public           ✅      ✅        ✅          ✅
 *   protected        ✅      ✅        ✅          ❌
 *   default（默认）   ✅      ✅        ❌          ❌
 *   private          ✅      ❌        ❌          ❌
 *
 *   default 是默认权限，不写任何修饰符就是 default
 */
public class Fu {
    // 四种权限修饰符的成员方法

    public void publicMethod() {
        System.out.println("  [public] 任意地方都能访问");
    }

    protected void protectedMethod() {
        System.out.println("  [protected] 同包或不同包子类能访问");
    }

    void defaultMethod() {
        System.out.println("  [default] 同包能访问");
    }

    private void privateMethod() {
        System.out.println("  [private] 仅本类能访问");
    }

    // 本类内部调用 —— 四种都能访问
    public void showAll() {
        System.out.println("--- 本类(Fu)内部访问全部四种方法 ---");
        publicMethod();
        protectedMethod();
        defaultMethod();
        privateMethod();     // ✅ private 在本类内部可以访问
    }
}
