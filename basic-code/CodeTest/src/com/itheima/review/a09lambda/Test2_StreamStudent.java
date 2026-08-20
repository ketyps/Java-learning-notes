package com.itheima.review.a09lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Test2_StreamStudent {
    public static void main(String[] args) {
        /*
            题目：对学生集合做 Stream 操作
            学生: 张三18, 李四25, 王五20, 赵六18, 钱七25
            步骤:
                1. filter 筛选年龄 >= 20 的
                2. sorted 按年龄升序排序
                3. limit 取前 2 个
                4. map 只取姓名
                5. collect 收集成 List 打印
            预期输出: [王五, 李四]
            (年龄>=20: 李四25 王五20 钱七25 -> 升序: 王五20 李四25 钱七25 -> 取前2)
            提示: sorted 按年龄排序需要传比较器,如 Comparator.comparingInt(Student::getAge)
        */

        List<Student> students = new ArrayList<>(List.of(
                new Student("张三", 18),
                new Student("李四", 25),
                new Student("王五", 20),
                new Student("赵六", 18),
                new Student("钱七", 25)
        ));

        // TODO: 用 Stream 实现 筛选 -> 排序 -> limit -> map -> collect,并打印

    }
}

class Student {
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return name + "(" + age + ")";
    }
}
