package ink_interface;
// 接口的默认方法，可以被接口实现类进行覆盖重写。
public class MyInterfaceDefaultImplB implements MyInterfaceDefault2{
    @Override
    public void methodAbs() {
        System.out.println("实现了抽象方法，BBB");
    }

    @Override
    public void methodDefault() {
        System.out.println("实现类B覆盖重写了接口的默认方法");
    }
}
