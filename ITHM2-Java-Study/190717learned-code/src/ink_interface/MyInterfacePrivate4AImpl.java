package ink_interface;

public class MyInterfacePrivate4AImpl implements MyInterfacePrivate4A{
    public void methodAnother(){
        // 直接访问到了接口中的默认方法，这样是错误的！
//        methodCommon();
    }

}
