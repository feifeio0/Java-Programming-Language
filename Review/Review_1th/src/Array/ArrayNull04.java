package Array;
public class ArrayNull04 {
    public static void main(String[] args) {
        int[] array = null;
        //array = new int[3];
        System.out.println(array[0]);
        //空指针异常 NullPointerException
        //原因：忘了new
        //解决：补上new
    }
}
