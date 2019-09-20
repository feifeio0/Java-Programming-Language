package Array;
/*
    找到数组中最大的和最小的值
 */
public class ArrayCompareTest07 {
    public static void main(String[] args) {
        int[] array = { 5, 15, 30, 20, 10000, 30, 35 };
        int max = array[0]; // 比武擂台
        for (int i = 1; i < array.length; i++) {
            // 如果当前元素，比max更大，则换人
            if (array[i] > max) {
                max = array[i];
            }
        }
        // 谁最后最厉害，就能在max当中留下谁的战斗力
        System.out.println("最大值：" + max);
        int min = array[0]; // 比武擂台
        for (int i = 1; i < array.length; i++) {
            // 如果当前元素，比min更小，则换人
            if (array[i] < min) {
                min = array[i];
            }
        }
        System.out.println("最小值：" + min);
    }
}
