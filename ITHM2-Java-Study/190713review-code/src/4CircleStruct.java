/*
循环结构的基本组成部分，一般可以分成四部分：
1. 初始化语句：在循环开始最初执行，而且只做唯一一次。
2. 条件判断：如果成立，则循环继续；如果不成立，则循环退出。
3. 循环体：重复要做的事情内容，若干行语句。
4. 步进语句：每次循环之后都要进行的扫尾工作，每次循环结束之后都要执行一次。
*/
public class CircleStruct {
    public static void main(String[] args) {
        //for循环
        for (int i = 1; i <= 100; i++) {
            //1. 初始化语句// 2. 条件判断3. 步进语句
            System.out.println("我错啦！原谅我吧！" + i);
            // 4. 循环体
        }
        //while循环
        int i = 1; // 1. 初始化语句
        while (i <= 10)
        { // 2. 条件判断
            System.out.println("我错啦！" + i); // 3. 循环体
            i++; // 4. 步进语句
        }
        //do-while循环
        i = 1; // 1. 初始化语句
        do {
            System.out.println("原谅你啦！起来吧！地上怪凉！" + i); // 3. 循环体
            i++; // 4. 步进语句
        } while (i <= 10); // 2. 条件判断
        //对比
        /*
        1. 如果条件判断从来没有满足过，那么for循环和while循环将会执行0次，
        但是do-while循环会执行至少一次。
        2. for循环的变量在小括号当中定义，只有循环内部才可以使用。
        while循环和do-while循环初始化语句本来就在外面，所以出来循环之后还可以继续使用
        */
    }
}
