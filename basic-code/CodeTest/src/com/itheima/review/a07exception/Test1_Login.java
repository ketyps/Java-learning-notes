package com.itheima.review.a07exception;

public class Test1_Login {
    public static void main(String[] args) {
        /*
            题目：模拟登录系统(自定义异常 + throw)
            规则:
                - 用户名: 6~16 位
                - 密码:   6~20 位
            用自定义运行时异常 LoginException(继承 RuntimeException)校验,
            不合法就抛出异常,main 中捕获并输出错误信息。
            测试用例:
                "zhangsan" / "123456"  -> 登录成功
                "zs"       / "123456"  -> 抛出: 用户名长度不合法
                "zhangsan" / "123"     -> 抛出: 密码长度不合法
            提示:
                - 补全 LoginException 类(继承 RuntimeException,构造方法调用 super(message))
                - 补全 checkLogin: 长度不满足时 throw new LoginException("...")
        */

        // TODO: 依次测试三组数据
        // checkLogin("zhangsan", "123456");   // 成功,打印"登录成功"
        // checkLogin("zs", "123456");          // 抛异常
        // checkLogin("zhangsan", "123");       // 抛异常
        // 用 try-catch 包住调用,捕获 LoginException 打印 e.getMessage()
    }

    private static void checkLogin(String name, String pwd) {
        // TODO: 校验用户名长度(6~16),不合法抛 LoginException
        // TODO: 校验密码长度(6~20),不合法抛 LoginException
        System.out.println("登录成功");
    }
}

// TODO: 自定义 LoginException(继承 RuntimeException,提供构造方法调用 super(message))
