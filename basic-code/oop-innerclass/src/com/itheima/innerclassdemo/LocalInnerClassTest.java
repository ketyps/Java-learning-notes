package com.itheima.innerclassdemo;

/*
 * 局部内部类（Local Inner Class）
 *
 * 定义位置：在方法内或代码块内
 *
 * 特点：
 *   1. 不能被访问修饰符修饰（public/private 等）
 *   2. 作用域仅限于所在的方法/代码块
 *   3. 可以访问外部类的所有成员（包括 private）
 *   4. JDK 8+ 访问局部变量时，变量是 effectively final（不能被修改）
 *   5. 编译后生成 Outer$1Inner.class 字节码文件
 */

// ========== 外部类 ==========
class OuterLocal {
    private String outerField = "外部类成员变量";

    public void method() {
        // 局部变量（JDK 8+ 自动视为 effectively final，不能被重新赋值）
        String localVar = "局部变量";

        // 局部内部类（定义在方法内部）
        class LocalInner {
            public void show() {
                // 可以访问外部类的成员
                System.out.println("访问外部类成员：" + outerField);
                // 可以访问方法中的局部变量
                System.out.println("访问局部变量：" + localVar);

                // localVar = "修改";    // ❌ 编译错误！局部变量必须是 effectively final
            }
        }

        // 在方法内部创建并使用局部内部类对象
        LocalInner inner = new LocalInner();
        inner.show();
    }

    // 另一个演示：局部内部类在代码块中
    public void blockMethod() {
        // 代码块
        {
            class BlockInner {
                public void print() {
                    System.out.println("我在代码块中定义的局部内部类");
                }
            }
            new BlockInner().print();
        }
        // new BlockInner().print();   // ❌ 编译错误！超出作用域
    }
}

// ========== 测试类 ==========
public class LocalInnerClassTest {
    public static void main(String[] args) {
        System.out.println("========== 局部内部类 ==========");

        OuterLocal outer = new OuterLocal();
        outer.method();

        System.out.println();
        outer.blockMethod();
    }
}
