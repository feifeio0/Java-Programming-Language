package ink_interface;
/*
注意事项：不能通过接口实现类的对象来调用接口当中的静态方法。
正确用法：通过接口名称，直接调用其中的静态方法。
格式：
接口名称.静态方法名(参数);
 */
public class InterfaceStatic3{
    public static void main(String[] args) {
        // 创建了实现类对象
        MyInterfaceStaticImpl3 impl = new MyInterfaceStaticImpl3();

        // 错误写法！
//        impl.methodStatic();

        // 直接通过接口名称调用静态方法
        // 静态与对象没关系！！！
        MyInterfaceStatic3.methodStatic();
    }
}
