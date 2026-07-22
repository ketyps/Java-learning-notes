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
| **OOP 进阶** | 继承、多态、包、权限修饰符、代码块 | [opp-code](basic-code/opp-code/) |

> `oop-test` 包含 test1~test8 共 8 个练习包，`opp-code` 包含面向对象进阶案例。

### 其他

| 模块 | 内容 | 代码路径 |
|------|------|----------|
| **二维数组** | 二维数组的声明与遍历 | [twoDimension](basic-code/twoDimension/) |
| **学生管理系统** | 综合项目：学生 CRUD + 用户登录注册 | [studentsystem](basic-code/studentsystem/) |

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
    面向对象 (OOP)
        ↓
    综合项目实战
```

---

## License

This project is for personal learning purposes only.

---

_学习笔记，持续更新中..._
