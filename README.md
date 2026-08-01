# Java Learning Notes

我的 Java 学习笔记与练习代码仓库。从零开始系统学习 Java，涵盖基础语法到面向对象编程，持续更新中。

> **本仓库仍在不断完善中** — 会持续更新 Java 学习的代码、笔记和项目。

---

## 目录结构

### 基础入门 (Day 01)

| 模块 | 内容 | 代码路径 |
|------|------|----------|
| **注释** | 单行/多行/文档注释 | [注释/](注释/) |
| **变量** | 变量定义与使用 | [变量/](变量/) |
| **常量** | 常量定义与分类 | [常量/](常量/) |
| **键盘录入** | Scanner 基本使用 | [键盘录入/](键盘录入/) |

### 基础语法 (Day 系列)

| 模块 | 涵盖内容 | 代码路径 |
|------|----------|----------|
| **Day 01** | 注释、变量、常量、键盘录入（上列基础模块） | — |
| **Day 02** | Hello World 入门 | [day02-code](basic-code/day02-code/) |
| **Day 03** | 算术/赋值/比较/逻辑运算符 | [day03-code](basic-code/day03-code/) |
| **Day 04** | 顺序/分支(if/switch)/循环(for/while) | [day04-code](basic-code/day04-code/) |
| **Day 05** | 数组/死循环/跳转语句 | [day05-code](basic-code/day05-code/) |
| **Day 06** | 方法定义与调用 | [day06-code](basic-code/day06-code/) |
| **Day 07** | 阶段综合练习题 | [day07-code](basic-code/day07-code/) |

### 面向对象 (OOP)

| 模块 | 涵盖内容 | 代码路径 |
|------|----------|----------|
| **OOP 基础** | 封装、构造方法、标准 JavaBean、对象数组 | [oop-test](basic-code/oop-test/) |
| **OOP 综合练习** | 封装、构造方法、标准 JavaBean 练习 | [oop-code](basic-code/oop-code/) |
| **继承** | extends、方法重写、继承体系 | [oop-extends](basic-code/oop-extends/) |
| **多态** | 多态的概念与应用 | [oop-polymorphism](basic-code/oop-polymorphism/) |
| **包** | package、import 导包 | [oop-package](basic-code/oop-package/) |
| **权限修饰符** | 四种访问权限、代码块 | [oop-modifier](basic-code/oop-modifier/) |
| **接口** | interface 的定义与实现 | [oop-interface](basic-code/oop-interface/) |
| **抽象类** | abstract 抽象方法与抽象类 | [oop-abstract](basic-code/oop-abstract/) |
| **final** | final 修饰类 / 方法 / 变量 | [oop-final](basic-code/oop-final/) |
| **内部类** | 成员 / 局部 / 匿名 / 静态内部类 | [oop-innerclass](basic-code/oop-innerclass/) |

> `oop-test` 包含 test1~test8 共 8 个练习包。

### 常用 API

| 模块 | 内容 | 代码路径 |
|------|------|----------|
| **String** | String / StringBuilder 常用 API | [mystring](basic-code/mystring/) |
| **集合** | ArrayList 集合 | [mylist](basic-code/mylist/) |
| **static** | static 修饰成员、工具类 | [mystatic](basic-code/mystatic/) |

### 综合项目

| 项目 | 内容 | 代码路径 |
|------|------|----------|
| **拼图游戏** | Swing 图形化项目：登录注册 + 验证码 + 数字拼图 | [puzzlegame](basic-code/puzzlegame/) |
| **学生管理系统** | 控制台项目：学生 CRUD + 用户登录注册 | [studentsystem](basic-code/studentsystem/) |

**拼图游戏 (puzzlegame)** — 基于 Swing 的 15 拼图（数字华容道）游戏，覆盖登录 → 游戏完整流程：

- **登录界面**：用户名 / 密码 + 随机验证码校验，内置测试账号 `zhangsan/123`、`lisi/1234`
- **注册界面**：注册框架
- **游戏界面**：
  - 4×4 随机打乱拼图，方向键（↑↓←→）移动空白块
  - 步数统计、胜利判定（全部归位后显示胜利图标）
  - 菜单栏：重新游戏 / 重新登录 / 关闭游戏 / 更多图片（动物、运动、美女 三类随机切换）
  - 快捷键：`A` 查看完整图片，`W` 直接胜利（调试用）

| 类 | 职责 |
|----|------|
| `App` | 程序入口 |
| `ui.LoginJFrame` | 登录界面（含验证码校验） |
| `ui.RegisterJFrame` | 注册界面 |
| `ui.GameJFrame` | 游戏主界面（拼图逻辑 + 键盘 / 菜单事件） |
| `domain.User` | 用户实体 |
| `util.CodeUtil` | 随机验证码生成工具 |

### 其他

| 模块 | 内容 | 代码路径 |
|------|------|----------|
| **二维数组** | 二维数组的声明与遍历 | [twoDimension](basic-code/twoDimension/) |

---

## 技术栈与环境

| 项目 | 说明 |
|------|------|
| **JDK** | 21 |
| **IDE** | VS Code / IntelliJ IDEA |
| **项目管理** | 纯源码 (非 Maven/Gradle) |
| **编码** | UTF-8 |

---

## 如何运行

1. 确保已安装 JDK 21
2. 进入对应模块目录
3. 编译运行：

```bash
# 示例：运行 day03 的 Test1
cd basic-code/day03-code
javac -d out src/com/itheima/test/Test1.java
java -cp out com.itheima.test.Test1
```

```bash
# 示例：运行拼图游戏（请在 puzzlegame 目录下运行，图片资源为相对路径）
cd basic-code/puzzlegame
javac -encoding utf-8 -sourcepath src -d out src/com/itheima/App.java
java -cp out com.itheima.App
```

或直接在 VS Code / IDEA 中打开项目运行。

---

## 学习路线

```
变量/常量/注释/键盘录入
        ↓
运算符 -> 流程控制 -> 数组
        ↓
      方法
        ↓
面向对象 (OOP) -> 常用 API
        ↓
    综合项目实战
        ↓
  Swing 图形化 (拼图游戏)
```

---

## License

This project is for personal learning purposes only.

---

_学习笔记，持续更新中..._
