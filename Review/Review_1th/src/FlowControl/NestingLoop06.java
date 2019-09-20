package FlowControl;
//嵌套循环
//打印24h时间
public class NestingLoop06 {
    public static void main(String[] args) {
        for (int hour = 0; hour < 24; hour++) { // 外层控制小时
            for (int minute = 0; minute < 60; minute++) { // 内层控制小时之内的分钟
                System.out.println(hour + "点" + minute + "分");
            }
        }
    }
}
