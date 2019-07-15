import ink.hanfei.Phone;

public class PhoneUse {
    public static void main(String[] args) {
        // 根据Phone类，创建一个名为one的对象
        // 格式：类名称 对象名 = new 类名称();
        Phone one = new Phone();
        System.out.println(one.brand); // null
        System.out.println(one.price); // 0.0
        System.out.println(one.color); // null
        System.out.println("=========");
        one.brand = "苹果";
        one.price = 8388.0;
        one.color = "黑色";
        System.out.println(one.brand); // 苹果
        System.out.println(one.price); // 8388.0
        System.out.println(one.color); // 黑色
        System.out.println("=========");
        one.call("乔布斯"); // 给乔布斯打电话
        one.sendMessage(); // 群发短信
        System.out.println("=========");

        Phone two = new Phone();
        System.out.println(two.brand); // null
        System.out.println(two.price); // 0.0
        System.out.println(two.color); // null
        System.out.println("=========");
        two.brand = "三星";
        two.price = 5999.0;
        two.color = "蓝色";
        System.out.println(two.brand); // 三星
        System.out.println(two.price); // 5999.0
        System.out.println(two.color); // 蓝色
        System.out.println("=========");
        two.call("欧巴"); // 给欧巴打电话
        two.sendMessage(); // 群发短信

        // 将two当中保存的对象地址值赋值给three
        Phone three = two;
        System.out.println(three.brand); // 三星
        System.out.println(three.price); // 5999.0
        System.out.println(three.color); // 蓝色
        System.out.println("=========");
        two.brand = "星";
        two.price = 599.0;
        two.color = "蓝";
        System.out.println(three.brand); // 星
        System.out.println(three.price); // 599.0
        System.out.println(three.color); // 蓝
        System.out.println("=========");
        three.brand = "星11";
        three.price = 59911.0;
        three.color = "蓝11";
        System.out.println(three.brand); // 星11
        System.out.println(three.price); // 59911.0
        System.out.println(three.color); // 蓝11
    }
}
