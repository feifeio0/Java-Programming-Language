package Method;
/*
方法的重载（Overload）：多个方法的名称一样，但是参数列表不一样。
 */
public class MethodOverload03 {
    public static void main(String[] args) {
        System.out.println(sum(10, 20)); // 两个参数的方法(int+int)
        System.out.println(sum(10.5, 20)); // 两个参数的方法(double+int)
        System.out.println(sum(10.5, 20.7)); // 两个参数的方法(double+double)
        System.out.println(sum(10, 20.5)); // 两个参数的方法(int+double)
        System.out.println(sum(10, 20, 30)); // 三个参数的方法
        System.out.println(sum(10, 20, 30, 40)); // 四个参数的方法
    }
    public static double sum(int a, double b) {
        return (a + b);
    }
    public static double sum(double a, int b) {
        return (a + b);
    }
    public static double sum(double a, double b) {
        return (a + b);
    }
    public static int sum(int a, int b) {
        System.out.println("有2个参数的方法执行！");
        return a + b;
    }
    public static int sum(int a, int b, int c) {
        System.out.println("有3个参数的方法执行！");
        return a + b + c;
    }
    public static int sum(int a, int b, int c, int d) {
        System.out.println("有4个参数的方法执行！");
        return a + b + c + d;
    }
}
