package com.itheima.modifier;

/*
 * 同包下的测试类
 * 可以访问 public / protected / default
 * 不能访问 private
 */
public class Test {
    public static void main(String[] args) {
        System.out.println("========== 权限修饰符演示 ==========");
        System.out.println();

        // 1. 同包测试类直接访问 Fu
        System.out.println("--- 同包测试类直访问 Fu 对象 ---");
        Fu fu = new Fu();

        fu.publicMethod();          // ✅ public —— 任意位置
        fu.protectedMethod();       // ✅ protected —— 同包
        fu.defaultMethod();         // ✅ default —— 同包
        // fu.privateMethod();      // ❌ 编译错误！private 仅本类可见

        System.out.println();
        System.out.println("--- 通过本类的 public 方法间接调用 private ---");
        fu.showAll();               // ✅ 间接调用，实际执行了内部全部四种方法

        System.out.println();
        System.out.println("--- 同包子类 Zi 继承访问测试 ---");
        Zi zi = new Zi();
        zi.testAccess();

        System.out.println();
        System.out.println("========== 总结 ==========");
        System.out.println("  public    → 任意位置均可访问");
        System.out.println("  protected → 同包 + 不同包子类可访问");
        System.out.println("  default   → 仅同包可访问");
        System.out.println("  private   → 仅本类可访问");
    }
}
