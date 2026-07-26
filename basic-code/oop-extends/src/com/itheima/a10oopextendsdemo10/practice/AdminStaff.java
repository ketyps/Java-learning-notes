package com.itheima.a10oopextendsdemo10.practice;

public class AdminStaff extends Employee {
    public AdminStaff() {
    }

    public AdminStaff(String id, String name) {
        super(id, name);
    }

    @Override
    public void work() {
        System.out.println("管理员正在工作");
    }
}
