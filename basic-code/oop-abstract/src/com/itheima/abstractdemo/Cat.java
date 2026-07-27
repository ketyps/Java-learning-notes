package com.itheima.abstractdemo;

/*
 * 子类 Cat —— 必须重写（实现）父类的所有抽象方法
 */
public class Cat extends Animal {

    public Cat() {
    }

    public Cat(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("猫(" + getName() + ") 在吃鱼");
    }

    @Override
    public void sleep() {
        System.out.println("猫(" + getName() + ") 在缩成一团睡觉");
    }
}
