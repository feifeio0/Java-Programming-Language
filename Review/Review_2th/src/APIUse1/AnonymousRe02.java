package APIUse1;
/*
    如果确定有一个对象只需要使用唯一的一次，就可以用匿名对象。
    匿名对象可以做参数和返回值
 */
import java.util.Scanner;
public class AnonymousRe02 {
    public static void main(String[] args) {
        // 普通使用方式
//        Scanner sc = new Scanner(System.in);
//        int num = sc.nextInt();

        // 匿名对象的方式
        int num = new Scanner(System.in).nextInt();
        System.out.println("输入的是：" + num);

        // 使用一般写法传入参数
//        Scanner sc = new Scanner(System.in);
//        methodParam(sc);

        // 使用匿名对象来进行传参
        methodParam(new Scanner(System.in));

        Scanner sc = methodReturn();
        num = sc.nextInt();
        System.out.println("输入的是：" + num);
    }

    public static void methodParam(Scanner sc) {
        int num = sc.nextInt();
        System.out.println("输入的是：" + num);
    }

    public static Scanner methodReturn() {
//        Scanner sc = new Scanner(System.in);
//        return sc;
        return new Scanner(System.in);
    }
}
