package ink_abstract;

public class CatMain1 {
    public static void main(String[] args) {
        //        Animal animal = new Animal(); // 错误写法！不能直接创建抽象类对象
        Cat1 cat = new Cat1();
        cat.eat();
    }
}
