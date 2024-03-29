/*
    数组的概念：是一种容器，可以同时存放多个数据值。
    数组的特点：
        1. 数组是一种引用数据类型
        2. 数组当中的多个数据，类型必须统一
        3. 数组的长度在程序运行期间不可改变
    数组的初始化：在内存当中创建一个数组，并且向其中赋予一些默认值。
    两种常见的初始化方式：
        1. 动态初始化（指定长度）：在创建数组的时候，直接指定数组当中的数据元素个数。
        2. 静态初始化（指定内容）在创建数组的时候，不直接指定数据个数多少，
                                 而是直接将具体的数据内容进行指定。
    动态初始化数组的格式：
        数据类型[] 数组名称 = new 数据类型[数组长度];
    静态初始化基本格式：
        数据类型[] 数组名称 = new 数据类型[] { 元素1, 元素2, ... };
    静态初始化省略格式：
            数据类型[] 数组名称 = { 元素1, 元素2, ... };
    注意事项：
        1. 静态初始化没有直接指定长度，但是仍然会自动推算得到长度。
        2. 静态初始化标准格式可以拆分成为两个步骤。
        3. 动态初始化也可以拆分成为两个步骤。
        4. 静态初始化一旦使用省略格式，就不能拆分成为两个步骤了。
    使用建议：
  如果不确定数组当中的具体内容，用动态初始化；否则，已经确定了具体的内容，用静态初始化。
*/
public class Array {
    public static void main(String[] args) {
        // 创建一个数组，里面可以存放300个int数据
        // 格式：数据类型[] 数组名称 = new 数据类型[数组长度];
        int[] arrayA = new int[300];
        // 创建一个数组，能存放10个double类型的数据
        double[] arrayB = new double[10];
        // 创建一个数组，能存放5个字符串
        String[] arrayC = new String[5];
        // 直接创建一个数组，里面装的全都是int数字，具体为：5、15、25
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