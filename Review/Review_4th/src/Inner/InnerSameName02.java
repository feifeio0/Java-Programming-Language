package Inner;

// 如果出现了重名现象，那么格式是：外部类名称.this.外部类成员变量名
class Outer2 {
    int num = 10; // 外部类的成员变量
    public class Inner2 /*extends Object*/ {
        int num = 20; // 内部类的成员变量
        public void methodInner2() {
            int num = 30; // 内部类方法的局部变量
            System.out.println(num); // 局部变量，就近原则30
            System.out.println(this.num); // 内部类的成员变量20
            System.out.println(Outer2.this.num); // 外部类的成员变量10
        }
    }
}
public class InnerSameName02 {
    public static void main(String[] args) {
        // 外部类名称.内部类名称 对象名 = new 外部类名称().new 内部类名称();
        Outer2.Inner2 obj = new Outer2().new Inner2();
        obj.methodInner2();
    }
}
