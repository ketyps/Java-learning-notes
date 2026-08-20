package com.itheima.review.a05oop;

public class Review_Oop02_ExtendsPoly {
    public static void main(String[] args) {
        /*
            一、继承 extends
                - 子类 extends 父类,继承父类所有非私有成员(变量和方法)
                - Java 是单继承: 一个类只能有一个直接父类
                - 方法重写 @Override: 子类重写父类方法,要求方法签名一致、权限不能比父类更低
                - super: 访问父类的成员; 子类构造方法第一行会默认调用父类的无参构造 super()

            二、多态
                前提: 有继承 / 实现关系 + 方法重写 + 父类引用指向子类对象
                口诀: 编译看左边,运行看右边(针对方法)
                - 成员变量: 编译和运行都看左边(变量没有重写概念)
                - 向上转型: Animal a = new Dog();  (自动)
                - 向下转型: Dog d = (Dog) a;       (强制,有 ClassCastException 风险,先 instanceof 判断)
        */
        Animal animal = new Dog();     // 向上转型: 父类引用指向子类对象
        animal.eat();                  // 运行走 Dog 重写的 eat: 狗吃骨头

        // animal.bark();  // 编译报错: 父类引用看不到子类特有方法
        if (animal instanceof Dog dog) {   // JDK16+ instanceof 模式匹配,自动向下转型
            dog.bark();                    // 转型后才能调用子类特有方法
        }

        /*
            三、抽象类 abstract
                - abstract 修饰的类不能 new(不能创建对象)
                - abstract 修饰的方法没有方法体,叫抽象方法
                - 子类必须重写父类所有抽象方法(除非子类也是抽象类)
        */
        Circle circle = new Circle(2);
        circle.print();                // 面积 = 12.566...

        /*
            四、接口 interface
                - 接口是"规范 / 规则",用 implements 实现,可以多实现(逗号分隔)
                - 接口中的成员默认都是 public,变量默认是常量 public static final
                - JDK8+: 可以有 default 默认方法(可重写)和 static 静态方法
                - JDK9+: 可以有 private 私有方法
                - 接口引用指向实现类对象,也是一种多态
        */
        Flyable f = new Bird();        // 接口引用指向实现类对象
        f.fly();

        /*
            五、内部类(简述)
                按位置分: 成员内部类 / 局部内部类 / 静态内部类 / 匿名内部类
                匿名内部类: 本质是"继承父类或实现接口的匿名子类对象",用于简化一次性代码
                匿名内部类通常可以进一步用 Lambda 简化(见 a09)
        */
        Runnable r = new Runnable() {  // 匿名内部类
            @Override
            public void run() {
                System.out.println("匿名内部类跑起来了");
            }
        };
        r.run();
    }
}

// ---- 继承 ----
class Animal {
    public void eat() {
        System.out.println("动物在吃东西");
    }
}

class Dog extends Animal {
    @Override                       // 方法重写
    public void eat() {
        System.out.println("狗吃骨头");
    }

    public void bark() {            // 子类特有方法
        System.out.println("汪汪汪");
    }
}

// ---- 抽象类 ----
abstract class Shape {
    public abstract double area();  // 抽象方法,子类必须实现

    public void print() {
        System.out.println("面积 = " + area());
    }
}

class Circle extends Shape {
    private double r;

    public Circle(double r) {
        this.r = r;
    }

    @Override
    public double area() {
        return Math.PI * r * r;
    }
}

// ---- 接口 ----
interface Flyable {
    void fly();                     // 抽象方法

    default void takeoff() {        // 默认方法(JDK8+)
        System.out.println("起飞");
    }
}

class Bird implements Flyable {
    @Override
    public void fly() {
        System.out.println("鸟儿在天上飞");
    }
}
