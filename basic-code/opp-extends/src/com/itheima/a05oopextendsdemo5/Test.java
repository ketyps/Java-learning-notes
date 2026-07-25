package com.itheima.a05oopextendsdemo5;

public class Test {
    public static void main(String[] args) {
        Zi z = new Zi();
        z.show();
    }
}

class Fu {
    String name = "Fu";
    String hobby = "喝茶";
}

class Zi extends Fu {
    String name = "Zi";
    String game = "吃鸡";

    public void show() {
        //如何打印Zi (打印当前子类重名的成员变量 name)
        System.out.println(this.name);

        //如何打印Fu (打印父类被隐藏的成员变量 name)
        System.out.println(super.name);

        //如何打印喝茶 (打印继承自父类的 hobby，因为没有重名，直接用 hobby、this.hobby 或 super.hobby 都可以)
        System.out.println(hobby);
        // 或者 System.out.println(super.hobby);

        //如何打印吃鸡 (打印本类独有的成员变量 game)
        System.out.println(game);
        // 或者 System.out.println(this.game);
    }
}