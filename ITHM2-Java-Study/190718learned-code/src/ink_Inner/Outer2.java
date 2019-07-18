package ink_Inner;

// 如果出现了重名现象，那么格式是：外部类名称.this.外部类成员变量名
public class Outer2 {

    int num = 10; // 外部类的成员变量

    public class Inner2 /*extends Object*/ {

        int num = 20; // 内部类的成员变量

        public void methodInner2() {
            int num = 30; // 内部类方法的局部变量
            System.out.println(num); // 局部变量，就近原则
            System.out.println(this.num); // 内部类的成员变量
            System.out.println(Outer2.this.num); // 外部类的成员变量
        }

    }

}