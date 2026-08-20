package com.itheima.review.a05oop;

public class Review_Oop01_ClassObject {
    public static void main(String[] args) {
        /*
            一、类与对象
                类: 对一类事物的抽象描述(成员变量 + 成员方法)
                对象: 类的具体实例,用 new 关键字创建
        */
        Cat c = new Cat("汤姆", 2, "灰色");
        c.eat();                    // 调用成员方法
        c.sleep();
        System.out.println(c.getName() + " " + c.getAge() + "岁 " + c.getColor());

        /*
            二、封装
                - 成员变量用 private 私有化(外部不能直接访问)
                - 对外提供公共的 getter / setter 方法
                - 好处: 隐藏实现细节,提高数据安全性,可以在 setter 里加校验

            三、构造方法
                - 方法名与类名相同,没有返回值类型
                - 作用: 创建对象时初始化成员变量
                - 如果没写,系统默认给一个无参构造
                - 一旦写了任意构造方法,无参构造不再自动生成,需要自己补写
                - 构造方法可以重载(无参 / 全参)

            四、this 关键字
                this 表示"当前调用方法的那个对象"
                最常用: 区分成员变量和局部变量同名的情况(如 this.name = name)

            五、static(静态)
                - static 修饰的成员属于"类",被所有对象共享
                - 通过 类名.静态成员 访问,不依赖对象
                - 静态方法里只能访问静态成员;普通方法里静态非静态都能访问
        */
        Student.totalStudents = 50;     // 静态变量: 类名访问
        Student.showCount();            // 静态方法: 类名访问

        // Student.totalStudents = 100; // 所有对象共享同一个 totalStudents

        /*
            六、标准 JavaBean 规范(写实体类时要遵守)
                1. 成员变量 private 私有
                2. 提供无参构造 + 全参构造
                3. 每个成员变量提供 getter / setter
        */
    }
}

// 示例类: 封装 + 构造方法 + this
class Cat {
    private String name;
    private int age;
    private String color;

    // 全参构造(用 this 区分成员变量和参数)
    public Cat(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }

    public void eat() {
        System.out.println(name + " 在吃鱼");
    }

    public void sleep() {
        System.out.println(name + " 在睡觉");
    }

    // getter / setter
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
        if (age < 0) {
            System.out.println("年龄不能为负数!");
            return;
        }
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}

// 演示 static 的类
class Student {
    private String name;
    private int age;
    public static int totalStudents;     // 静态变量,属于类,被所有对象共享

    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static void showCount() {     // 静态方法
        System.out.println("当前学生总数 = " + totalStudents);
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
}
