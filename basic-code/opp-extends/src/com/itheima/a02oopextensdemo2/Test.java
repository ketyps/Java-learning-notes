package com.itheima.a02oopextensdemo2;

public class Test {
    public static void main(String[] args) {
        // 利用空参构造创建子类对象
        Zi z1 = new Zi();
        // 利用带参构造创建子类对象
        Zi z2 = new Zi("zhangsan", 23);
    }
}

class Fu {
    String name;
    int age;

    public Fu() {
        // 空参构造
    }

    public Fu(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

class Zi extends Fu {
    // 空参构造
    public Zi() {
        super(); // 默认调用父类空参构造
    }

    // 带参构造
    public Zi(String name, int age) {
        super(name, age); // 调用父类带参构造
    }
}