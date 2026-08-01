package com.itheima.ui;

import javax.swing.*;
import javax.swing.border.BevelBorder;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Date;
import java.util.Random;

/*
1.实现切换其它拼图图片的功能
JMenuItem可以继续嵌套JMenuItem,这样就可以实现多级菜单的效果,
就在JMenuItem选择其它图片的时候,把path路径修改为其它图片的路径,
然后重新加载图片即可
2.实现登录注册页面的功能
*/ 

public class GameJFrame extends JFrame implements KeyListener, ActionListener {
    //继承两个接口,一个是键盘监听事件,一个是菜单条目点击事件
    //定义一个一维数组,管理数据,加载图片的时候会根据二维数据中的数据进行加载
    int[][] resultArr;

    //定义一个变量保存路径
    String path = randomImageSelector();

    //记录空白方块在二维数组中的编号
    int x = 0;
    int y = 0;

    //定义变量统计步数
    int step = 0;

    //创建选项下的条目对象
    JMenuItem replayItem = new JMenuItem("重新游戏");
    JMenuItem reLoginItem = new JMenuItem("重新登录");
    JMenuItem closeItem = new JMenuItem("关闭游戏");
    JMenuItem accountItem = new JMenuItem("公众号");
    JMenu otherImagesJMenu = new JMenu("更多图片");
    JMenuItem animalImagesItem = new JMenuItem("动物");
    JMenuItem sportsImagesItem = new JMenuItem("运动");
    JMenuItem girlImagesItem = new JMenuItem("美女");

    //定义一个二维数组，存储正确的数据
    int[][] win = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 0}
    };

    //以上对象都是成员变量，成员变量的作用域是整个类中都可以使用

    //GameJFrame的无参构造方法,App创建游戏界面对象的时候,就会调用这个方法
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
        //定义一个一维数组（图片编号为 0~15,0 表示空白）
        int[] tempArr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 0};

        Random r = new Random();
        for (int i = 0; i < tempArr.length; i++) {
            int index = r.nextInt(tempArr.length);
            //拿着遍历到的每一个数据，跟随机索引上的数据进行交换
            int temp = tempArr[i];
            tempArr[i] = tempArr[index];
            tempArr[index] = temp;
        }

        this.resultArr = new int[4][4];

        for (int i = 0; i < tempArr.length; i++) {
            // 行索引 = 当前元素索引 / 4
            // 列索引 = 当前元素索引 % 4
            if (tempArr[i] == 0) {
                x = i / 4;
                y = i % 4;
            }
            this.resultArr[i / 4][i % 4] = tempArr[i];
        }
    }

    //初始化图片
    private void initImage() {
        //清空原本已经存在的图片
        this.getContentPane().removeAll();

        //显示当前的步数
        JLabel stepCount = new JLabel("步数:" + step);
        stepCount.setBounds(50, 30, 100, 20);
        this.getContentPane().add(stepCount);

        //如果游戏胜利，把胜利图标放在最前面添加，这样它才会显示在所有图片的最上层
        if (victory()) {
            JLabel winJLabel = new JLabel(new ImageIcon("puzzlegame\\image\\win.png"));
            winJLabel.setBounds(203, 283, 197, 73);
            this.getContentPane().add(winJLabel);
        }

        //创建内外循环添加16张图片
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                int num = resultArr[i][j];
                //创建一个图片ImageIcon的对象
                ImageIcon icon = new ImageIcon(path + num + ".jpg");
                //创建一个JLabel的对象(管理容器)
                JLabel jLabel = new JLabel(icon);
                //指定图片位置
                jLabel.setBounds(105 * j + 83, 105 * i + 134, 105, 105);
                //给图片添加边框
                jLabel.setBorder(new BevelBorder(BevelBorder.RAISED));

                //this.add(jLabel1);
                //ContentPane和this(当前JFrame对象)不一样,是一个特殊容器,管理整个界面中的所有的组件,ContentPane是JFrame类里的一个方法,所以要用JFrame对象调用,也就是this.getContentPane()
                this.getContentPane().add(jLabel);
            }
        }

        //添加背景图片
        JLabel background = new JLabel(new ImageIcon("puzzlegame\\image\\background.png"));
        //调整背景图片所在容器的参数
        background.setBounds(40, 40, 508, 560);
        //把背景图片添加到界面当中
        this.getContentPane().add(background);

        //刷新界面
        this.getContentPane().repaint();
    }

    //初始化菜单
    private void initJMenubar() {
        //创建整个菜单对象
        JMenuBar jMenuBar = new JMenuBar();

        //创建菜单上面的两个选项的对象 (功能  关于我们)
        JMenu functionJMenu = new JMenu("功能");
        JMenu aboutJeMenu = new JMenu("关于我们");

        //将每一个选项下面的条目添加到选项当中
        functionJMenu.add(replayItem);
        functionJMenu.add(reLoginItem);
        functionJMenu.add(closeItem);
        functionJMenu.add(otherImagesJMenu);
        aboutJeMenu.add(accountItem);
        otherImagesJMenu.add(animalImagesItem);
        otherImagesJMenu.add(sportsImagesItem);
        otherImagesJMenu.add(girlImagesItem);

        //给条目绑定事件监听
        replayItem.addActionListener(this);
        reLoginItem.addActionListener(this);
        closeItem.addActionListener(this);
        accountItem.addActionListener(this);
        animalImagesItem.addActionListener(this);
        sportsImagesItem.addActionListener(this);
        girlImagesItem.addActionListener(this);

        //将菜单里面的两个选项添加到菜单当中
        jMenuBar.add(functionJMenu);
        jMenuBar.add(aboutJeMenu);

        //给整个界面设置菜单
        this.setJMenuBar(jMenuBar);
    }

    //初始化界面
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
        //给整个界面添加键盘监听事件
        this.addKeyListener(this);
    }

    //键盘按下松开都会触发的事件
    @Override
    public void keyTyped(KeyEvent e) {

    }

    //按下不松时会调用这个方法
    @Override
    public void keyPressed(KeyEvent e) {

        //判断游戏是否胜利，如果胜利，此方法需要直接结束，不能再执行下面的移动代码了
        if (victory()) {
            //结束方法
            return;
        }

        int code = e.getKeyCode();
        if (code == KeyEvent.VK_A) {
            //把界面中所有的图片全部删除
            this.getContentPane().removeAll();
            //加载第一张完整的图片
            JLabel all = new JLabel(new ImageIcon(path + "all.jpg"));
            all.setBounds(83, 134, 420, 420);
            this.getContentPane().add(all);
            //创建和加载背景图片
            JLabel background = new JLabel(new ImageIcon("puzzlegame\\image\\background.png"));
            background.setBounds(40, 40, 508, 560);
            //把背景图片添加到界面当中
            this.getContentPane().add(background);
            //刷新界面
            this.getContentPane().repaint();
        }
    }

    //松开按键时会调用这个方法
    @Override
    public void keyReleased(KeyEvent e) {

        //判断游戏是否胜利，如果胜利，此方法需要直接结束，不能再执行下面的移动代码了
        if (victory()) {
            //结束方法
            return;
        }

        //对上下左右判断
        int code = e.getKeyCode();
        if (code == KeyEvent.VK_LEFT) {
            System.out.println("向左移动");
            //逻辑：
            //把空白方块右方的数字往左移动
            //边界检查：空白方块在最右边一列（y == 3）时无法左移，什么都不做
            if (y < 3) {
                resultArr[x][y] = resultArr[x][y + 1];
                resultArr[x][y + 1] = 0;
                y++;
                //调用方法按照最新的数字加载图片
                this.step++;
                initImage();
            }
        } else if (code == KeyEvent.VK_UP) {
            System.out.println("向上移动");
            //逻辑：
            //把空白方块下方的数字往上移动
            //x，y  表示空白方块
            //x + 1，y 表示空白方块下方的数字
            //把空白方块下方的数字赋值给空白方块
            //边界检查：空白方块在最下面一行（x == 3）时无法上移，什么都不做
            if (x < 3) {
                resultArr[x][y] = resultArr[x + 1][y];
                resultArr[x + 1][y] = 0;
                x++;
                //调用方法按照最新的数字重载图片
                this.step++;
                initImage();
            }
        } else if (code == KeyEvent.VK_RIGHT) {
            System.out.println("向右移动");
            //逻辑：
            //把空白方块左方的数字往右移动
            //边界检查：空白方块在最左边一列（y == 0）时无法右移，什么都不做
            if (y > 0) {
                resultArr[x][y] = resultArr[x][y - 1];
                resultArr[x][y - 1] = 0;
                y--;
                //调用方法按照最新的数字加载图片
                this.step++;
                initImage();
            }
        } else if (code == KeyEvent.VK_DOWN) {
            System.out.println("向下移动");
            //逻辑：
            //把空白方块上方的数字往下移动
            //边界检查：空白方块在最上面一行（x == 0）时无法下移，什么都不做
            if (x > 0) {
                resultArr[x][y] = resultArr[x - 1][y];
                resultArr[x - 1][y] = 0;
                x--;
                //调用方法按照最新的数字加载图片
                this.step++;
                initImage();
            }
        } else if (code == KeyEvent.VK_A) {
            //松开A键时,重载游戏时的界面
            this.initImage();
        } else if (code == KeyEvent.VK_W) {
            //按下W键时,直接胜利
            resultArr = new int[][]{
                    {1, 2, 3, 4},
                    {5, 6, 7, 8},
                    {9, 10, 11, 12},
                    {13, 14, 15, 0}
            };
            //重置空白方块的位置，否则下次按方向键会用旧的坐标操作新数组，把棋盘打乱
            x = 3;
            y = 3;
            initImage();
        }
    }

    //判断resultArr数组中的数据是否跟win数组中相同
    //如果全部相同，返回true。否则返回false
    public boolean victory() {
        for (int i = 0; i < resultArr.length; i++) {
            //i : 依次表示二维数组 resultArr里面的索引
            //resultArr[i]: 依次表示每一个一维数组
            for (int j = 0; j < resultArr[i].length; j++) {
                if (resultArr[i][j] != win[i][j]) {
                    //只要有一个数据不一样，则返回false
                    return false;
                }
            }
        }
        //循环结束表示数组遍历比较完毕，全都一样返回true
        return true;
    }

    //随机图片选择器方法(有传参)
    public void randomImageSelector(String category) {
        //根据指定的类别和图片编号，随机选择一张图片
        Random r = new Random();
        if (category.equals("girl")) {
            path = "puzzlegame\\image\\girl\\girl" + (r.nextInt(1,14) ) + "\\";
        }else if (category.equals("sport")) {
            path = "puzzlegame\\image\\sport\\sport" + (r.nextInt(1,11) ) + "\\";
        } else if (category.equals("animal")) {
            path = "puzzlegame\\image\\animal\\animal" + (r.nextInt(1,9) ) + "\\";
        }
    }

    //随机图片选择器方法(无传参)
    public String randomImageSelector() {
        //根据指定的类别和图片编号，随机选择一张图片
        Random r = new Random();
        int categoryIndex = r.nextInt(3);
        if (categoryIndex == 0) {
            path = "puzzlegame\\image\\girl\\girl" + (r.nextInt(1,14) ) + "\\";
        } else if (categoryIndex == 1) {
            path = "puzzlegame\\image\\sport\\sport" + (r.nextInt(1,11) ) + "\\";
        } else {
            path = "puzzlegame\\image\\animal\\animal" + (r.nextInt(1,9) ) + "\\";
        }
        return path;
    }

    //菜单条目点击事件
    @Override
    public void actionPerformed(ActionEvent e) {
        String obj = e.getActionCommand();
        if ("重新游戏".equals(obj)) {
            //重新初始化数据
            //重置步数
            step = 0;
            initData();
            //重新加载图片
            initImage();
        } else if ("重新登录".equals(obj)) {
            //关闭当前界面
            this.setVisible(false);
            //打开登录界面
            new LoginJFrame();
        } else if ("关闭游戏".equals(obj)) {
            System.exit(0);
        } else if ("公众号".equals(obj)) {
            //创建一个弹框对象
            JDialog jDialog = new JDialog();
            //创建一个管理图片的容器对象JLabel
            JLabel jLabel = new JLabel(new ImageIcon("E:\\Code\\Java-learning-notes\\basic-code\\puzzlegame\\image\\about\\about1.png"));
            jLabel.setBounds(0, 0, 258, 258);
            //把管理图片的容器添加到弹框当中
            jDialog.getContentPane().add(jLabel);
            //设置弹框的宽高
            jDialog.setSize(500, 500);
            //让弹框置顶
            jDialog.setAlwaysOnTop(true);
            //让弹框居中
            jDialog.setLocationRelativeTo(null);
            //弹框不关闭无法操作下面的界面
            jDialog.setModal(true);
            //显示弹框
            jDialog.setVisible(true);
        }else if ("动物".equals(obj)) {
            randomImageSelector("animal");
            initData();
            initImage();
        } else if ("运动".equals(obj)) {
            randomImageSelector("sport");
            initData();
            initImage();
        } else if ("美女".equals(obj)) {
            randomImageSelector("girl");
            initData();
            initImage();
        }
    }
}
