package com.itheima.test2;

public class GirlFriendTest {
    public static void main(String[] args) {
        GirlFriend gf1 = new GirlFriend();
        //赋值
        gf1.setName("小美");
        gf1.setAge(18);
        gf1.setGender("女");

        System.out.println(gf1.getName());
        System.out.println(gf1.getAge());
        System.out.println(gf1.getGender());

        gf1.eat();
        gf1.sleep();

//        System.out.println("=================");
//        GirlFriend gf2 = new GirlFriend();
//        gf2.name = "大美";
//        gf2.age = 19;
//        gf2.gender = "萌妹子";
//
//        System.out.println(gf2.name);
//        System.out.println(gf2.age);
//        System.out.println(gf2.gender);
//
//        gf2.eat();
//        gf2.sleep();
    }
}
