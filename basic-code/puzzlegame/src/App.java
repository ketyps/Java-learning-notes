import com.itheima.ui.GameJFrame;
import com.itheima.ui.LoginJFrame;
import com.itheima.ui.RegisterJFrame;

public class App {
    public static void main(String[] args) {
        //表示程序的入口
        //如果我们想要开启一个界面,就创建谁的对象
        new LoginJFrame();//LoginJFrame的无参构造

        new RegisterJFrame();

        new GameJFrame();
    }
}
