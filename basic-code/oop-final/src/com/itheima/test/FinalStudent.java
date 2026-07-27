package com.itheima.test;

/*
 * final 修饰成员变量：
 *   - 必须在定义时直接赋值，或在构造方法中赋值
 *   - 一旦赋值后不能再修改
 */
public class FinalStudent {
    // 方式一：直接赋值
    private final String country = "中国";

    // 方式二：通过构造方法赋值（每个构造方法都要赋值）
    private final String name;
    private final int age;

    // 构造方法中对 final 变量赋值
    public FinalStudent(String name, int age) {
        this.name = name;
        this.age = age;
        // this.name = "其他";   // 编译错误！final 变量只能赋值一次
    }

    // 如果没有给 name 和 age 赋值，下面这个构造方法会编译错误
    // public FinalStudent() {   // 编译错误！必须给 final 变量赋值
    // }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getCountry() {
        return country;
    }
}
