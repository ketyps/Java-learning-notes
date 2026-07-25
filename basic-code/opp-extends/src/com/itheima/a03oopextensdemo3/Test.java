package com.itheima.a03oopextensdemo3;

import java.io.IOException;
import java.util.Scanner;

class Fu {
    private int a = 0x111;
    int b = 0x222;

    public void fuShow1() {
        System.out.println("public --- FuShow");
    }

    private void fuShow2() {
        System.out.println("private --- FuShow");
    }
}

class Zi extends Fu {
    int c = 0x333;

    public void ziShow() {
        System.out.println("public --- ZiShow");
    }

}

// 3. 测试类
public class Test {
    public static void main(String[] args) throws IOException {
        // 创建子类对象
        Zi z = new Zi();

        // 打印 z 对象在 JVM 堆内存中的真实地址（十六进制）
        // 注：这里依赖了 openjdk.jol 这个第三方库来获取地址（已注释，避免编译报错影响其他文件运行）
        // System.out.println("z 对象内存地址: 0x" + Long.toHexString(VM.current().addressOf(z)));

        // 暂停程序，防止控制台一闪而过（方便你结合前面的打印去观察）
        System.out.println("按回车键退出...");
        Scanner sc = new Scanner(System.in);
        sc.next();
    }
}
