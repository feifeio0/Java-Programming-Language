/*
常量的分类
1.字符串常量2.整数常量3.浮点数常量
4.字符常量5.布尔常量6.空常量
变量注意
1.变量名不能重复
2.变量使用不能超过作用域的范围
3.变量一定先赋值再使用
 */
public class VariableConst {
    public static void main(String[] args) {
        //整型变量（int）
        int num1;
        num1 = 10;
        System.out.println(num1);
        int num2 = 20;
        System.out.println(num2);
        //字节型变量(byte)
        byte num3 = 30;//小心超范围
        System.out.println(num3);
        //短整型与长整型变量(short&&long)
        short num4 = 50;//小心超范围
        System.out.println(num4);
        long num5 = 170700029L;//L不能忘
        System.out.println(num5);
        //浮点型变量(单精度float双精度double)
        float num6 = 2.5F;//F不能忘
        System.out.println(num6);
        double num7 = 1.2;
        System.out.println(num7);
        //字符型变量（char）
        char zifu1 = 'A';
        System.out.println(zifu1);
        //布尔型变量（bool）
        boolean bool1 = true;
        System.out.println(bool1);
    }
}
