package Method;
public class MethodDefine01 {
    public static void main(String[] args) {
        // 单独调用
        sum(10, 20);
        // 打印调用
        System.out.println(sum(10, 20)); // 30
        // 赋值调用
        int number = sum(15, 25);
        number += 100;
        System.out.println("变量的值：" + number); // 140
    }
    public static int sum(int a,int b)
    //返回值：有返回值，类型为int
    //方法名称：sum
    //参数列表：int a, int b
    {
        return a+b;
    }
}
