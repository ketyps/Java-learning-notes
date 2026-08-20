package com.itheima.review.a10api;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.Period;
import java.util.Arrays;
import java.util.Random;

public class Review_Api {
    public static void main(String[] args) {
        /*
            一、Math(数学工具类,方法都是静态的,直接 类名.方法)
        */
        System.out.println(Math.abs(-5));     // 5      绝对值
        System.out.println(Math.max(3, 7));   // 7      最大值
        System.out.println(Math.min(3, 7));   // 3      最小值
        System.out.println(Math.pow(2, 10));  // 1024.0 幂
        System.out.println(Math.sqrt(16));    // 4.0    平方根
        System.out.println(Math.ceil(3.2));   // 4.0    向上取整
        System.out.println(Math.floor(3.8));  // 3.0    向下取整
        System.out.println(Math.round(3.5));  // 4      四舍五入

        /*
            二、Random(随机数)
        */
        Random r = new Random();
        int randomNum = r.nextInt(100);       // 生成 [0, 100) 的随机整数
        System.out.println("随机数(0~99): " + randomNum);

        /*
            三、System
        */
        long start = System.currentTimeMillis();   // 当前时间戳(毫秒),常用于计算程序耗时
        System.out.println("当前时间戳: " + start);
        // System.exit(0);   // 终止程序

        /*
            四、BigDecimal(精确小数运算,解决浮点误差)
                double 用二进制表示小数有误差: 0.1 + 0.2 其实是 0.30000000000000004
                BigDecimal 用字符串构造,可以精确计算,常用于金额
                注意: 必须用 new BigDecimal("0.1") 或 BigDecimal.valueOf(0.1),不要直接传 double
        */
        System.out.println(0.1 + 0.2);        // 0.30000000000000004(有误差)
        BigDecimal b1 = new BigDecimal("0.1");
        BigDecimal b2 = new BigDecimal("0.2");
        System.out.println(b1.add(b2));       // 0.3  精确相加
        // 常用: add 加 / subtract 减 / multiply 乘
        //       divide 除(除不尽时要指定精度和舍入方式,如 divide(b, 2, RoundingMode.HALF_UP))

        /*
            五、JDK8 新时间类(推荐,替代 Date / Calendar)
                LocalDate     日期(年-月-日)
                LocalTime     时间
                LocalDateTime 日期 + 时间
                Period / Duration 计算时间间隔
        */
        LocalDate today = LocalDate.now();
        LocalDate birth = LocalDate.of(1990, 3, 7);
        System.out.println("今天: " + today);
        System.out.println("出生日期: " + birth);
        System.out.println("今天 + 100天: " + today.plusDays(100));
        Period between = Period.between(birth, today);   // 两个日期之间的间隔
        System.out.println("间隔 " + between.getYears() + " 年 " + between.getMonths() + " 个月 " + between.getDays() + " 天");

        /*
            六、包装类(Integer, Double 等)
                基本类型与包装类之间会自动"装箱 / 拆箱"(JDK5+)
                Integer.parseInt("123")  字符串转 int
                Integer.MAX_VALUE        int 范围上限
        */
        int parsed = Integer.parseInt("123");
        System.out.println(parsed + 1);      // 124
        System.out.println("int 最大值: " + Integer.MAX_VALUE);

        /*
            七、Arrays(前面 a02 讲过,这里巩固)
        */
        int[] arr = {3, 1, 2};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));   // [1, 2, 3]
        int[] copy = Arrays.copyOf(arr, 5);         // 复制成 5 长度,多出的补默认值 0
        System.out.println(Arrays.toString(copy));  // [1, 2, 3, 0, 0]

        /*
            八、正则表达式(String.matches 快速校验)
                \d 表示数字,\w 表示字母数字下划线,{n} 表示重复 n 次
        */
        String phone = "13812345678";
        // 手机号: 1 开头,第二位 3~9,后面 9 个数字
        System.out.println("手机号格式正确? " + phone.matches("1[3-9]\\d{9}"));   // true
        String email = "test@qq.com";
        System.out.println("邮箱格式正确? " + email.matches("\\w+@[a-zA-Z0-9]+(\\.[a-zA-Z]{2,})+"));   // true
    }
}
