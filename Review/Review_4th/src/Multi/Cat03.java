package Multi;

public class Cat03 extends Animals03 {
    @Override
    public void eat() {
        System.out.println("猫吃鱼");
    }

    // 子类特有方法
    public void catchMouse() {
        System.out.println("猫抓老鼠");
    }
}
