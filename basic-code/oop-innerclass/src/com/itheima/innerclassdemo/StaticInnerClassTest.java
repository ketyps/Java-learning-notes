package com.itheima.innerclassdemo;

/*
 * 静态内部类（Static Nested Class / 静态嵌套类）
 *
 * 定义位置：用 static 修饰的成员内部类
 *
 * 特点：
 *   1. 不需要外部类实例就能创建（不依赖外部类对象）
 *   2. 只能访问外部类的静态成员（不能直接访问非静态成员）
 *   3. 可以定义静态成员（普通内部类不能定义静态成员）
 *   4. 创建格式：new 外部类名.内部类名()
 *
 * 适用场景：
 *   1. 内部类不需要访问外部类的实例成员
 *   2. 作为外部类的辅助类，逻辑上归属于外部类
 *   3. 例如：HashMap 中的 Node 内部类、Integer 中的 IntegerCache
 */

// ========== 外部类 ==========
class OuterStatic {
    private int num = 10;               // 非静态成员
    private static String msg = "外部类的静态成员";

    // 静态内部类
    public static class Inner {
        // 静态内部类可以定义静态成员
        public static int count = 0;
        private String info = "静态内部类的成员变量";

        public void show() {
            // System.out.println(num);  // ❌ 编译错误！不能直接访问外部类的非静态成员
            System.out.println("访问外部类的静态成员 msg = " + msg);  // ✅ 可以访问静态成员
            System.out.println("访问内部类的成员 info = " + info);
            System.out.println("访问内部类的静态成员 count = " + count);
        }

        // 静态内部类可以定义静态方法
        public static void staticMethod() {
            System.out.println("静态内部类中的静态方法，count = " + count);
        }
    }

    // 外部类方法：访问静态内部类
    public void accessInner() {
        Inner inner = new Inner();
        inner.show();
    }
}

// ========== 测试类 ==========
public class StaticInnerClassTest {
    public static void main(String[] args) {
        System.out.println("========== 静态内部类 ==========");
        System.out.println();

        // 创建静态内部类对象：不需要外部类对象
        System.out.println("--- 直接创建静态内部类对象 ---");
        OuterStatic.Inner inner = new OuterStatic.Inner();
        inner.show();

        System.out.println();

        // 调用静态内部类的静态方法
        System.out.println("--- 调用静态内部类的静态方法 ---");
        OuterStatic.Inner.staticMethod();

        System.out.println();

        // 访问静态内部类的静态变量
        System.out.println("--- 访问静态内部类的静态变量 ---");
        System.out.println("OuterStatic.Inner.count = " + OuterStatic.Inner.count);

        System.out.println();

        // 通过外部类方法间接访问
        System.out.println("--- 外部类访问静态内部类 ---");
        new OuterStatic().accessInner();

        System.out.println();
        System.out.println("========== 四种内部类对比 ==========");
        System.out.println("成员内部类   → 依赖外部类对象，可以访问外部类全部成员");
        System.out.println("静态内部类   → 不依赖外部类对象，只能访问外部类静态成员");
        System.out.println("局部内部类   → 定义在方法内，作用域仅限于方法");
        System.out.println("匿名内部类   → 没有类名，一次性使用，常用于简化代码");
    }
}
