package com.itheima.test;

import java.util.ArrayList;

/*需求：
1，main方法中定义一个集合，存入三个用户对象。
用户属性为：id，username，password
2，要求：定义一个方法，根据id查找对应的用户信息。
如果存在，返回索引
如果不存在，返回-1
*/

public class Test7 {
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

        //在 main 方法中调用我们写好的方法进行测试
        int index1 = findIndexById(list, "heima002");
        System.out.println("heima002 的索引是: " + index1); // 预期输出: 1

        int index2 = findIndexById(list, "heima999");
        System.out.println("heima999 的索引是: " + index2); // 预期输出: -1
    }

    //根据 id 查找对应索引的方法
    public static int findIndexById(ArrayList<User> list, String id) {
        // 遍历集合
        for (int i = 0; i < list.size(); i++) {
            User user = list.get(i);
            // 字符串比较一定要用 .equals()
            if (user.getId().equals(id)) {
                return i; // 如果找到了，直接返回当前的索引 i
            }
        }
        return -1; // 如果循环结束还没找到，说明不存在，返回 -1
    }
}