package ink;

public class Zi7 extends Fu7{
    int num = 20;

    public Zi7() {
//        super(); // 这一行不再赠送
        this(123); // 本类的无参构造，调用本类的有参构造
//        this(1, 2); // 错误写法！
    }

    public Zi7(int n) {
        this(1, 2);
    }

    public Zi7(int n, int m) {
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
