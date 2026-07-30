package com.itheima.ui;

import javax.swing.*;
import java.util.Date;
import java.util.Random;

public class GameJFrame extends JFrame {
    //定义一个一维数组
    //管理数据,加载图片的时候会根据二维数据中的数据进行加载
    int[][] resultArr;

    public GameJFrame() {
        //初始化界面
        initJFrame();

        //初始化菜单
        initJMenubar();

        //初始化数据
        initData();

        //初始化图片
        initImage();

        //界面显示  加载完上面的设置才展示界面
        this.setVisible(true);
    }

    //初始化数据
    private void initData() {
        //1.定义一个一维数组（图片编号为 1~16）
        int[] tempArr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16};

        //2.打乱数组中的数据顺序（只打乱前15个，第16个保持原位）
        Random r = new Random();
        for (int i = 0; i < tempArr.length - 1; i++) {
            //获取到随机索引（只在前15个范围内交换，确保第16个不动）
            int index = r.nextInt(tempArr.length - 1);
            //拿着遍历到的每一个数据，跟随机索引上的数据进行交换
            int temp = tempArr[i];
            tempArr[i] = tempArr[index];
            tempArr[index] = temp;
        }

        //3.创建一个二维数组，按照 4 个一组的方式（总长 16，即 4x4）
        this.resultArr = new int[4][4];

        //4.将一维数组的数据添加到二维数组中
        for (int i = 0; i < tempArr.length; i++) {
            // 行索引 = 当前元素索引 / 4
            // 列索引 = 当前元素索引 % 4
            this.resultArr[i / 4][i % 4] = tempArr[i];
        }
    }

    //初始化图片
    //添加图片的时候就需要按照二维数组中管理的数据添加图片
    private void initImage() {
        //创建内外循环添加16张图片
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                int num = resultArr[i][j];
                //创建一个图片ImageIcon的对象
                ImageIcon icon1 = new ImageIcon("E:\\Code\\Java-learning-notes\\basic-code\\puzzlegame\\image\\animal\\animal3\\" + num + ".jpg");
                //创建一个JLabel的对象(管理容器)
                JLabel jLabel = new JLabel(icon1);
                //指定图片位置
                jLabel.setBounds(105 * j, 105 * i, 105, 105);
                //this.add(jLabel1);
                //ContentPane和this(当前JFrame对象)不一样,是一个特殊容器,管理整个界面中的所有的组件,ContentPane是JFrame类里的一个方法,所以要用JFrame对象调用,也就是this.getContentPane()
                this.getContentPane().add(jLabel);
            }
        }
    }

    private void initJMenubar() {
        //创建整个菜单对象
        JMenuBar jMenuBar = new JMenuBar();

        //创建菜单上面的两个选项的对象 (功能  关于我们)
        JMenu functionJMenu = new JMenu("功能");
        JMenu aboutJeMenu = new JMenu("关于我们");

        //创建选项下的条目对象
        JMenuItem replayItem = new JMenuItem("重新游戏");
        JMenuItem reLoginItem = new JMenuItem("重新登录");
        JMenuItem closeItem = new JMenuItem("关闭游戏");
        JMenuItem accountItem = new JMenuItem("公众号");

        //将每一个选项下面的条目添加到选项当中
        functionJMenu.add(replayItem);
        functionJMenu.add(reLoginItem);
        functionJMenu.add(closeItem);
        aboutJeMenu.add(accountItem);

        //将菜单里面的两个选项添加到菜单当中
        jMenuBar.add(functionJMenu);
        jMenuBar.add(aboutJeMenu);

        //给整个界面设置菜单
        this.setJMenuBar(jMenuBar);
    }

    private void initJFrame() {
        //设置界面的宽高
        this.setSize(603, 680);
        //设置界面的标题
        this.setTitle("拼图单机版 v1.0");
        //设置界面置顶
        this.setAlwaysOnTop(true);
        //设置界面居中
        this.setLocationRelativeTo(null);
        //设置默认的关闭模式
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        //取消默认居中放置,只有取消了才会按照XY轴的形式添加组件
        this.setLayout(null);
    }
}
