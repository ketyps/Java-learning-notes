package com.itheima.innerclassdemo;

/*
 * 成员内部类（Member Inner Class）
 *
 * 定义位置：在外部类的成员位置（与成员变量、成员方法平级）
 *
 * 特点：
 *   1. 可以被 private / protected / default / public 修饰
 *   2. 可以访问外部类的所有成员（包括 private）
 *   3. 外部类要访问内部类成员，必须创建内部类对象
 *   4. 编译后生成 Outer$Inner.class 字节码文件
 *
 * 创建内部类对象的格式：
 *   外部类名.内部类名 变量名 = new 外部类().new 内部类();
 *
 * 当内部类成员和外部类成员同名时：
 *   外部类名.this.成员名  → 访问外部类成员
 *   this.成员名           → 访问内部类成员
 */

// ========== 外部类 ==========
class OuterMember {
    private int num = 10;
    private static String msg = "外部类的静态成员";

    // 成员内部类
    public class Inner {
        private int num = 20;       // 与外部类成员同名

        public void show() {
            int num = 30;           // 局部变量

            System.out.println("局部变量 num = " + num);                // 30
            System.out.println("内部类成员 num = " + this.num);         // 20
            System.out.println("外部类成员 num = " + OuterMember.this.num); // 10（同名时用 外部类名.this 区分）
            System.out.println("内部类访问外部类 private 成员 msg = " + msg);
        }
    }

    // 外部类方法：通过内部类对象访问内部类成员
    public void accessInner() {
        Inner inner = new Inner();
        System.out.println("外部类通过内部类对象访问内部类成员：" + inner.num);
    }
}

// ========== 测试类 ==========
public class MemberInnerClassTest {
    public static void main(String[] args) {
        System.out.println("========== 成员内部类 ==========");

        // 方式一：通过外部类对象创建内部类对象
        OuterMember outer = new OuterMember();
        OuterMember.Inner inner1 = outer.new Inner();
        inner1.show();

        System.out.println();

        // 方式二：连写（一步创建）
        OuterMember.Inner inner2 = new OuterMember().new Inner();
        inner2.show();

        System.out.println();

        // 外部类方法间接访问内部类
        outer.accessInner();
    }
}
