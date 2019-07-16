package ink_abstract;

public class Cat1 extends Animal1{
    @Override
    //子类必须覆盖重写抽象父类当中所有的抽象方法。
    public void eat() {
        System.out.println("猫吃鱼");
    }
}
