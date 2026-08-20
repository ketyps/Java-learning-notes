package com.itheima.review.a05oop;

public class Test1_Zoo {
    public static void main(String[] args) {
        /*
            题目：设计一个"动物园"体系,并演示多态
            要求:
                1. 抽象类 ZooAnimal: 含 private 字段 name,构造方法,抽象方法 eat()
                2. ZooDog / ZooCat 继承 ZooAnimal,重写 eat()
                3. 接口 ZooSkill(只有一个抽象方法),ZooCat 实现它
                4. 用父类引用指向子类对象,调用 eat();再向下转型调用特有方法

            补全下方的类定义后,运行 main 预期输出:
                小狗在啃骨头
                小猫在吃鱼
                小猫在爬树
        */

        ZooAnimal dog = new ZooDog("旺财");   // 向上转型
        dog.eat();                            // 运行走子类重写的 eat()

        ZooAnimal cat = new ZooCat("咪咪");
        cat.eat();

        if (cat instanceof ZooSkill skill) {  // 向下转型后调用接口方法
            skill.climb();
        }
    }
}

// ================= 下方待补全 =================

abstract class ZooAnimal {
    // TODO: 1. private String name 字段
    // TODO: 2. 构造方法,接收 name 并赋值
    // TODO: 3. public String getName()
    // TODO: 4. 抽象方法 public abstract void eat();
}

class ZooDog extends ZooAnimal {
    // TODO: 构造方法,调用 super(name)
    // TODO: 重写 eat(),打印 name + " 在啃骨头"
}

class ZooCat extends ZooAnimal implements ZooSkill {
    // TODO: 构造方法,调用 super(name)
    // TODO: 重写 eat(),打印 name + " 在吃鱼"
    // TODO: 实现 climb(),打印 name + " 在爬树"
}

interface ZooSkill {
    // TODO: 抽象方法 void climb();
}
