package com.itheima.ui;

import javax.swing.*;

public class LoginJFrame extends JFrame {
    //登录界面
    public LoginJFrame(){
        //在创建登录界面的时候,同时给这个界面去设置一些信息
        //比如,宽高,直接展示出来

        this.setSize(488,430);
        this.setVisible(true);
        //设置界面的标题
        this.setTitle("拼图单机版 v1.0");
        //设置界面置顶
        this.setAlwaysOnTop(true);
        //设置界面居中
        this.setLocationRelativeTo(null);
        //设置默认的关闭模式
        this.setDefaultCloseOperation(3);
        //界面显示
    }
}
