package Extends;
/*
    super关键字的用法有三种：
    1. 在子类的成员方法中，访问父类的成员变量。
    2. 在子类的成员方法中，访问父类的成员方法。
    3. 在子类的构造方法中，访问父类的构造方法。
 */
class Fu05 {
    int num = 10;
    public Fu05() {
        System.out.println("父类无参构造");
    }
    public Fu05(int num) {
        System.out.println("父类有参构造！");
    }
    public void method() {
        System.out.println("父类方法");
    }
}
class Zi05 extends Fu05{
    int num = 20;
    public Zi05() {
        super(); // 在调用父类无参构造方法,写不写都一样
//        super(20); // 在调用父类重载的构造方法
        System.out.println("子类构造方法！");
    }
    public void methodZi() {
        System.out.println(super.num); // 父类中的num
    }
    public void method() {
        super.method(); // 访问父类中的method
        System.out.println("子类方法");
    }
}
/*
继承关系中，父子类构造方法的访问特点：
1. 子类构造方法当中有一个默认隐含的“super()”调用，所以一定是先调用的父类构造，后执行的子类构造。
2. 子类构造可以通过super关键字来调用父类重载构造。
3. super的父类构造调用，必须是子类构造方法的第一个语句。不能一个子类构造调用多次super构造。
总结：
    子类必须调用父类构造方法，不写则赠送super()；
    写了则用写的指定的super调用，super只能有一个，还必须是第一个。
 */
public class ExtendsSuperConstruct05 {
    public static void main(String[] args) {
        Zi05 zi = new Zi05();
        //父类无参构造
        //子类构造方法！
        zi.methodZi();
        //10
        zi.method();
        //父类方法
        //子类方法
    }
}
