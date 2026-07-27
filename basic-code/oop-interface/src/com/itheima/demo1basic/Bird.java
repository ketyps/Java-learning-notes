package com.itheima.demo1basic;

/*
 * 鸟 —— 单实现（只实现 Fly）
 */
public class Bird implements Fly {
    private String name;

    public Bird(String name) {
        this.name = name;
    }

    @Override
    public void fly() {
        System.out.println("小鸟(" + name + ") 在天空中自由飞翔");
    }

    // 子类独有方法
    public void sing() {
        System.out.println("小鸟(" + name + ") 在快乐地唱歌");
    }
}
