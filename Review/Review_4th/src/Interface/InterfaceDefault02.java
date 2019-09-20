package Interface;
/*
从Java 8开始，接口里允许定义默认方法。
格式：
    public default 返回值类型 方法名称(参数列表) {
        方法体
    }
备注：接口当中的默认方法，可以解决接口升级的问题。
        还可以拼接函数模型
 */
interface MyInterfaceDefault02 {
    // 抽象方法
    public abstract void methodAbs();
    // 新添加了一个抽象方法(不想修改AB)
//    public abstract void methodAbs2();
    // 新添加的方法，改成默认方法
    public default void methodDefault() {
        System.out.println("这是新添加的默认方法");
    }
}
// 接口的默认方法，可以直接默认，也可以被接口实现类进行覆盖重写。
class MyInterfaceDefault02ImplA implements MyInterfaceDefault02{
    @Override
    public void methodAbs() {
        System.out.println("实现了抽象方法，AAA");
    }
}
class MyInterfaceDefault02ImplB implements MyInterfaceDefault02{
    @Override
    public void methodAbs() {
        System.out.println("实现了抽象方法，BBB");
    }
    @Override
    public void methodDefault() {
        System.out.println("实现类B覆盖重写了接口的默认方法");
    }
}
/*
    1. 接口的默认方法，可以通过接口实现类对象，直接调用。
    2. 接口的默认方法，也可以被接口实现类进行覆盖重写。
 */
public class InterfaceDefault02 {
    public static void main(String[] args) {
        // 创建了实现类对象
        MyInterfaceDefault02ImplA a = new MyInterfaceDefault02ImplA();
        // 调用抽象方法，实际运行的是右侧实现类。
        a.methodAbs(); //实现了抽象方法，AAA

        // 调用默认方法，如果实现类当中没有，会向上找接口
        a.methodDefault(); // 这是新添加的默认方法
        System.out.println("==========");

        MyInterfaceDefault02ImplB b = new MyInterfaceDefault02ImplB();
        b.methodAbs();//实现了抽象方法，BBB
        b.methodDefault(); // 实现类B覆盖重写了接口的默认方法
    }
}
