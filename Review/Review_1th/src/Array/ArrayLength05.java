package Array;

public class ArrayLength05 {
    public static void main(String[] args) {
        int[] arrayA = {10, 20, 30, 3, 5, 4, 6, 7, 8, 8, 65, 4, 44, 6, 10, 3, 5, 4, 6, 7, 8, 8, 65, 4};
        int len = arrayA.length;
        System.out.println("arrayA数组的长度是：" + len);
        System.out.println("=============");

        int[] arrayB = new int[3];
        System.out.println(arrayB.length); // 3
        arrayB = new int[5];
        System.out.println(arrayB.length); // 5
    }
}
