package Array;
public class ArrayUse02 {
    public static void main(String[] args) {
        // 静态初始化的省略格式
        int[] array = { 10, 20, 30 };
        System.out.println(array); // [I@1c53fd30
        // 直接打印数组当中的元素
        System.out.println(array[0]); // 10
        System.out.println(array[1]); // 20
        System.out.println(array[2]); // 30
        System.out.println("=============");
        // 也可以将数组当中的某一个单个元素，赋值交给变量
        int num = array[1];
        System.out.println(num); // 20
        // 动态初始化一个数组
        int[] arrayA = new int[3];
        System.out.println(arrayA); // [I@50cbc42f
        System.out.println(arrayA[0]); // 0
        System.out.println(arrayA[1]); // 0
        System.out.println(arrayA[2]); // 0
        System.out.println("=================");
        // 将数据123赋值交给数组array当中的1号元素
        arrayA[1] = 123;
        System.out.println(arrayA[0]); // 0
        System.out.println(arrayA[1]); // 123
        System.out.println(arrayA[2]); // 0
    }
}
