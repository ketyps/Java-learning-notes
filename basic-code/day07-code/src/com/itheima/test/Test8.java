package com.itheima.test;

public class Test8 {
    public static void main(String[] args) {
        /* 某系统的数字密码（大于0）。比如1983，采用加密方式进行传输，
        规则如下：
        每位数加上5
        再对10求余，
        最后将所有数字反转，
        得到一串新数。
        按照以上规则进行解密：
        比如1983加密之后变成8346，解密之后变成1983 */

        // 1. 已知加密后的密码
        int encryptedNumber = 8346;

        // 2. 先把加密后的整数拆分成数组（方便每一位反转和运算）
        int temp = encryptedNumber;
        int count = 0;
        while (temp > 0) {
            temp /= 10;
            count++;
        }

        int[] arr = new int[count];
        temp = encryptedNumber;
        for (int i = count - 1; i >= 0; i--) {
            arr[i] = temp % 10;
            temp /= 10;
        }

        // 3. 解密第一步：逆转顺序（反转数组）
        for (int i = 0; i < arr.length / 2; i++) {
            int t = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = t;
        }

        // 4. 解密第二步：逆向运算（原先是 +5 %10，现在还原）
        for (int i = 0; i < arr.length; i++) {
            // 加上 10 是防止 Java 对负数取余出错（保证数字在 0~9 之间）
            arr[i] = (arr[i] - 5 + 10) % 10;
        }

        // 5. 将解密后的数组重新拼回成一个整数
        int originalNumber = 0;
        for (int i = 0; i < arr.length; i++) {
            originalNumber = originalNumber * 10 + arr[i];
        }

        System.out.println("解密后的原密码为：" + originalNumber);
    }
}