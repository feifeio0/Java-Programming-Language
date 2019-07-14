/*
题目要求：
定义一个方法，用来打印指定次数的HelloWorld。
 */
public class MethodTestHello {
    public static void main(String[] args) {
        printCount(10);
    }
    public static void printCount(int num) {
        //返回值：无返回值
        //方法名称：printCount（小驼峰）
        //参数列表：次数int
        for (int i = 0; i < num; i++) {
            System.out.println("Hello, World!" + (i + 1));
        }
    }
}
