package com.itheima.a04objectdemo;

public class ObjectDemo1 {
    public static void main(String[] args) {
        /*
            public String toString()                    返回对象的字符串表示形式
            public boolean equals(Object obj)           比较两个对象是否相等
            protected Object clone(int a)               对象克隆
        */

        //1.toString  返回对象的字符串表示形式
        Object obj = new Object();
        String str1 = obj.toString();
        System.out.println(str1);//java.lang.Object@119d7047

        Student stu = new Student("zhangsan",23);
        String str2 = stu.toString();
        System.out.println(str2);//com.itheima.a04objectdemo.Student@4eec7777

        //细节：
        //System:类名
        //out: 静态变量
        //System.out:获取打印的对象
        //println():方法
        //参数：表示打印的内容
        //核心逻辑：
        //当我们打印一个对象的时候，底层会调用对象的toString方法，把对象变成字符串。
        //然后再打印在控制台上，打印完毕换行处理。

        //思考：默认情况下，因为Object类中的toString方法返回的是地址值
        //所以，默认情况下，打印一个对象打印的就是地址值
        //但是地址值对于我们是没什么意义的？
        //我想要看到对象内部的属性值？我们该怎么办？
        //处理方案：重写父类
        System.out.println(stu);//com.itheima.a04objectdemo.Student@4eec7777
    }
}