package FlowControl;
public class Break04 {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            // 如果希望从第4次开始，后续全都不要了，就要打断循环
            if (i == 4) { // 如果当前是第4次
                break; // 那么就打断整个循环
            }
            System.out.println("Hello" + i);
        }
    }
}
