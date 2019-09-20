package APIUse2;
/*
    题目：
        计算在-10.8到5.9之间，绝对值大于6或者小于2.1的整数有多少个？
    分析：
        1. 既然已经确定了范围，for循环
        2. 起点位置-10.8应该转换成为-10，两种办法：
            2.1 可以使用Math.ceil方法，向上（向正方向）取整
            2.2 强转成为int，自动舍弃所有小数位
        3. 每一个数字都是整数，所以步进表达式应该是num++，这样每次都是+1的。
        4. 如何拿到绝对值：Math.abs方法。
        5. 一旦发现了一个数字，需要让计数器++进行统计。
        备注：如果使用Math.ceil方法，-10.8可以变成-10.0。注意double也是可以进行++的。
*/
public class MathTest02 {
    public static void main(String[] args) {
        int count = 0;// 符合要求的数量
        double max = 5.9;
        double min = -10.8;
        // 这样处理，变量i就是区间之内所有的整数
        double min2 = Math.ceil(min);
        for(double i = min2;i<max;i++)
        {
            double abs = Math.abs(i);// 绝对值
            if(abs>6||abs<2.1)
            {
                System.out.println((int)i);
                count++;
            }
        }
        System.out.println("总共有：" + count + "个"); // 9
    }
}
