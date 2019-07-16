package ink_abstract;

public class Animal3Main {
    public static void main(String[] args) {
//        Animal animal = new Animal(); // 错误！
//        Dog dog = new Dog(); // 错误，这也是抽象类

        Animal3Dog2Ha ha = new Animal3Dog2Ha(); // 这是普通类，可以直接new对象。
        ha.eat();
        ha.sleep();
        System.out.println("==========");

        Animal3DogGolden golden = new Animal3DogGolden();
        golden.eat();
        golden.sleep();
    }
}
