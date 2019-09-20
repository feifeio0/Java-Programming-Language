package MultiComputer;

public class UseComputer {
    public static void main(String[] args) {
        // 首先创建一个笔记本电脑
        Computer computer = new Computer();
        computer.powerOn();//笔记本电脑开机

        // 准备一个鼠标，供电脑使用
//        Mouse mouse = new Mouse();
        //USB usb = mouse;
        // 首先进行向上转型
        USB usbMouse = new Mouse(); // 多态写法
        // 参数是USB类型，我正好传递进去的就是USB鼠标
        computer.useDevice(usbMouse);
        //打开鼠标
        //鼠标点击
        //关闭鼠标

        // 创建一个USB键盘
        Keyboard keyboard = new Keyboard(); // 没有使用多态写法
        // 方法参数是USB类型，传递进去的是实现类对象
        computer.useDevice(keyboard); // 正确写法！也发生了向上转型
        //小的可以自动转成大的keyborad->USB
        //打开键盘
        //键盘输入
        //关闭键盘

        // 使用子类对象，匿名对象，也可以
//        computer.useDevice(new Keyboard()); // 也是正确写法
        computer.powerOff();
        //笔记本电脑关机

    }
}
