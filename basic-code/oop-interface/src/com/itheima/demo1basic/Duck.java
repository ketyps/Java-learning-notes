package com.itheima.demo1basic;

/*
 * 鸭子 —— 多实现（同时实现 Swim 和 Fly）
 *
 * 一个类可以实现多个接口，接口之间用逗号分隔
 * 必须重写所有接口中的所有抽象方法
 */
public class Duck implements Swim, Fly {
    private String name;

    public Duck(String name) {
        this.name = name;
    }

    @Override
    public void swim() {
        System.out.println("鸭子(" + name + ") 在水面上游泳");
    }

    @Override
    public void fly() {
        System.out.println("鸭子(" + name + ") 扑腾翅膀低空飞行");
    }
}
