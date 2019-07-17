package ink_interface2;

//直接父类只有一个 接口可以有很多个
public class MyInterfaceImpl /*extends Object*/ implements MyInterfaceA,MyInterfaceB{
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
    //冲突默认方法重写
}
