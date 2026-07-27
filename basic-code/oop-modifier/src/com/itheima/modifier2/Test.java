package com.itheima.modifier2;

import com.itheima.modifier.Fu;

/*
 * 不同包下的测试类
 * 只能访问 public
 * protected / default / private 均不可访问
 */
public class Test {
    public static void main(String[] args) {
        System.out.println("========== 跨包访问权限测试 ==========");
        System.out.println("(com.itheima.modifier2.Test 访问 com.itheima.modifier.Fu)");
        System.out.println();

        Fu fu = new Fu();

        fu.publicMethod();          // ✅ public —— 任意位置

        // fu.protectedMethod();    // ❌ 编译错误！不同包且非子类
        // fu.defaultMethod();      // ❌ 编译错误！不同包
        // fu.privateMethod();      // ❌ 编译错误！仅本类可见
    }
}
