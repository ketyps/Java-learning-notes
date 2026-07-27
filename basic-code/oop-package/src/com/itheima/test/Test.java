package com.itheima.test;

import com.itheima.domain.Teacher;
// 注意：domain2 中的 Teacher 类名冲突，不能直接 import，只能使用全类名

public class Test {
    public static void main(String[] args) {
        /*
         * 包（package）的作用：
         * 1. 对类进行分类管理，类似于文件夹
         * 2. 解决同名类的冲突问题
         *
         * 使用类的两种方式：
         * 方式一：使用 import 导包，然后直接使用类名
         * 方式二：使用全类名（包名 + 类名）
         */

        System.out.println("========== 方式一：import 导包 ==========");
        // 通过 import 导入了 com.itheima.domain.Teacher
        Teacher t1 = new Teacher(30, "王老师");
        System.out.println(t1.getName() + ", " + t1.getAge());

        System.out.println("========== 方式二：全类名 ==========");
        // 当两个包中有同名类时，只能有一个用 import，另一个必须用全类名
        com.itheima.domain2.Teacher t2 = new com.itheima.domain2.Teacher();
        t2.setName("李老师");
        t2.setAge(28);
        System.out.println(t2.getName() + ", " + t2.getAge());

        System.out.println("========== 同包下的类 ==========");
        // Student 和 Test 在同一个包 com.itheima.test 下，无需导包
        Student s = new Student(23, "张三");
        System.out.println(s.getName() + ", " + s.getAge());
    }
}