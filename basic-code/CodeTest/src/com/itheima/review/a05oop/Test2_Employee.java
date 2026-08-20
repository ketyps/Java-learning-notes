package com.itheima.review.a05oop;

public class Test2_Employee {
    public static void main(String[] args) {
        /*
            题目：员工工资体系(继承 + 构造 + 重写)
            要求:
                1. 父类 Employee: 姓名 name,工资 salary;方法 show(),打印 "员工 xxx 的工资是 yyy"
                2. 子类 Manager 继承 Employee: 额外奖金 bonus;重写 show(),打印工资 + 奖金
                3. 子类 Coder 继承 Employee: 重写 show(),打印工资 + 加班费(可给个固定值或直接用父类)

            补全类定义后,运行 main 预期输出(示例):
                经理 张三 的工资是 20000(含奖金 5000)
                程序员 李四 的工资是 10000

            提示: 子类构造方法第一行用 super(参数) 调用父类构造;
                  getter/setter 如果父类已有,子类可直接继承使用。
        */
    }
}

// TODO: 父类 Employee(私有字段 name、salary;无参+全参构造;getter/setter;show() 打印"员工 xxx 的工资是 yyy")

// TODO: 子类 Manager(额外 bonus;重写 show(),输出含奖金)

// TODO: 子类 Coder(重写 show(),或直接继承父类的 show())
