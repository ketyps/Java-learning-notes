package com.itheima.review.a03method;

public class Review_Method {
    public static void main(String[] args) {
        /*
            一、方法的定义与调用
                语法: 修饰符 返回值类型 方法名(参数列表) { 方法体 }
                - 返回值类型 void 表示没有返回值
                - 方法定义在类中,通过方法名调用
        */
        int result = add(3, 5);          // 有返回值的方法
        System.out.println("3 + 5 = " + result);

        printLine();                     // 无返回值无参数的方法
        printName("张三", 3);

        /*
            二、方法重载(Overload)
                同一个类中,方法名相同、参数列表不同(个数 / 类型 / 顺序),与返回值无关
                调用时会根据参数自动匹配对应的方法
        */
        System.out.println("sum(1, 2) = " + sum(1, 2));
        System.out.println("sum(1, 2, 3) = " + sum(1, 2, 3));
        System.out.println("sum(1.5, 2.5) = " + sum(1.5, 2.5));

        /*
            三、参数传递
                - 基本数据类型传的是"值",方法内修改不影响外面的变量
                - 引用数据类型(数组 / 对象)传的是"地址",方法内修改会影响外面的对象
        */
        int num = 10;
        changeInt(num);
        System.out.println("方法外 num = " + num);      // 仍然是 10

        int[] arr = {1, 2, 3};
        changeArr(arr);
        System.out.println("方法外 arr[0] = " + arr[0]);  // 变成了 100

        /*
            四、递归
                方法自己调用自己。必须有一个"出口"(终止条件),否则会栈溢出 StackOverflowError
                递归三要素: 出口条件 + 重复调用 + 向出口靠近
        */
        System.out.println("5 的阶乘 = " + factorial(5));   // 120
    }

    // 有返回值的方法
    private static int add(int a, int b) {
        return a + b;
    }

    // 无返回值的方法
    private static void printLine() {
        System.out.println("------------------");
    }

    private static void printName(String name, int times) {
        for (int i = 0; i < times; i++) {
            System.out.println(name);
        }
    }

    // ---- 方法重载(3 个 sum) ----
    private static int sum(int a, int b) {
        return a + b;
    }

    private static int sum(int a, int b, int c) {
        return a + b + c;
    }

    private static double sum(double a, double b) {
        return a + b;
    }

    // ---- 值传递: 修改的是局部变量的副本 ----
    private static void changeInt(int x) {
        x = 100;
    }

    // ---- 引用传递: 修改的是地址指向的对象 ----
    private static void changeArr(int[] a) {
        a[0] = 100;
    }

    // ---- 递归求阶乘: n! = n * (n-1)!, 1! = 1 ----
    private static int factorial(int n) {
        if (n == 1) {           // 出口
            return 1;
        }
        return n * factorial(n - 1);   // 向出口靠近
    }
}
