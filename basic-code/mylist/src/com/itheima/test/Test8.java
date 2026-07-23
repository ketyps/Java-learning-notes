package com.itheima.test;

import java.util.ArrayList;

public class Test8 {
    public static void main(String[] args) {
        //1. 创建集合对象
        ArrayList<Phone> list = new ArrayList<>();

        //2. 创建三个手机对象，并按需求添加进集合
        Phone p1 = new Phone("小米", 1000);
        Phone p2 = new Phone("苹果", 8000);
        Phone p3 = new Phone("锤子", 2999);

        list.add(p1);
        list.add(p2);
        list.add(p3);

        //3. 调用方法获取价格低于3000的手机
        ArrayList<Phone> cheapPhones = getPriceBelow(list, 3000);

        //4. 遍历打印返回的结果
        System.out.println("价格低于3000的手机有：");
        for (int i = 0; i < cheapPhones.size(); i++) {
            Phone p = cheapPhones.get(i);
            System.out.println(p.getBrand() + " : " + p.getPrice() + "元");
        }
    }

    //定义一个方法，将价格低于传入 limitPrice 的手机信息返回
    public static ArrayList<Phone> getPriceBelow(ArrayList<Phone> list, int limitPrice) {
        // 注意：因为符合条件的手机可能有多个，所以返回值必须是一个新的集合
        ArrayList<Phone> resultList = new ArrayList<>();

        // 遍历传入的集合
        for (int i = 0; i < list.size(); i++) {
            Phone phone = list.get(i);
            // 符合条件，加到新集合里
            if (phone.getPrice() < limitPrice) {
                resultList.add(phone);
            }
        }
        // 把存有低价手机的新集合返回
        return resultList;
    }
}