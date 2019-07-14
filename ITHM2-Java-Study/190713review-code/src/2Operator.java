/*
运算符+ - / * %
自增运算符++
自减运算符--
赋值运算符=
复合赋值运算符+=...
比较运算符><>=<= == !=
逻辑运算符&& || ！
三元运算符 ？
*/
public class Operator {
    public static void main(String[] args) {
        // + + +
        String str1 = "Hello";
        System.out.println(str1); // Hello
        System.out.println("Hello" + "World"); // HelloWorld
        String str2 = "Java";
        System.out.println(str2 + 20); // Java20
        //自增自减运算符
        int num1 = 10;
        System.out.println(num1++); // 10
        System.out.println(++num1); // 12
        int num2 = 10;
        System.out.println(num2--);//10
        System.out.println(--num2);//8
        //复合赋值运算
        int a = 10;
        a += 5;
        System.out.println(a); // 15
        //比较运算符
        System.out.println(10 < 20); // true
        System.out.println(20 != 20); // false
        System.out.println(10 == 10); // true
        // (1 < x < 3) 错误写法！不能连着写。
        //逻辑运算符（与或非）
        System.out.println(3 < 4 && 10 > 5); // true
        System.out.println(false || false); // false
        System.out.println(!true); // false
        //三元运算符？
        int x = 10;
        int y = 20;
        int max = x > y ? x : y; // 最大值的变量
        int max2;
        if(x>y)
        {
            max2 = x;
        }
        else
        {
            max2 = y;
        }
        System.out.println("最大值：" + max); // 20
        System.out.println("最大值：" + max2); // 20
    }
}
