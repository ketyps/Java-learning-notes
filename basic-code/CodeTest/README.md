# CodeTest — JavaSE 语法回顾 + 算法练习

> 已完成 JavaSE 语法学习后的**系统回顾**模块。每个主题包含:
>
> - `Review_*.java` — **语法回顾**:完整可运行的示例代码,带中文注释讲解
> - `Test*.java` — **算法练习**:题目描述 + 测试用例 + `TODO` 留白,核心逻辑由你自己实现

## 主题与学习顺序

| 包 | 主题 | 算法练习 |
|----|------|----------|
| [a01basic](src/com/itheima/review/a01basic) | 基础语法:变量 / 运算符 / 流程控制 | 素数、水仙花数、九九乘法表 |
| [a02array](src/com/itheima/review/a02array) | 数组:一维 / 二维 / Arrays | 数组反转、二分查找、成绩统计 |
| [a03method](src/com/itheima/review/a03method) | 方法:重载 / 值传递 / 递归 | 斐波那契、猴子吃桃、汉诺塔 |
| [a04string](src/com/itheima/review/a04string) | String / StringBuilder | 回文判断、身份证提取、字符串反转 |
| [a05oop](src/com/itheima/review/a05oop) | 面向对象:封装 / 继承 / 多态 / 接口 | 动物园多态、员工工资体系 |
| [a06collection](src/com/itheima/review/a06collection) | 集合:List / Set / Map | 集合去重、单词统计、学生排序 |
| [a07exception](src/com/itheima/review/a07exception) | 异常:try-catch / throws / 自定义异常 | 登录校验、健壮除法 |
| [a08generic](src/com/itheima/review/a08generic) | 泛型:泛型类 / 泛型方法 / 通配符 | Pair 泛型类、泛型求最大 |
| [a09lambda](src/com/itheima/review/a09lambda) | Lambda / Stream / Optional | Stream 练习、对象流、Optional |
| [a10api](src/com/itheima/review/a10api) | 常用 API:时间 / BigDecimal / 正则 | 日期计算、金额结算、正则校验 |

## 使用方式

1. **IntelliJ IDEA**:打开 `basic-code` 项目后,右键 `CodeTest/src` → `Mark Directory as` → `Sources Root`,即可在包内直接运行各文件的 `main`。
2. 先运行 `Review_*` 文件回顾语法;再运行 `Test*` 文件,按注释补全 `TODO` 后验证输出是否符合预期。
3. 练习的预期输出已写在注释中,做完可对照。

## 命令行编译运行(JDK 21)

```bash
# 以 a01 的 Review 为例
cd basic-code/CodeTest
javac -encoding utf-8 -sourcepath src -d out src/com/itheima/review/a01basic/Review_Basic.java
java -cp out com.itheima.review.a01basic.Review_Basic
```

> 注意:文件含中文注释,Windows 下编译需加 `-encoding utf-8`。
