package com.itheima.review.a06collection;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Test3_StudentSort {
    public static void main(String[] args) {
        /*
            题目：学生对象集合按成绩降序排序
            数据: 张三80, 李四95, 王五70
            预期输出顺序: 李四95, 张三80, 王五70
            提示:
                - Collections.sort(list, comparator) 传入自定义比较器
                - 降序: o2.getScore() - o1.getScore(),或用 Comparator.comparingInt(...).reversed()
                - 比较的是对象的 getScore(),不能用默认排序(对象没有实现 Comparable)
        */

        List<Student> students = new ArrayList<>();
        students.add(new Student("张三", 80));
        students.add(new Student("李四", 95));
        students.add(new Student("王五", 70));

        // TODO: 按成绩降序排序

        // TODO: 打印排序后的结果(调用 toString,期望: [李四=95, 张三=80, 王五=70])

    }
}

class Student {
    private String name;
    private int score;

    public Student(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }

    @Override
    public String toString() {
        return name + "=" + score;
    }
}
