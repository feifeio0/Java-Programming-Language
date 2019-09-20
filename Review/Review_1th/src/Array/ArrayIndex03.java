package Array;
public class ArrayIndex03 {
    public static void main(String[] args) {
        int[] array = { 15, 25, 35 };
        System.out.println(array[0]); //15
        System.out.println(array[1]); // 25
        System.out.println(array[2]); // 35
        // 并不存在3号元素，所以发生异常
        System.out.println(array[3]);
        //ArrayIndexOutOfBoundsException数组索引越界异常
    }
}
