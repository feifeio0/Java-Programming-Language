package Abstract;
/*
一个抽象类不一定含有抽象方法，
只要保证抽象方法所在的类是抽象类，即可。
这样没有抽象方法的抽象类，也不能直接创建对象，在一些特殊场景下有用途。
 */
abstract class MyAbstract {
}
abstract class Fu02 {
    public Fu02() {
        System.out.println("抽象父类构造方法执行！");
    }
    public abstract void eat();
}
class Zi02 extends Fu02{
    public Zi02() {
        // super();
        System.out.println("子类构造方法执行");
    }
    @Override
    public void eat() {
        System.out.println("吃饭饭");
    }
}
public class AbstractClass02 {
    public static void main(String[] args) {
        Zi02 zi = new Zi02();
        //抽象父类构造方法执行！
        //子类构造方法执行
        zi.eat();
        //吃饭饭
    }
}
