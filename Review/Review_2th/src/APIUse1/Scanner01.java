package APIUse1;
/*
    API看三点  包路径 构造方法 成员方法
    Scanner类的功能：可以实现键盘输入数据，到程序当中。
    三步：1.导包 2.创建 3.使用
 */
import java.util.Scanner; // 1. 导包
public class Scanner01 {
    public static void main(String[] args)
    {
        // 2.创建
        // System.in代表从键盘进行输入
        Scanner sc = new Scanner(System.in);

        // 3.获取键盘输入的int数字
        int num = sc.nextInt();
        System.out.println("输入的int数字是：" + num);

        // 4.获取键盘输入的字符串
        String str = sc.next();
        System.out.println("输入的字符串是：" + str);
    }
}
