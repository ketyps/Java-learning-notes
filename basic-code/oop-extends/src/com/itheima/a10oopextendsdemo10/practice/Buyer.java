package com.itheima.a10oopextendsdemo10.practice;

public class Buyer extends AdminStaff {
    public Buyer() {
    }

    public Buyer(String id, String name) {
        super(id, name);
    }

    @Override
    public void work() {
        System.out.println("采购员正在采购商品");
    }

}
