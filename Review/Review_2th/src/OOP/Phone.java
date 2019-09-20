package OOP;

public class Phone {
    // 成员变量（属性）
    public String brand;// 品牌
    public double price;// 价格
    public String color;// 颜色

    // 成员方法（行为）
    public void call(String who) {
        System.out.println("给" + who + "打电话");
    }
    public void sendMessage(){
        System.out.println("群发短信");
    }
}