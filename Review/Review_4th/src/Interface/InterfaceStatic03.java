package Interface;
/*
从Java 8开始，接口当中允许定义静态方法。
格式：
    public static 返回值类型 方法名称(参数列表) {
        方法体
    }
提示：就是将abstract（抽象）或者default（默认）换成static即可，带上方法体。
 */
interface MyInterfaceStatic03 {
    public static void methodStatic() {
        System.out.println("这是接口的静态方法！");
    }
}
//实现接口的抽象方法
class MyInterfaceStaticImpl03 implements MyInterfaceStatic03{

}
/*
    注意事项：不能通过接口实现类的对象来调用接口当中的静态方法。
    正确用法：通过接口名称，直接调用其中的静态方法。
    格式：
        接口名称.静态方法名(参数);
 */
public class InterfaceStatic03 {
    public static void main(String[] args) {
        // 创建了实现类对象
        MyInterfaceStaticImpl03 impl = new MyInterfaceStaticImpl03();
        // 错误写法！
//        impl.methodStatic();

        // 直接通过接口名称调用静态方法
        // 静态与对象没关系！！！
        MyInterfaceStatic03.methodStatic();//这是接口的静态方法！
    }
}
