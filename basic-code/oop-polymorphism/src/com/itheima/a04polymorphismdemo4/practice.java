package com.itheima.a04polymorphismdemo4;

// 1. 父类 Animal（普通类，提供默认 eat 实现）
class Animal {
    private int age;
    private String color;

    public Animal() {}

    public Animal(int age, String color) {
        this.age = age;
        this.color = color;
    }

    public int getAge() { return age; }
    public void setAge(int age) { this.age = age; }
    public String getColor() { return color; }
    public void setColor(String color) { this.color = color; }

    // 父类默认吃方法，子类可重写
    public void eat(String something) {
        System.out.println("动物正在吃" + something);
    }
}

// 2. 狗类
class Dog extends Animal {
    public Dog() {}

    public Dog(int age, String color) {
        super(age, color);
    }

    @Override
    public void eat(String something) {
        System.out.println(getAge() + "岁的" + getColor() + "的狗两只前腿死死的抱住" + something + "猛吃");
    }

    // 特有方法：看家
    public void lookHome() {
        System.out.println("狗正在看家");
    }
}

// 3. 猫类
class Cat extends Animal {
    public Cat() {}

    public Cat(int age, String color) {
        super(age, color);
    }

    @Override
    public void eat(String something) {
        System.out.println(getAge() + "岁的" + getColor() + "的猫眯着眼睛倒着头吃" + something);
    }

    // 特有方法：逮老鼠
    public void catchMouse() {
        System.out.println("猫正在抓老鼠");
    }
}

// 4. 饲养员 Person 类
class Person {
    private String name;
    private int age;

    public Person() {}

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public int getAge() { return age; }
    public void setAge(int age) { this.age = age; }

    // 简化的 keepPet 方法，使用多态接收 Animal 子类
    public void keepPet(Animal animal, String something) {
        // 判断具体类型，用于输出动物名称（也可通过 getClass().getSimpleName() 获取）
        String animalType = (animal instanceof Dog) ? "狗" : "猫";
        System.out.println("年龄为" + this.age + "岁的" + this.name + "养了一只"
                + animal.getColor() + "颜色的" + animal.getAge() + "岁的" + animalType);
        // 多态调用 eat（实际执行子类重写的方法）
        animal.eat(something);

        // 思考题②：调用子类特有方法（向下转型）
        if (animal instanceof Dog) {
            ((Dog) animal).lookHome();
        } else if (animal instanceof Cat) {
            ((Cat) animal).catchMouse();
        }
    }
}