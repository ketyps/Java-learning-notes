package com.itheima.a10oopextendsdemo10.practice;

public class Employee {
    // 公司每一个员工都有一个员工编号,姓名,和其负责的工作内容
    // 每种员工都有一个工作方法,每个员工的工作内容不同,所以工作方法也不同

    private String id;
    private String name;

    public Employee() {
    }

    public Employee(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void work() {
        System.out.println("员工正在工作");
    }

}
