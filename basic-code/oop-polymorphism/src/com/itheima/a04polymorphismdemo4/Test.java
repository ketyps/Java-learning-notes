package com.itheima.a04polymorphismdemo4;

// 5. 测试类
public class Test {
    public static void main(String[] args) {
        // 创建饲养员老王（30岁）
        Person wang = new Person("老王", 30);
        // 创建黑狗（2岁）
        Dog dog = new Dog(2, "黑");
        // 老王喂狗骨头
        wang.keepPet(dog, "骨头");

        System.out.println("==================");

        // 创建饲养员老李（25岁）
        Person li = new Person("老李", 25);
        // 创建灰猫（3岁）
        Cat cat = new Cat(3, "灰");
        // 老李喂猫鱼
        li.keepPet(cat, "鱼");
    }
}