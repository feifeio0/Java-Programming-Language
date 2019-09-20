package Interface;
/*
    接口就是多个类的公共规范。
    接口是一种引用数据类型，最重要的内容就是其中的：抽象方法。

    如何定义一个接口的格式：
    public interface 接口名称 {
        // 接口内容
    }

    如果是Java 7，那么接口中可以包含的内容有：
        1. 常量
        2. 抽象方法
    如果是Java 8，还可以额外包含有：
        3. 默认方法
        4. 静态方法
    如果是Java 9，还可以额外包含有：
        5. 私有方法
 */
interface MyInterfaceAbstract01 {
    //[public] [abstract] 返回值类型 方法名称(参数列表);
    // 这是一个抽象方法
    public abstract void methodAbs1();
    // 这也是抽象方法
    abstract void methodAbs2();
    // 这也是抽象方法
    public void methodAbs3();
    // 这也是抽象方法
    void methodAbs4();
}
//implement 实现接口的抽象方法
/*
接口使用步骤：
    1. 接口不能直接使用，必须有一个“实现类”来“实现”该接口。
        格式：
        public class 实现类名称 implements 接口名称 {
            // ...
        }
    2. 接口的实现类必须覆盖重写（实现）接口中所有的抽象方法。
        实现：去掉abstract关键字，加上方法体大括号。
    3. 创建实现类的对象，进行使用。
 */
class MyInterfaceAbstractImpl01 implements MyInterfaceAbstract01{//alt+enter
    @Override
    public void methodAbs1() {
        System.out.println("这是第一个方法！");
    }
    @Override
    public void methodAbs2() {
        System.out.println("这是第二个方法！");
    }
    @Override
    public void methodAbs3() {
        System.out.println("这是第三个方法！");
    }
    @Override
    public void methodAbs4() {
        System.out.println("这是第四个方法！");
    }
}
public class InterfaceAbstract01 {
    public static void main(String[] args) {
        // 错误写法！不能直接new接口对象使用。
//        MyInterfaceAbstract01 inter = new MyInterfaceAbstract01();

        // 创建实现类的对象使用
        MyInterfaceAbstractImpl01 impl = new MyInterfaceAbstractImpl01();
        impl.methodAbs1();//这是第一个方法！
        impl.methodAbs2();//这是第二个方法！
    }
}
