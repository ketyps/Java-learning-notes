package com.itheima.review.a07exception;

public class Review_Exception {
    public static void main(String[] args) {
        /*
            一、异常体系
                Throwable(所有错误和异常的父类)
                  ├── Error: 程序无法处理的严重错误(如 StackOverflowError、OutOfMemoryError)
                  └── Exception: 可以处理的异常
                        ├── RuntimeException(运行时异常,不用强制处理):
                        │     NullPointerException 空指针
                        │     ArrayIndexOutOfBoundsException 数组越界
                        │     ArithmeticException 算术异常(如除零)
                        │     NumberFormatException 数字格式异常
                        └── 编译时异常(Checked Exception,必须处理):
                              IOException / SQLException / 自定义继承 Exception 的类
        */

        /*
            二、try-catch-finally
                try { 可能出错的代码 }
                catch (异常类型 变量) { 针对性的处理 }
                finally { 无论是否发生异常都会执行(一般用于释放资源) }
                注意:
                    - 多个 catch: 子类异常写在前面,父类异常写在后面
                    - try 中一旦抛异常,异常处后面的代码不再执行
        */
        int[] arr = {1, 2, 3};
        try {
            System.out.println(arr[10]);   // 数组越界,抛出 ArrayIndexOutOfBoundsException
            System.out.println("这行不会执行");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("捕获到数组越界异常: " + e.getMessage());
        } catch (Exception e) {            // 父类异常放最后兜底
            System.out.println("其他异常: " + e);
        } finally {
            System.out.println("finally 一定会执行");
        }

        /*
            三、throw 与 throws 的区别
                throw:  写在方法体内,手动抛出异常对象,如 throw new RuntimeException("出错了")
                throws: 写在方法声明上,声明该方法可能抛出的异常类型,提醒调用者处理
        */
        try {
            checkAge(151);     // 年龄不合法,会抛出自定义异常
        } catch (AgeOutOfBoundsException e) {
            System.out.println("捕获自定义异常: " + e.getMessage());
        }

        /*
            四、自定义异常
                步骤:
                    1. 继承 Exception(编译时异常,强制处理) 或 RuntimeException(运行时异常,可处理可不处理)
                    2. 写构造方法,调用 super(message) 把错误信息传给父类
                什么时候用: 当 JDK 自带异常表达不了业务问题时,自定义异常表达"业务规则被破坏"
        */
    }

    // throws 声明可能抛出的异常;调用者必须处理(因为 AgeOutOfBoundsException 是编译时异常)
    private static void checkAge(int age) throws AgeOutOfBoundsException {
        if (age < 0 || age > 150) {
            throw new AgeOutOfBoundsException("年龄不合法: " + age);
        }
        System.out.println("年龄合法: " + age);
    }
}

// 自定义编译时异常
class AgeOutOfBoundsException extends Exception {
    public AgeOutOfBoundsException(String message) {
        super(message);
    }
}
