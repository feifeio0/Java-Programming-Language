package ink_Inner;

public class Inner2 {
    public static void main(String[] args) {
        // 外部类名称.内部类名称 对象名 = new 外部类名称().new 内部类名称();
        Outer2.Inner2 obj = new Outer2().new Inner2();
        obj.methodInner2();
    }
}
