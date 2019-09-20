package Extends;
/*
super关键字用来访问父类内容，而this关键字用来访问本类内容。用法也有三种：
    1. 在本类的成员方法中，访问本类的成员变量。
    2. 在本类的成员方法中，访问本类的另一个成员方法。
    3. 在本类的构造方法中，访问本类的另一个构造方法。
在第三种用法当中要注意：
    A. this(...)调用也必须是构造方法的第一个语句，唯一一个。
    B. super和this两种构造调用，不能同时使用。
 */
class Fu06 {
    int num = 30;
    public void method() {
        System.out.println("父类方法");
    }
}
class Zi06 extends Fu06{
    int num = 20;
    public Zi06() {
//        super(); // 这一行不再赠送
        this(123); // 本类的无参构造，调用本类的有参构造
//        this(1, 2); // 错误写法！
    }
    public Zi06(int n) {
        this(1, 2);
    }
    public Zi06(int n, int m) {
        System.out.println("111");
    }
    public void showNum() {
        int num = 10;
        System.out.println(num); // 局部变量
        System.out.println(this.num); // 本类中的成员变量
        System.out.println(super.num); // 父类中的成员变量
    }
    @Override
    public void method(){
        super.method(); // 调用了父类方法
        System.out.println("子类方法");
    }
    public void methodA() {
        System.out.println("AAA");
    }
    public void methodB() {
        this.methodA();
        System.out.println("BBB");
    }
}

public class ExtendsThis06 {
    public static void main(String[] args) {
        Zi06 zi = new Zi06();
        //111
        zi.showNum();
        //10
        //20
        //30
        zi.method();
        //父类方法
        //子类方法
        zi.methodB();
        //AAA
        //BBB
    }
}
