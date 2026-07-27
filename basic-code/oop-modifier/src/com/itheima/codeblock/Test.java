package com.itheima.codeblock;

/*
 * 代码块（Code Block）：
 *
 *   1. 静态代码块   static { }
 *       - 类加载时执行，且只执行一次
 *       - 优先于 main 方法和对象的创建
 *       - 用于初始化静态变量、加载驱动等
 *
 *   2. 构造代码块（实例代码块）  { }
 *       - 每次创建对象时执行
 *       - 优先于构造方法执行
 *       - 多个构造方法共用的初始化代码可以放在这里
 *
 *   3. 局部代码块  { } 在方法内部
 *       - 限定变量生命周期，节省内存
 *       - 变量的作用域只在局部代码块内
 *
 *   ⚠️ 执行顺序：
 *       静态代码块（类加载时，仅一次）
 *         ↓
 *       构造代码块（每次 new 对象时）
 *         ↓
 *       构造方法
 */
public class Test {
    public static void main(String[] args) {
        System.out.println("========== 1. 局部代码块 ==========");
        // 局部代码块：限制变量的作用域
        {
            int a = 10;
            System.out.println("局部代码块内 a = " + a);
        }
        // System.out.println(a);    // ❌ 编译错误！a 已超出作用域

        int a = 20;     // 可以重新定义同名变量
        System.out.println("局部代码块外 a = " + a);

        System.out.println();
        System.out.println("========== 2. 静态代码块 & 构造代码块 ==========");
        System.out.println("第一次创建对象：");
        Student s1 = new Student();

        System.out.println();   // 空行分隔输出

        System.out.println("第二次创建对象：");
        Student s2 = new Student("张三");

        System.out.println();
        System.out.println("第三次创建对象：");
        Student s3 = new Student();
    }
}

class Student {
    private String name;
    private static String school = "清华大学";

    // 1. 静态代码块 —— 类加载时执行一次
    static {
        System.out.println("  [静态代码块] Student 类被加载时执行（仅此一次）");
        // 静态代码块中只能访问静态成员
        System.out.println("  [静态代码块] school = " + school);
    }

    // 2. 构造代码块 —— 每次创建对象时执行，优先于构造方法
    {
        System.out.println("  [构造代码块] 每次 new 都执行，优先于构造方法");
        // 构造代码块中可以访问成员变量
        if (name == null) {
            name = "默认姓名";
        }
    }

    public Student() {
        System.out.println("  [构造方法] Student() 无参构造执行");
        System.out.println("  name = " + name);
    }

    public Student(String name) {
        this.name = name;
        System.out.println("  [构造方法] Student(String) 有参构造执行");
        System.out.println("  name = " + name);
    }
}
