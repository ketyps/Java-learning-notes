package com.itheima.studentsystem;

import com.sun.source.tree.ContinueTree;

import javax.sound.midi.Soundbank;
import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        ArrayList<User> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("欢迎来到学生管理系统");
            System.out.println("请选择操作: 1登录 2注册 3忘记密码 4退出");
            String choose = sc.next();
            switch (choose) {
                case "1" -> login(list);
                case "2" -> register(list);
                case "3" -> forgetPassword(list);
                case "4" -> {
                    System.out.println("谢谢使用,再见");
                    System.exit(0);
                }
                default -> System.out.println("没有这个选项");
            }
        }
    }

    private static void login(ArrayList<User> list) {
        System.out.println("登录");
    }

    private static void register(ArrayList<User> list) {
        //1. 键盘录入用户名
        Scanner sc = new Scanner(System.in);
        String username;
        while (true) {
            System.out.println("请输入用户名");
            username = sc.next();
            //开发细节：先验证格式是否正确，再验证是否唯一
            //      因为在以后所有的数据，都是存在数据库中，如果我们要校验，需要使用到网络资源。
            boolean flag1 = checkUsername(username);
            if (!flag1) {
                System.out.println("用户名格式不满足条件，需要重新输入");
                continue;
            }

            //校验用户名唯一
            //username到集合中判断是否有存在
            boolean flag2 = contains(list, username);
            if (flag2) {
                //用户名已存在,那么当前用户名无法注册,需要重新输入
                System.out.println("用户名" + username + "已存在,请重新输入");
            } else {
                //不存在,表示当前用户名可用,可以继续录入下面的其它数据
                System.out.println("用户名" + username + "可用");
                break;
            }
        }

        //2.键盘录入密码
        //密码键盘输入两次,两次一致才可以进行注册
        String password;
        while (true) {
            System.out.println("请输入要注册的密码");
            password = sc.next();
            System.out.println("请再次输入要注册的密码");
            String againPassword = sc.next();
            if (!password.equals(againPassword)) {
                System.out.println("两次密码输入不一致,请重新输入");
                continue;
            } else {
                System.out.println("两次密一致,继续录入其它数据");
                break;
            }
        }

        //3.键盘录入身份证号码
        String personID;
        while (true) {
            System.out.println("请输入身份证号码");
            personID = sc.next();
            boolean flag = checkPersonID(personID);
            if (flag) {
                System.out.println("身份证号码满足要求");
                break;
            } else {
                System.out.println("身份证号码格式有误,请重新输入");
                continue;
            }
        }

        //4.键盘录入手机号码
        String phoneNumber;
        while (true) {
            System.out.println("请输入手机号码");
            phoneNumber = sc.next();
            boolean flag = checkPhoneNumber(phoneNumber);
            if (flag) {
                System.out.println("手机号码格式正确");
                break;
            } else {
                System.out.println("手机号码格式有误,请重新输入");
                continue;
            }
        }

        //用户名，密码，身份证号码，手机号码放到用户对象中
        User u=new User(username,password,personID,phoneNumber);
        //把用户对象添加到集合中
        list.add(u);
        System.out.println("注册成功");

        //遍历集合
        printlist(list);
    }

    private static void printlist(ArrayList<User> list) {
        for (int i = 0; i < list.size(); i++) {
            //i索引
            User user =list.get(i);
            System.out.println(user.getUsername()+","+user.getPassword()+","
                    +user.getPersonID()+","+user.getPhoneNumber());
        }
    }

    private static boolean checkPhoneNumber(String phoneNumber) {
        //长度为11位
        if (phoneNumber.length() != 11) {
            return false;
        }
        //不能以0开头
        if (phoneNumber.startsWith("0")) {
            return false;
        }
        //必须都是数字
        for (int i = 0; i < phoneNumber.length(); i++) {
            char c = phoneNumber.charAt(i);
            if (!(c >= '0' && c <= '9')) {
                return false;
            }
        }
        //当循环结束之后,表示每一个字符都在0-9之间
        return true;
    }

    private static boolean checkPersonID(String personID) {
        //长度为18位
        if (personID.length() != 18) {
            return false;
        }
        //不能以0开头
        if (personID.startsWith("0")) {
            //如果以0开头,那么返回false
            return false;
        }
        //前17位,必须都是数字
        for (int i = 0; i < personID.length() - 1; i++) {
            char c = personID.charAt(i);
            //如果有一个字符不在0-9之间,那么直接返回false
            if (!(c >= '0' && c <= '9')) {
                return false;
            }
        }
        //最后一位可以是数字,也可以是大写X或小写x
        char endChar = personID.charAt(personID.length() - 1);
        if ((endChar >= '0' && endChar <= '9') || (endChar == 'x') || (endChar == 'X')) {
            return true;
        } else return false;
    }

    private static boolean contains(ArrayList<User> list, String username) {
        //循环遍历集合得到每一个用户对象
        //拿着用户对象中的用户名进行比较
        for (int i = 0; i < list.size(); i++) {
            //i索引
            User user = list.get(i);
            String rightUsername = user.getUsername();
            if (rightUsername.equals(username)) {
                return true;
            }
        }
        //当循环结束了,表示集合里面所有的用户都比较完了,还没有一样的,则返回false
        return false;
    }

    private static boolean checkUsername(String username) {
        //用户名长度必须在3~15位之间
        int len = username.length();
        if (len < 3 || len > 15) {
            return false;
        }
        //当代码执行到这里,表示用户名长度是符合要求的.
        //继续校验:只能是字母加数字的组合，但是不能是纯数字
        //循环的大username里面的每一个字符,如果有一个字符不是字母或者数字,,那么就返回false
        for (int i = 0; i < username.length(); i++) {
            //i 索引
            char c = username.charAt(i);
            if (!((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z') || (c >= '0' && c <= '9'))) {
                return false;
            }
        }
        //当代码执行到这里表示用户名满足两个要求:1长度满足 2内容也满足(字母+数字)
        //但不能是纯数字
        //统计在用户名中,有多少个字母就可以了
        int count = 0;
        for (int i = 0; i < username.length(); i++) {
            //i索引
            char c = username.charAt(i);
            if ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')) {
                count++;
                break;
            }
        }
        return count > 0;
    }

    private static void forgetPassword(ArrayList<User> list) {
        System.out.println("忘记密码");
    }
}
