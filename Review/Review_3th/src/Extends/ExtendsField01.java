package Extends;
class Fu01 {
    int numFu = 10;
    int num = 100;
    public void methodFu() {
        // 使用的是本类当中的，不会向下找子类的
        System.out.println(num);
    }
}
class Zi01 extends Fu01 {
    int numZi = 20;
    int num = 200;
    public void methodZi() {
        // 因为本类当中有num，所以这里用的是本类的num
        System.out.println(num);
    }
}
public class ExtendsField01 {
    public static void main(String[] args) {
        Fu01 fu01 = new Fu01(); // 创建父类对象
        System.out.println(fu01.numFu); // 10
        // 只能使用父类的东西，没有任何子类内容
        System.out.println("===========");

        Zi01 zi = new Zi01();

        System.out.println(zi.numFu); // 10
        System.out.println(zi.numZi); // 20
        System.out.println("===========");

        // 等号左边是谁，就优先用谁，没有则向上找。
        System.out.println(zi.num); // 优先子类，200
//        System.out.println(zi.abc); // 到处都没有，编译报错！
        System.out.println("===========");

        // 该方法属于谁，就优先用谁，没有则向上找。
        // 这个方法是子类的，优先用子类的，没有再向上找
        zi.methodZi(); // 200
        // 这个方法是在父类当中定义的，
        zi.methodFu(); // 100
    }
}
