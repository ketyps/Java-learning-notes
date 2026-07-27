package com.itheima.test;

/*
 * final 关键字 —— 最终的，不可改变的
 *
 * 用法：
 *   1. final 修饰变量：该变量变成常量，只能被赋值一次
 *   2. final 修饰方法：该方法成为最终方法，不能被重写（override）
 *   3. final 修饰类：该类成为最终类，不能被继承（extends）
 */
public class Test {
    public static void main(String[] args) {
        System.out.println("========== final 修饰变量 ==========");
        // 局部变量被 final 修饰 —— 变成常量
        final int NUM = 10;        // 基本类型常量
        // num = 20;               // 编译错误！常量不能被二次赋值
        System.out.println("NUM = " + NUM);

        final double PI = 3.14159;
        System.out.println("PI = " + PI);
        // PI = 3.14;              // 编译错误！

        System.out.println("========== final 修饰引用类型 ==========");
        // final 修饰引用类型 —— 地址值不能变，但对象内容可以变
        final Student stu = new Student("小明", 18);
        // stu = new Student("小红", 20);   // 编译错误！不能修改地址值
        stu.setName("小明改了名");          // 内容可以修改
        stu.setAge(19);
        System.out.println(stu.getName() + ", " + stu.getAge());

        System.out.println("========== final 修饰成员变量 ==========");
        // final 修饰的成员变量必须在定义时赋值，或者在构造方法中赋值
        // 详见 FinalStudent 类
        FinalStudent fs = new FinalStudent("李华", 20);
        System.out.println(fs.getName() + ", " + fs.getAge());

        System.out.println("========== final 修饰方法 ==========");
        // 被 final 修饰的方法，子类不能重写
        // 详见 Fu / Zi 类
        Zi zi = new Zi();
        zi.show();          // 父类的 final 方法
        zi.show2();         // 子类自己的方法

        System.out.println("========== final 修饰类 ==========");
        // 被 final 修饰的类，不能被继承
        // 详见 FinalClass（不能被继承）
        FinalClass fc = new FinalClass();
        fc.method();
        // class SubClass extends FinalClass {}   // 编译错误！
    }
}
