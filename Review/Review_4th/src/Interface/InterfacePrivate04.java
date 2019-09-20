package Interface;
/*
问题描述：
    我们需要抽取一个共有方法，用来解决两个默认方法之间重复代码的问题。
    但是这个共有方法不应该让实现类使用，应该是私有化的。
解决方案：
    从Java 9开始，接口当中允许定义私有方法。
    1. 普通私有方法，解决多个默认方法之间重复代码问题
    格式：
        private 返回值类型 方法名称(参数列表) {
            方法体
        }
    2. 静态私有方法，解决多个静态方法之间重复代码问题
        格式：
        private static 返回值类型 方法名称(参数列表) {
            方法体
        }
 */
interface MyInterfacePrivate04A {
    public default void methodDefault1() {
        System.out.println("默认方法1");
//        System.out.println("AAA");
//        System.out.println("BBB");
//        System.out.println("CCC");
        methodCommon();
    }

    public default void methodDefault2() {
        System.out.println("默认方法2");
//        System.out.println("AAA");
//        System.out.println("BBB");
//        System.out.println("CCC");
        methodCommon();
    }
    //下面代码不应该让实现类使用（private）
    //public default void methodCommon（）
    private void methodCommon() {
        System.out.println("AAA");
        System.out.println("BBB");
        System.out.println("CCC");
    }
}

interface MyInterfacePrivate04B {
    public static void methodStatic1() {
        System.out.println("静态方法1");
        methodStaticCommon();
    }
    public static void methodStatic2() {
        System.out.println("静态方法2");
        methodStaticCommon();
    }
    //public static void methodStaticCommon()
    private static void methodStaticCommon() {
        System.out.println("AAA");
        System.out.println("BBB");
        System.out.println("CCC");
    }
}

class MyInterfacePrivate04AImpl implements MyInterfacePrivate04A{
    public void methodAnother(){
        // 直接访问到了接口中的默认方法，这样是错误的！
//        methodCommon();
        //不应该让其实现类来使用接口中重复的默认代码
        //所以应该引用私有方法
    }
}

class MyInterfacePrivate04BImpl implements MyInterfacePrivate04B{

}

public class InterfacePrivate04 {
    public static void main(String[] args) {
        MyInterfacePrivate04AImpl pimpl = new MyInterfacePrivate04AImpl();
        pimpl.methodDefault1();
        //默认方法1
        //AAA
        //BBB
        //CCC
        pimpl.methodDefault2();
        //默认方法2
        //AAA
        //BBB
        //CCC
        //pimpl.methodCommon();//私有方法 报错！错误写法！

        MyInterfacePrivate04B.methodStatic1();
        //静态方法1
        //AAA
        //BBB
        //CCC
        MyInterfacePrivate04B.methodStatic2();
        //静态方法2
        //AAA
        //BBB
        //CCC
        // 私有方法 报错！错误写法！
//        MyInterfacePrivate4B.methodStaticCommon();
    }
}
