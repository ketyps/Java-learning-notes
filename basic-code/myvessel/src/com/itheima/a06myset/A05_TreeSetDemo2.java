package com.itheima.a06myset;

import java.util.Comparator;
import java.util.TreeSet;

public class A05_TreeSetDemo2 {
    public static void main(String[] args) {
        /*
            TreeSet自定义排序规则的两种方式：
                方式一：自然排序
                    让Javabean类实现Comparable接口，重写compareTo方法。
                方式二：比较器排序
                    在创建TreeSet对象时，使用带参构造传入Comparator对象，指定排序规则。

            注意点：
                如果使用空参构造创建TreeSet对象，默认使用自然排序。
                如果使用带参构造传入Comparator对象，优先使用比较器排序（就近原则）。
        */

        //方式一：自然排序
        //Student类实现了Comparable接口，排序规则：年龄升序，年龄相同时按姓名升序
        TreeSet<Student> ts1 = new TreeSet<>();
        ts1.add(new Student("zhangsan", 23));
        ts1.add(new Student("lisi", 24));
        ts1.add(new Student("wangwu", 25));
        ts1.add(new Student("zhaoliu", 23));//年龄与zhangsan相同，比较姓名
        System.out.println(ts1);


        //方式二：比较器排序（匿名内部类）
        //排序规则：年龄降序，年龄相同时按姓名升序
        TreeSet<Student> ts2 = new TreeSet<>(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                //o1:表示当前要添加的元素
                //o2:表示已经在红黑树中存在的元素
                int result = o2.getAge() - o1.getAge();//年龄降序
                result = result == 0 ? o1.getName().compareTo(o2.getName()) : result;//年龄相同时，按姓名升序
                return result;
            }
        });
        ts2.add(new Student("zhangsan", 23));
        ts2.add(new Student("lisi", 24));
        ts2.add(new Student("wangwu", 25));
        ts2.add(new Student("zhaoliu", 23));
        System.out.println(ts2);
    }
}
