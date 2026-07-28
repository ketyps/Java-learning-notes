package com.itheima.innerclassdemo;

/*
 * 匿名内部类（Anonymous Inner Class）
 *
 * 本质：继承某个类或实现某个接口的匿名子类对象
 *
 * 特点：
 *   1. 没有类名（所以叫匿名）
 *   2. 必须继承一个父类或实现一个接口
 *   3. 只能创建一个实例
 *   4. 适合只需要使用一次的场合
 *   5. 编译后生成 Outer$1.class、Outer$2.class 等字节码文件
 *
 * 格式：
 *   new 父类/接口() {
 *       重写方法
 *   };
 *
 * 使用场景：
 *   1. 事件监听（如 GUI 编程中的按钮点击）
 *   2. 线程创建（Runnable）
 *   3. 方法参数传参（简化代码）
 */

// ========== 接口和抽象类 ==========
interface IEat {
    void eat();
}

abstract class Animal {
    public abstract void run();
    public void breathe() {
        System.out.println("动物需要呼吸");
    }
}

// ========== 测试类 ==========
public class AnonymousInnerClassTest {
    public static void main(String[] args) {
        System.out.println("========== 匿名内部类 ==========");
        System.out.println();

        // ─── 场景1：实现接口 ───
        System.out.println("--- 实现接口的匿名内部类 ---");
        IEat eat = new IEat() {
            @Override
            public void eat() {
                System.out.println("匿名内部类：在吃美食");
            }
        };
        eat.eat();

        System.out.println();

        // ─── 场景2：继承抽象类 ───
        System.out.println("--- 继承抽象类的匿名内部类 ---");
        Animal animal = new Animal() {
            @Override
            public void run() {
                System.out.println("匿名内部类：在奔跑");
            }
        };
        animal.run();
        animal.breathe();       // 继承的普通方法

        System.out.println();

        // ─── 场景3：作为方法参数（最常用） ───
        System.out.println("--- 匿名内部类作为方法参数 ---");

        // 传统方式：先定义类再传入
        System.out.println("传统方式：");
        showEat(new DogEat());

        // 匿名内部类方式：直接传入
        System.out.println("匿名内部类方式：");
        showEat(new IEat() {
            @Override
            public void eat() {
                System.out.println("参数中的匿名内部类：在吃零食");
            }
        });

        System.out.println();

        // ─── 场景4：简化代码（一次性使用） ───
        System.out.println("--- 一次性使用的匿名内部类 ---");
        new Animal() {
            @Override
            public void run() {
                System.out.println("一次性匿名对象：跑完就消失");
            }
        }.run();

        System.out.println();
        System.out.println("========== 匿名内部类注意事项 ==========");
        System.out.println("1. 匿名内部类没有构造方法（因为没有类名）");
        System.out.println("2. 只能重写父类/接口的方法，不能定义新方法");
        System.out.println("3. 适合一次性使用的场景");
        System.out.println("4. 在 Lambda 表达式出现后，单方法接口常用 Lambda 替代");
    }

    // 接收接口参数的方法
    public static void showEat(IEat e) {
        e.eat();
    }
}

// 传统方式：定义一个类实现接口
class DogEat implements IEat {
    @Override
    public void eat() {
        System.out.println("实现类：狗在吃骨头");
    }
}
