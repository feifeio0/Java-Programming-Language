package Interface;
/*
使用接口的时候，需要注意：
    1. 接口是没有静态代码块或者构造方法的。
    2. 一个类的直接父类是唯一的，但是一个类可以同时实现多个接口。
    格式：
        public class MyInterfaceImpl implements MyInterfaceA, MyInterfaceB {
            // 覆盖重写所有抽象方法
        }
    3. 如果实现类所实现的多个接口当中，存在重复的抽象方法，那么只需要覆盖重写一次即可。
    4. 如果实现类没有覆盖重写所有接口当中的所有抽象方法，那么实现类就必须是一个抽象类。
    5. 如果实现类所实现的多个接口当中，存在重复的默认方法，那么实现类一定要对冲突的默认方法进行覆盖重写。
 */
interface MyInterface06A {
    // 错误写法！接口不能有静态代码块
//    static {
//    }
    // 错误写法！接口不能有构造方法
//    public MyInterface06A() {
//    }
    public abstract void methodA();
    public abstract void methodAbs();
    public default void methodDefault() {
        System.out.println("默认方法AAA");
    }
}

interface MyInterface06B {
    // 错误写法！接口不能有静态代码块
//    static {
//    }
    // 错误写法！接口不能有构造方法
//    public MyInterface06B() {
//    }
    public abstract void methodB();
    public abstract void methodAbs();
    public default void methodDefault() {
        System.out.println("默认方法BBB");
    }
}

abstract class MyInterfaceAbstract06 implements MyInterface06A, MyInterface06B {
    @Override
    public void methodA() {
    }
    @Override
    public void methodDefault() {
    }
    //冲突默认方法必须重写
}

//直接父类只有一个 接口可以有很多个
class MyInterfaceImpl06 /*extends Object*/ implements MyInterface06A,MyInterface06B{
    @Override
    public void methodA() {
        System.out.println("覆盖重写了A方法");
    }
    @Override
    public void methodB() {
        System.out.println("覆盖重写了B方法");
    }
    @Override
    public void methodAbs() {
        System.out.println("覆盖重写了AB接口都有的抽象方法");
    }
    // 实现类所实现的多个接口当中，存在重复的抽象方法，那么只需要覆盖重写一次即可。
    @Override
    public void methodDefault() {
        System.out.println("对多个接口当中冲突的默认方法进行了覆盖重写");
    }
    //冲突默认方法必须重写
}

public class InterfaceNotice06{
    public static void main(String[] args) {
        MyInterfaceImpl06 not = new MyInterfaceImpl06();
        not.methodA();//覆盖重写了A方法
        not.methodAbs();//覆盖重写了AB接口都有的抽象方法
        not.methodB();//覆盖重写了B方法
        not.methodDefault();//对多个接口当中冲突的默认方法进行了覆盖重写
    }
}
