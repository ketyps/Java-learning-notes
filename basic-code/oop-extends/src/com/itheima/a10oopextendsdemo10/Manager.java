package com.itheima.a10oopextendsdemo10;

public class Manager extends Employee {
    // 成员变量：额外增加管理奖金
    private double bonus;

    public Manager() {
    }

    public Manager(String id, String name, double salary, double bonus) {
        super(id, name, salary); // 调用父类的全参构造
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    // 成员方法重写
    @Override
    public void work() {
        System.out.println("管理其他人");
    }

    @Override
    public void eat() {
        System.out.println("吃米饭");
    }
}