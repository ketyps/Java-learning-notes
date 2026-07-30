package com.itheima.ui;

import javax.swing.*;

public class RegisterJFrame extends JFrame {
    //注册界面
    public RegisterJFrame(){
        this.setSize(480,500);
        //设置界面的标题
        this.setTitle("拼图单机版 v1.0");
        //设置界面置顶
        this.setAlwaysOnTop(true);
        //设置界面居中
        this.setLocationRelativeTo(null);
        //设置默认的关闭模式
        this.setDefaultCloseOperation(3);
        //界面显示
        this.setVisible(true);
    }
}
