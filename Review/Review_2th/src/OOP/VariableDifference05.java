package OOP;

public class VariableDifference05 {
    static String name; // 成员变量
    public static void main(String[] args) {
        String name; // 成员变量默认值null
        methodA();
        methodB(1);
    }

    public static void methodA() {
        int num = 20; // 局部变量
        System.out.println(num);//20
        System.out.println(name);//null
    }

    public static void methodB(int param) { // 方法的参数就是局部变量
        // 参数在方法调用的时候，必然会被赋值的。
        System.out.println(param);//1

        int age; // 局部变量
//        System.out.println(age); // 没赋值不能用

//        System.out.println(num); // 错误写法！
        System.out.println(name);//null
    }
}
