package com.itheima.test;

import java.util.Random;

public class Test3 {
    public static void main(String[] args) {
        // 在主方法中调用封装好的方法
        String code = generateVerifyCode();
        System.out.println("随机验证码已生成: " + code);
    }

    // 1. 我要干嘛？ 生成 5 位随机验证码
    // 2. 需要什么？ 不需要传参，但内部需要 Random 对象
    // 3. 返回值是什么？ 返回生成的字符串
    public static String generateVerifyCode() {
        Random r = new Random();
        String code = ""; // 变量名优化

        // 前 4 位：随机大写或小写字母
        for (int i = 0; i < 4; i++) {
            // 随机决定生成大写还是小写
            if (r.nextBoolean()) { // r.nextBoolean() 比 r.nextInt(2) 更语义化
                // 小写字母
                code += (char)('a' + r.nextInt(26));
            } else {
                // 大写字母
                code += (char)('A' + r.nextInt(26));
            }
        }

        // 最后 1 位：随机数字
        int end = r.nextInt(10);
        code += end;

        return code;
    }
}