package com.itheima.a10oopextendsdemo10.practice;

public class Maintainer extends AdminStaff {
    public Maintainer() {
    }

    public Maintainer(String id, String name) {
        super(id, name);
    }

    @Override
    public void work() {
        System.out.println("维护员正在维护公司");
    }
}
