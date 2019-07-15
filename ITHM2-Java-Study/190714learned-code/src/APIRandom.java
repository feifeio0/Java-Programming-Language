/*
Random类用来生成随机数字。使用起来也是三个步骤：
1. 导包
import java.util.Random;
2. 创建
Random r = new Random(); // 小括号当中留空即可
3. 使用
获取一个随机的int数字（范围是int所有范围，有正负两种）：int num = r.nextInt()
获取一个随机的int数字（参数代表了范围，左闭右开区间）：int num = r.nextInt(3)
实际上代表的含义是：[0,3)，也就是0~2
 */
import java.util.Random;//1.导包
public class APIRandom {
    public static void main(String[] args) {
        Random r = new Random();//2.创建
        int num = r.nextInt();//3.使用1
        System.out.println("随机数是：" + num);
        for (int i = 0; i < 100; i++) {
            int num2 = r.nextInt(10); // 3.使用2 范围实际上是0~9
            System.out.println(num2);
        }
    }
}
