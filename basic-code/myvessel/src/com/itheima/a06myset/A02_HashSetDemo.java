package com.itheima.a06myset;

import java.util.HashSet;

public class A02_HashSetDemo {
    public static void main(String[] args) {
        /*
            哈希值：
                就是一个int类型的数值，由Object类中的hashCode方法计算出来的。

            哈希值的两个特点：
                1.如果没有重写hashCode方法，不同对象计算出来的哈希值是不同的（默认跟地址值有关）。
                2.如果已经重写hashCode方法，那么不同对象只要属性相同，计算出来的哈希值就是一样的。
                3.小部分情况下，不同对象计算出来的哈希值也有可能一样，这种现象叫哈希碰撞。


            HashSet集合的底层原理：
                HashSet集合底层采用哈希表结构存储数据，存储数据的时候依赖两个方法：
                    hashCode方法：计算出元素应该存放在哪个位置
                    equals方法：判断两个元素是否重复

                添加数据时的流程：
                    1.计算出当前元素的哈希值，确定存放的位置
                    2.如果该位置没有元素，直接存入
                    3.如果该位置有元素，调用equals方法比较两个元素的属性
                       属性相同：认为元素重复，添加失败，返回false
                       属性不同：发生哈希碰撞，新元素挂到该位置后面（链表化，节点数多时还会红黑树化）
        */

        //1.哈希值演示
        //因为Student类重写了hashCode方法，所以属性相同的两个对象，哈希值是一样的
        /*Student s1 = new Student("zhangsan", 23);
        Student s2 = new Student("zhangsan", 23);
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());*/


        //2.验证HashSet对自定义对象的去重
        //创建三个学生对象
        Student s1 = new Student("zhangsan", 23);
        Student s2 = new Student("lisi", 24);
        Student s3 = new Student("zhangsan", 23);//属性与s1相同

        //创建集合并添加学生对象
        HashSet<Student> set = new HashSet<>();
        System.out.println(set.add(s1));//true，添加成功
        System.out.println(set.add(s2));//true，添加成功
        System.out.println(set.add(s3));//false，属性相同，认为是同一个学生，添加失败

        //打印集合，只存入了两个学生
        System.out.println(set);
    }
}
