package DataType;
public class VariableConst01 {
    public static void main(String[] args) {
        //整型变量（int）
        //4字节
        int num1;
        num1 = 10;
        System.out.println(num1);
        int num2 = 20;
        System.out.println(num2);
        //字节型变量(byte)
        //1字节
        byte num3 = 30;//小心超范围
        System.out.println(num3);
        //短整型与长整型变量(short&&long)
        //2&8字节
        short num4 = 50;//小心超范围
        System.out.println(num4);
        long num5 = 170700029L;//L不能忘
        System.out.println(num5);
        //浮点型变量(单精度float双精度double)
        //4&8字节
        float num6 = 2.5F;//F不能忘
        System.out.println(num6);
        double num7 = 1.2;
        System.out.println(num7);
        //字符型变量（char）
        //2字节
        char zifu1 = 'A';
        System.out.println(zifu1);
        //布尔型变量（bool）
        //1字节
        boolean bool1 = true;
        System.out.println(bool1);
    }
}
