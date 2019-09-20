package DataType;
public class DataTypeConvert02 {
    public static void main(String[] args) {
        //自动类型转换
        //数据范围从小到大
        double num = 2.5F;
        System.out.println(num);
        //强制类型转换
        int num2 = (int) 6000000000L;
        System.out.println(num2); //1705032704
        int num3 = (int) 3.99;
        System.out.println(num3); //3 舍弃小数位
        char zifu1 = 'A';
        System.out.println(zifu1 + 1);//66 A看作ASCII->65
        byte num4 = 40;
        byte num5 = 50;
        int result1 = num4 + num5;
        System.out.println(result1); //90
        short num6 = 60;
        short result2 = (short) (num4 + num6);
        //必须保证其和没超过short范围，否则会数据溢出
        System.out.println(result2); // 100
        //Notice（byte/short/char）
        byte num1 = /*(byte)*/ 30; // 右侧没有超过左侧的范围
        System.out.println(num1); // 30
        char zifu = /*(char)*/ 65;
        System.out.println(zifu); // A
    }
}
