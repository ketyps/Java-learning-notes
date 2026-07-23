package com.itheima.studentsystem;

public class Student {
    // 1. 根据 queryStudent 方法调用，必须包含这四个属性
    private String id;
    private String name;
    private int age;
    private String address;

    // 2. 空参构造方法
    public Student() {
    }

    // 3. 全参构造方法
    public Student(String id, String name, int age, String address) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.address = address;
    }

    // 4. 根据 queryStudent 方法调用，必须提供的 Getter 和 Setter 方法
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}