package com.itheima.a10oopextendsdemo10;

public class Cook extends Employee {

    public Cook() {
    }

    public Cook(String id, String name, double salary) {
        super(id, name, salary);
    }

    // 成员方法重写
    @Override
    public void work() {
        System.out.println("炒菜");
    }

    @Override
    public void eat() {
        System.out.println("吃米饭");
    }
}