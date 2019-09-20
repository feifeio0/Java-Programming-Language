package FlowControl;
public class Continue04 {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            if (i == 4) { // 如果当前是第4层
                continue; // 那么跳过当前次循环，马上开始下一次（第5层）
            }
            System.out.println(i + "层到了。");
        }
    }
}
