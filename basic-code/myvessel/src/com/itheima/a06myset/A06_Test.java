package com.itheima.a06myset;

import java.util.HashSet;
import java.util.Random;

public class A06_Test {
    public static void main(String[] args) {
        /*
            需求：
                编写一个程序，获取10个1~20之间的随机数，要求随机数不能重复，
                并把最终的随机数输出到控制台。

            分析：
                1.创建一个HashSet集合对象，用来存储10个不重复的随机数。
                2.利用Random生成随机数。
                3.把随机数添加到集合中。
                  HashSet的add方法，如果元素重复会添加失败返回false，利用这个特点刚好可以去重。
                4.判断集合的长度：长度不够10，就继续生成，够了就停止循环。
        */

        //1.创建集合对象（HashSet天然去重）
        HashSet<Integer> set = new HashSet<>();

        //2.创建随机数对象
        Random r = new Random();

        //3.循环生成随机数，添加到集合中，直到长度为10
        while (set.size() < 10) {
            int num = r.nextInt(20) + 1;//1~20之间的随机数
            set.add(num);//重复的会自动去重，添加失败不影响
        }

        //4.打印结果
        System.out.println(set);
    }
}
