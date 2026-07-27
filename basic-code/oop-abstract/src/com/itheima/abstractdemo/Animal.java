package com.itheima.abstractdemo;

/*
 * 抽象类 —— 使用 abstract 修饰的类
 *
 * 特点：
 *   1. 抽象类不能实例化（不能 new）
 *   2. 抽象类可以有构造方法（供子类通过 super 调用）
 *   3. 抽象类可以有成员变量和普通方法
 *   4. 抽象类中可以没有抽象方法，但有抽象方法的类必须是抽象类
 *   5. 子类必须重写所有抽象方法（除非子类也是抽象类）
 */
public abstract class Animal {
    private String name;
    private int age;

    public Animal() {
    }

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // 抽象方法 —— 只有声明，没有方法体
    // 强制子类根据自身特性实现具体行为
    public abstract void eat();
    public abstract void sleep();

    // 普通方法 —— 子类可以直接继承使用，也可以重写
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // 非抽象模板方法 —— 组合了抽象方法调用
    public void showInfo() {
        System.out.println("我叫" + name + "，今年" + age + "岁");
    }
}
