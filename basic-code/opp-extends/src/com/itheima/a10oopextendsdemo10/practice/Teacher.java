package com.itheima.a10oopextendsdemo10.practice;

public class Teacher extends Employee {
    public Teacher() {
    }

    public Teacher(String id, String name) {
        super(id, name);
    }

    @Override
    public void work() {
        System.out.println("老师正在讲课");
    }
}
