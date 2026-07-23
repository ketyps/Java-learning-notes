package com.itheima.test;

import java.util.ArrayList;

/*需求：
1，main方法中定义一个集合，存入三个用户对象。
用户属性为：id，username，password
2，要求：定义一个方法，根据id查找对应的用户信息。
如果存在，返回true
如果不存在，返回false*/

public class Test6 {
    public static void main(String[] args) {
        //1. 创建集合
        ArrayList<User> list = new ArrayList<>();

        //2. 创建三个用户对象
        User u1 = new User("heima001", "zhangsan", "123456");
        User u2 = new User("heima002", "lisi", "12345678");
        User u3 = new User("heima003", "wangwu", "1234qwer");

        //3. 把用户对象添加到集合当中
        list.add(u1);
        list.add(u2);
        list.add(u3);

        //调用方法测试一下
        boolean result1 = containsUser(list, "heima002");
        System.out.println("heima002是否存在：" + result1); // 应该输出 true

        boolean result2 = containsUser(list, "heima007");
        System.out.println("heima007是否存在：" + result2); // 应该输出 false
    }

    //定义根据id查找用户信息的方法
    public static boolean containsUser(ArrayList<User> list, String id) {
        // 遍历集合
        for (int i = 0; i < list.size(); i++) {
            User user = list.get(i);
            // 注意：字符串比较必须用 equals，不能用 ==
            if (user.getId().equals(id)) {
                return true; // 找到了返回 true
            }
        }
        return false; // 循环结束还没找到，返回 false
    }
}