package com.itheima.review.a08generic;

import java.util.Arrays;
import java.util.List;

public class Review_Generic {
    public static void main(String[] args) {
        /*
            一、为什么用泛型
                泛型: 编写代码时不确定类型,使用时才确定类型
                好处: 编译期就做类型检查,取出时不需要强转,避免 ClassCastException
                (不使用泛型的集合,存进去的都当作 Object,取出必须强转,容易出错)

            二、泛型类
                定义: class 类名<T> { ... }   T 是类型占位符(常用 T/E/K/V)
                创建: 类名<Integer> obj = new 类名<>();   (JDK7+ 后面可以省略泛型,写成 <>)
        */
        Box<Integer> box = new Box<>();
        box.set(100);
        System.out.println(box.get() + 1);   // 101,取出直接能当 Integer 用,不用强转

        /*
            三、泛型方法
                语法: 修饰符 <T> 返回值类型 方法名(T 参数) { }
                注意 <T> 要写在返回值类型前面
        */
        Integer[] nums = {1, 2, 3};
        ArrayUtil.swap(nums, 0, 2);
        System.out.println(Arrays.toString(nums));   // [3, 2, 1]

        String[] strs = {"a", "b"};
        ArrayUtil.swap(strs, 0, 1);
        System.out.println(Arrays.toString(strs));   // [b, a]  同一个方法处理不同类型

        /*
            四、泛型接口
                语法: interface 接口名<T> { }
                实现类可以指定类型: class Xxx implements 接口名<Integer>
                或继续泛型化:      class Xxx<T> implements 接口名<T>

            五、通配符 ?
                ? 表示"不确定的类型"
                ? extends 类  上限: 只能是该类或它的子类(只能读,不能写)
                ? super 类    下限: 只能是该类或它的父类
        */
        List<Integer> intList = List.of(1, 2, 3);
        List<? extends Number> numList = intList;   // Integer 是 Number 的子类,可以赋值
        System.out.println(numList);                // 只能读取
        // numList.add(4);                          // 编译报错: 上限通配符不能添加元素

        /*
            六、泛型擦除
                泛型只在编译期有效,运行时会被"擦除"成 Object(或上限类型)
                所以: 不能创建泛型数组 new T[]、不能 new T()、不能用到具体类型的 instanceof
        */
    }
}

// 泛型类: 一个可以装任意类型值的"盒子"
class Box<T> {
    private T value;

    public void set(T value) {
        this.value = value;
    }

    public T get() {
        return value;
    }
}

// 泛型方法工具类: 交换数组中任意两个位置的元素
class ArrayUtil {
    public static <T> void swap(T[] arr, int i, int j) {
        T temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
