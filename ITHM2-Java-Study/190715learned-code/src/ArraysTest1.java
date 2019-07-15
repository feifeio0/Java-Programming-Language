/*
题目：
请使用Arrays相关的API，将一个随机字符串中的所有字符升序排列，并倒序打印。
 */
import java.util.Arrays;
import java.util.Scanner;
public class ArraysTest1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        // 如何进行升序排列：sort
        // 必须是一个数组，才能用Arrays.sort方法
        // String --> 数组，用toCharArray
        char[] chars = str.toCharArray();
        Arrays.sort(chars);//对字符数组升序排列
        // 倒序遍历
        for (int i = chars.length - 1; i >= 0; i--) {
            System.out.print(chars[i]+" ");
        }
    }
}
