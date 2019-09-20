package Array;
public class Array01 {
    public static void main(String[] args) {
        // 创建一个数组，里面可以存放300个int数据
        // 格式：数据类型[] 数组名称 = new 数据类型[数组长度];
        int[] arrayA = new int[300];
        // 创建一个数组，能存放10个double类型的数据
        double[] arrayB = new double[10];
        // 创建一个数组，能存放5个字符串
        String[] arrayC = new String[5];
        // 直接创建一个数组，里面装的全都是int数字，具体为：5、15、25、40
        int[] arrayD = new int[] { 5, 15, 25, 40 };
        // 创建一个数组，用来装字符串："Hello"、"World"、"Java"
        String[] arrayE = new String[] { "Hello", "World", "Java" };
        // 省略格式的静态初始化
        int[] arrayF = { 10, 20, 30 };
        // 静态初始化的标准格式，可以拆分成为两个步骤
        int[] arrayG;
        arrayG = new int[] { 11, 21, 31 };
        // 动态初始化也可以拆分成为两个步骤
        int[] arrayH;
        arrayH = new int[5];
    }
}
