package Final;
/*
    一旦使用final用来修饰局部变量，那么这个变量就不能进行更改。
    “一次赋值，终生不变”
*/
public class FinalLocalVar03 {
    public static void main(String[] args) {
        int num1 = 10;
        System.out.println(num1); // 10
        num1 = 20;
        System.out.println(num1); // 20
        //普通变量是可变的

        // “一次赋值，终生不变”
        final int num2 = 200;
        System.out.println(num2); // 200

//        num2 = 250; // 错误写法！不能改变！
//        num2 = 200; // 错误写法！

        // 正确写法！只要保证有唯一一次赋值即可
        final int num3;
        num3 = 30;
    }
}
