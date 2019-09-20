package Interface;
/*
    1. 类与类之间是单继承的。直接父类只有一个。
    2. 类与接口之间是多实现的。一个类可以实现多个接口。
    3. 接口与接口之间是多继承的。
注意事项：
    1. 多个父接口当中的抽象方法如果重复，没关系。
    2. 多个父接口当中的默认方法如果重复，那么子接口必须进行默认方法的覆盖重写。
        //【而且带着default关键字】
 */
interface MyInterface08A {
    public abstract void methodA();
    public abstract void methodCommon();
    public default void methodDefault() {
        System.out.println("AAA");
    }
}
interface MyInterface08B {
    public abstract void methodB();
    public abstract void methodCommon();
    public default void methodDefault() {
        System.out.println("BBB");
    }
}
/*
    这个子接口当中有几个方法？
        答：4个。
        methodA 来源于接口A
        methodB 来源于接口B
        methodCommon 同时来源于接口A和B
        method 来源于我自己
 */
interface MyInterface08 extends MyInterface08A, MyInterface08B {
    public abstract void method();
    @Override
    public default void methodDefault() {

    }
}
class MyInterfaceImpl08 implements MyInterface08{
    @Override
    public void method() {
        System.out.println("method");
    }
    @Override
    public void methodA() {
        System.out.println("methodA");
    }
    @Override
    public void methodB() {
        System.out.println("methodB");
    }
    @Override
    public void methodCommon() {
        System.out.println("methodCommon");
    }
}
public class InterfaceRelations08 {
    public static void main(String[] args) {
        MyInterfaceImpl08 not = new MyInterfaceImpl08();
        not.method();//method
        not.methodA();//methodA
        not.methodB();//methodB
        not.methodCommon();//methodCommon
    }
}
