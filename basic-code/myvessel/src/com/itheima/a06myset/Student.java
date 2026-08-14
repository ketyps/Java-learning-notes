package com.itheima.a06myset;

import java.util.Objects;

public class Student implements Comparable<Student> {
    private String name;
    private int age;


    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    /**
     * 获取
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     * @return age
     */
    public int getAge() {
        return age;
    }

    /**
     * 设置
     * @param age
     */
    public void setAge(int age) {
        this.age = age;
    }

    //重写equals和hashCode：保证HashSet等集合能正确判断两个学生是否为同一个
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    //重写compareTo方法，指定自然排序规则
    //规则：先按照年龄的升序排列，如果年龄一样，再按照姓名的字母顺序排列
    @Override
    public int compareTo(Student o) {
        //this:表示当前要添加的元素
        //o:表示已经在红黑树中存在的元素
        int result = this.age - o.age;//年龄升序
        result = result == 0 ? this.name.compareTo(o.name) : result;//年龄一样，按照姓名升序
        return result;
    }

    public String toString() {
        return "Student{name = " + name + ", age = " + age + "}";
    }
}
