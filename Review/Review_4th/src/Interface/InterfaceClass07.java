package Interface;
/*
    一个类如果直接父类当中的方法，和接口当中的默认方法产生了冲突，优先用父类当中的方法。
        //父类优先于接口
*/
class Fu07 {
    public void method() {
        System.out.println("父类方法");
    }
}
interface MyInterfaceNotice {
    public default void method() {
        System.out.println("接口的默认方法");
    }
}

class Zi07 extends Fu07 implements MyInterfaceNotice {

}

public class InterfaceClass07 {
    public static void main(String[] args) {
        Zi07 zi = new Zi07();
        zi.method();//父类方法 优先父类
    }
}
