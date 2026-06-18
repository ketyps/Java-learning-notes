//1.导包,找到Scanner这个类在哪
//书写要注意:要写在类定义的上面
import java.util.Scanner;

public class ScannerDemo1 {
    public static void main(String[] args) {
        
        //2.创建对象,表示我现在准备要用Scanner这个类
        System.out.println("请输入整数");
        Scanner sc = new Scanner(System.in);

        //3.接收数据
        //变量记录了键盘录入的数据
        int i = sc.nextInt();

        System.out.print(i);
    }
}

//感觉比C复杂好多,C的scanf函数已经包含在studio里了,语法也没那么复杂
