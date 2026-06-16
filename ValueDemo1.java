public class ValueDemo1 {
    public static void main(String[] args) {
        //目标:需要大家掌握常见的数据在代码中如何书写的?

        // Java的打印语句和C还是有带你小区别的
        // 打印的格式取决于打印的数据的类型
        // 比如打印数字不需要加引号,字符串用双引号括起,字符用单引号括起

        //整数
        System.err.println(666);
        System.err.println(-777);

        //小数
        System.err.println(1.93);
        System.out.println(-3.71);

        //字符串
        System.err.println("黑马程序员");
        System.err.println("尼古拉斯阿玮");

        //字符串
        System.err.println('男');
        System.err.println('女');

        //布尔
        System.out.println(true);
        System.err.println(false);

        //空
        //细节:null不能直接打印的.
        //如果我们要打印null,那么只能用打印字符串的形式进行打印
        System.err.println("null");
    }
}
