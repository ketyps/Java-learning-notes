package com.itheima.demo1basic;

/*
 * 接口 —— 游泳能力
 *
 * 接口定义使用 interface 关键字
 * 接口中的成员变量默认是 public static final（常量）
 * 接口中的成员方法默认是 public abstract（抽象方法）
 */
public interface Swim {

    // 常量（默认 public static final）
    String NAME = "游泳接口";

    // 抽象方法（默认 public abstract）
    void swim();
}
