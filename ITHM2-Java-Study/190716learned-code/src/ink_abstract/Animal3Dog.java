package ink_abstract;

// 子类也是一个抽象类
public abstract class Animal3Dog extends Animal3 {

    @Override
    public void eat() {
        System.out.println("狗吃骨头");
    }

    // public abstract void sleep();
}
