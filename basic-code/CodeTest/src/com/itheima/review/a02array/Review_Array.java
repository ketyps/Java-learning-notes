package com.itheima.review.a02array;

import java.util.Arrays;

public class Review_Array {
    public static void main(String[] args) {
        /*
            一、一维数组
                1. 静态初始化: 数据类型[] 数组名 = {元素1, 元素2, ...};
                2. 动态初始化: 数据类型[] 数组名 = new 数据类型[长度];
                   (动态初始化有默认值: 整数 0, 小数 0.0, 布尔 false, 引用类型 null)
                3. 索引从 0 开始,数组名.length 获取长度
        */
        int[] arr1 = {5, 2, 8, 1, 9};               // 静态初始化
        int[] arr2 = new int[5];                     // 动态初始化,5 个元素默认都是 0
        arr2[0] = 10;                                // 通过索引赋值

        // 遍历数组(用 Arrays.toString 快速打印)
        System.out.println("arr1 = " + Arrays.toString(arr1));

        // 求数组最大值(经典写法)
        int max = arr1[0];
        for (int i = 1; i < arr1.length; i++) {
            if (arr1[i] > max) {
                max = arr1[i];
            }
        }
        System.out.println("最大值 = " + max);

        // 反转数组(双指针,原地交换)
        for (int left = 0, right = arr1.length - 1; left < right; left++, right--) {
            int temp = arr1[left];
            arr1[left] = arr1[right];
            arr1[right] = temp;
        }
        System.out.println("反转后 = " + Arrays.toString(arr1));

        /*
            二、二维数组 —— 本质是"数组中的数组"
        */
        int[][] matrix = {
                {1, 2, 3},
                {4, 5},
                {6, 7, 8, 9}
        };
        // 遍历二维数组: matrix[i] 是一维数组,matrix[i].length 是每行长度
        int total = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                total += matrix[i][j];
            }
        }
        System.out.println("二维数组所有元素和 = " + total);

        /*
            三、Arrays 工具类常用方法
                toString(arr)          数组转字符串
                sort(arr)              升序排序
                binarySearch(arr, key) 二分查找(数组必须有序),返回索引,找不到返回负数
                copyOf(arr, len)       复制数组(可扩展长度)
                fill(arr, val)         给数组填充指定值
                equals(a, b)           比较两个数组内容是否相同
        */
        Arrays.sort(arr1);
        System.out.println("排序后 = " + Arrays.toString(arr1));
        int index = Arrays.binarySearch(arr1, 8);
        System.out.println("8 的索引 = " + index);

        /*
            四、引用类型数组
                元素默认是 null,需要逐个 new 对象赋值
        */
        Student[] students = new Student[2];
        students[0] = new Student("张三", 18);
        students[1] = new Student("李四", 20);
        System.out.println(students[0].getName() + " " + students[0].getAge() + "岁");
    }
}

// 标准的 JavaBean 类(对象数组的元素类型)
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
}
