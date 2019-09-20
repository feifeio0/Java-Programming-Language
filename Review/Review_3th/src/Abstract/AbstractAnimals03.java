package Abstract;
abstract class Animals03{
    public abstract void eat();
    public abstract void sleep();
}
// 该子类也是一个抽象类
abstract class Animals03Dog extends Animals03 {
    @Override
    public void eat() {
        System.out.println("狗吃骨头");
    }
    // public abstract void sleep();
}
class Animals03Dog2Ha extends Animals03Dog{
    @Override
    public void sleep() {
        System.out.println("嘿嘿嘿……");
    }
}
class Animals03DogGolden extends Animals03Dog{
    @Override
    public void sleep() {
        System.out.println("呼呼呼……");
    }
}
public class AbstractAnimals03 {
    public static void main(String[] args) {
//        Animals03 animal = new Animals03(); // 错误！
//        Animals03Dog dog = new Animals03Dog(); // 错误，这也是抽象类
        Animals03Dog2Ha ha = new Animals03Dog2Ha(); // 这是普通类，可以直接new对象。
        ha.eat();
        //狗吃骨头
        ha.sleep();
        //嘿嘿嘿……
        System.out.println("==========");
        Animals03DogGolden golden = new Animals03DogGolden();
        golden.eat();
        //狗吃骨头
        golden.sleep();
        //呼呼呼……
    }
}
