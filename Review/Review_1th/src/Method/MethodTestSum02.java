package Method;
/*
题目要求：
定义一个方法，用来求出1-100之间所有数字的和值。
 */
public class MethodTestSum02 {
    public static void main(String[] args)
    {
        System.out.println("结果是"+getSum());//5050
    }
    public static int getSum()
    //返回值：有返回值，结果是一个int型
    //方法名称：getSum（小驼峰）
    //参数列表：无
    {
        int sum = 0;
        for (int i = 1; i <= 100; i++)
        {
            sum += i;
        }
        return sum;
    }
}
