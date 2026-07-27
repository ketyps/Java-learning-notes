package com.itheima.abstractdemo;

/*
 * 子类 Dog —— 必须重写（实现）父类的所有抽象方法
 */
public class Dog extends Animal {

    public Dog() {
    }

    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("狗(" + getName() + ") 在啃骨头");
    }

    @Override
    public void sleep() {
        System.out.println("狗(" + getName() + ") 在趴着睡觉");
    }

    // 子类独有的方法
    public void guard() {
        System.out.println("狗(" + getName() + ") 在看家护院");
    }
}
