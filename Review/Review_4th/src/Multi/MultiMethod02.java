package Multi;

class Fu02 /*extends Object*/ {
    int num = 10;
    public void showNum() {
        System.out.println(num);
    }
    public void method() {
        System.out.println("父类方法");
    }
    public void methodFu() {
        System.out.println("父类特有方法");
    }
}
class Zi02 extends Fu02 {
    int num = 20;
    int age = 16;
    @Override
    public void showNum() {
        System.out.println(num);
    }
    @Override
    public void method() {
        System.out.println("子类方法");
    }
    public void methodZi() {
        System.out.println("子类特有方法");
    }
}
/*
访问成员变量的两种方式：
    1. 直接通过对象名称访问成员变量：看等号左边是谁，优先用谁，没有则向上找。
    2. 间接通过成员方法访问成员变量：看该方法属于谁，优先用谁，没有则向上找。
成员方法的访问规则是：
    看new的是谁，就优先用谁，没有则向上找。
        口诀：编译看左边，运行看右边。
        //不出红线就叫编译，运行到地方。
    对比一下：
        成员变量：编译看左边，运行还看左边。
        成员方法：编译看左边，运行看右边。
*/
public class MultiMethod02 {
    public static void main(String[] args) {
        // 使用多态的写法，父类引用指向子类对象
        Fu02 obj = new Zi02();
        System.out.println(obj.num); // 10
//        System.out.println(obj.age); // 错误写法！
        // 子类没有覆盖重写，就是父：10
        // 子类如果覆盖重写，就是子：20
        obj.showNum();//20
        System.out.println("=============");
        obj.method(); // 子类方法
        obj.methodFu(); // 父类特有方法
        // 编译看左边，左边是Fu，Fu当中没有methodZi方法，所以编译报错。
//        obj.methodZi(); // 错误写法！
        //所以就是说多态写法是无法执行父类中没有的子类特有方法的
    }
}
