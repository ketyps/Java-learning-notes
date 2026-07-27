package com.itheima.abstractdemo;

/*
 * 抽象类和抽象方法的综合演示
 *
 * 抽象类使用场景：
 *   当一个父类知道子类必须有某个行为，但无法确定具体实现时，
 *   就将该方法定义为抽象方法，强制子类提供实现。
 *
 * 例如：所有动物都会吃和睡，但每种动物的吃睡方式不同
 */
public class Test {
    public static void main(String[] args) {
        System.out.println("========== 抽象类不能直接实例化 ==========");
        // Animal a = new Animal();     // ❌ 编译错误！抽象类不能实例化
        System.out.println("  (抽象类不能 new，只能通过子类实例化)");

        System.out.println();
        System.out.println("========== 多态方式创建（父类引用指向子类对象） ==========");
        Animal a1 = new Cat("小花", 2);
        Animal a2 = new Dog("旺财", 3);

        System.out.println("--- 猫的行为 ---");
        a1.eat();       // 实际执行 Cat 的 eat()
        a1.sleep();     // 实际执行 Cat 的 sleep()
        a1.showInfo();  // 模板方法（非抽象，可直接使用）
        // a1 是 Animal 类型，不能调用 Cat 特有的方法

        System.out.println();
        System.out.println("--- 狗的行为 ---");
        a2.eat();
        a2.sleep();
        a2.showInfo();

        System.out.println();
        System.out.println("========== 子类特有方法调用 ==========");
        // 向下转型才能调用子类特有方法
        Dog dog = (Dog) a2;
        dog.guard();

        System.out.println();
        System.out.println("========== 模板方法设计模式演示 ==========");
        // 使用同一个抽象父类引用，调用相同方法名，获得不同行为
        Animal[] animals = {
            new Cat("橘猫", 1),
            new Dog("哈士奇", 2),
            new Cat("布偶", 3),
            new Dog("金毛", 4)
        };
        for (Animal animal : animals) {
            animal.showInfo();
            animal.eat();
            animal.sleep();
            System.out.println("---");
        }
    }
}
