package com.itheima.a10oopextendsdemo10.practice;

public class Lecturer extends Teacher {
    public Lecturer() {
    }

    public Lecturer(String id, String name) {
        super(id, name);
    }

    @Override
    public void work() {
        System.out.println("讲师正在讲课");
    }
}
