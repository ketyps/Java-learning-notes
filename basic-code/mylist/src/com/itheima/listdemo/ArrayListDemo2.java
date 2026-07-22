package com.itheima.listdemo;

import java.util.ArrayList;

public class ArrayListDemo2 {
    public static void main(String[] args) {
        //1. 创建集合对象
        ArrayList<String> list = new ArrayList<>();

        // 2. boolean add(E e) : 添加元素
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
        System.out.println("添加元素后的集合: " + list); // [aaa, bbb, ccc]

        // 3. int size() : 获取集合的长度
        int size = list.size();
        System.out.println("集合的长度为: " + size); // 3

        // 4. E get(int index) : 查询指定索引处的元素
        String str = list.get(1);
        System.out.println("索引为1的元素是: " + str); // bbb

        // 5. E set(int index, E e) : 修改指定索引处的元素 (返回被覆盖的旧元素)
        String oldValue = list.set(1, "ddd");
        System.out.println("被修改的旧元素是: " + oldValue); // bbb
        System.out.println("修改后的集合: " + list); // [aaa, ddd, ccc]

        // 6. boolean remove(E e) : 根据元素内容删除 (返回是否删除成功)
        boolean isRemoved = list.remove("aaa");
        System.out.println("是否删除成功: " + isRemoved); // true
        System.out.println("根据内容删除后的集合: " + list); // [ddd, ccc]

        // 7. E remove(int index) : 根据索引删除 (返回被删除的元素)
        String removedElement = list.remove(0);
        System.out.println("被索引删除的元素是: " + removedElement); // ddd
        System.out.println("根据索引删除后的集合: " + list); // [ccc]
    }
}