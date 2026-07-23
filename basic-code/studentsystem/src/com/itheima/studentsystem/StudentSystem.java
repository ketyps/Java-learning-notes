package com.itheima.studentsystem;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentSystem {
    public static void main(String[] args) {
        // 独立启动入口
        Scanner sc = new Scanner(System.in);
        start(sc);
        sc.close();
    }

    // 启动学生管理系统（可被 App 调用）
    public static void start(Scanner sc) {
        ArrayList<Student> list = new ArrayList<>();
        loop:
        while (true) {
            System.out.println("----------欢迎来到黑马学生管理系统----------");
            System.out.println("1:添加学生");
            System.out.println("2:删除学生");
            System.out.println("3:修改学生");
            System.out.println("4:查询学生");
            System.out.println("5:退出");
            System.out.println("请输入您的选择： ");
            String choose = sc.next();
            switch (choose) {
                case "1" -> addStudent(list, sc);
                case "2" -> deleteStudent(list, sc);
                case "3" -> updateStudent(list, sc);
                case "4" -> queryStudent(list);
                case "5" -> {
                    System.out.println("退出");
                    System.out.println("返回上级菜单...");
                    return;
                }
                default -> System.out.println("没有这个选项");
            }
        }
    }

    //添加学生 (已加入查重逻辑)
    public static void addStudent(ArrayList<Student> list, Scanner sc){
        System.out.println("请输入学生的id");
        String id = sc.next();

        // 1. 新增查重步骤
        if (contains(list, id)) {
            System.out.println("添加失败！该 id 已存在，请勿重复添加。");
            return; // 遇到重复，直接结束方法，不再往下录入
        }

        // 2. 查重通过，继续录入其他信息
        Student s = new Student();
        s.setId(id);

        System.out.println("请输入学生的姓名");
        String name = sc.next();
        s.setName(name);

        System.out.println("请输入学生的年龄");
        int age = sc.nextInt();
        s.setAge(age);

        System.out.println("请输入学生的家庭住址");
        String address = sc.next();
        s.setAddress(address);

        // 3. 把学生对象添加到集合当中
        list.add(s);
        System.out.println("添加学生成功！");
    }

    // 删除学生
    public static void deleteStudent(ArrayList<Student> list, Scanner sc) {
        System.out.println("请输入要删除学生的 id");
        String id = sc.next();

        int index = getIndex(list, id);
        if (index == -1) {
            System.out.println("删除失败！该 id 对应的学生不存在。");
            return;
        }

        list.remove(index);
        System.out.println("学生删除成功！");
    }

    //修改学生
    public static void updateStudent(ArrayList<Student> list, Scanner sc) {
        System.out.println("请输入要修改的学生的id");
        String id = sc.next();

        int index = getIndex(list, id);

        if (index == -1) {
            System.out.println("要修改的id " + id + " 不存在，请重新输入");
            return;
        }

        //当代码执行到这里，表示当前id是存在的。
        //获取要修改的学生对象
        Student stu = list.get(index);

        //输入其他的信息并修改
        System.out.println("请输入要修改的学生姓名");
        String newName = sc.next();
        stu.setName(newName);

        System.out.println("请输入要修改的学生年龄");
        int newAge = sc.nextInt();
        stu.setAge(newAge);

        System.out.println("请输入要修改的学生家庭住址");
        String newAddress = sc.next();
        stu.setAddress(newAddress);

        System.out.println("学生信息修改成功");
    }

    //查询学生
    public static void queryStudent(ArrayList<Student> list){
        if(list.size() == 0){
            System.out.println("当前无学生信息，请添加后再查询");
            //结束方法
            return;
        }

        //打印表头信息
        System.out.println("id\t姓名\t年龄\t家庭住址");
        //当代码执行到这里，表示集合中是有数据的
        for (int i = 0; i < list.size(); i++) {
            Student stu = list.get(i);
            System.out.printf("%-8s\t%-8s\t%-5s\t%-20s%n", stu.getId(), stu.getName(), stu.getAge(), stu.getAddress());
        }
    }

    // 根据 id 判断集合中是否已存在该学生
    public static boolean contains(ArrayList<Student> list, String id) {
        for (int i = 0; i < list.size(); i++) {
            Student stu = list.get(i);
            // 这里的 id 是 String 类型，必须用 equals 对比
            if (stu.getId().equals(id)) {
                return true; // 发现相同的 id，返回 true
            }
        }
        return false; // 循环结束都没找到，返回 false
    }

    // 根据 id 获取学生对象在集合中的索引
    // 如果存在，返回索引；如果不存在，返回 -1
    public static int getIndex(ArrayList<Student> list, String id) {
        for (int i = 0; i < list.size(); i++) {
            Student stu = list.get(i);
            if (stu.getId().equals(id)) {
                return i;
            }
        }
        return -1; // 类似于 C 语言中返回 -1 表示未找到（哨兵值）
    }

}