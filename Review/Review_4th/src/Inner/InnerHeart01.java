package Inner;
/*
    如果一个事物的内部包含另一个事物，那么这就是一个类内部包含另一个类。
    例如：身体和心脏的关系。又如：汽车和发动机的关系。
    分类：
        1. 成员内部类
        2. 局部内部类（包含匿名内部类）
    成员内部类的定义格式：
        修饰符 class 外部类名称 {
            修饰符 class 内部类名称 {
                // ...
            }
            // ...
        }
    注意：内用外，随意访问；外用内，需要内部类对象。
    ==========================
    如何使用成员内部类？有两种方式：
        1. 间接方式：在外部类的方法当中，使用内部类；然后main只是调用外部类的方法。
        2. 直接方式，公式：类名称 对象名 = new 类名称();
        【外部类名称.内部类名称 对象名 = new 外部类名称().new 内部类名称();】
 */
class Body1 { // 外部类
    public class Heart { // 成员内部类
        // 内部类的方法
        public void beat() {
            System.out.println("心脏跳动：蹦蹦蹦！");
            System.out.println("我叫：" + name); // 正确写法！
        }
    }
    // 外部类的成员变量
    private String name;
    // 外部类的方法
    public void methodBody() {
        System.out.println("外部类的方法");
        new Heart().beat();
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}
public class InnerHeart01 {
    public static void main(String[] args) {
        Body1 body = new Body1(); // 外部类的对象
        // 通过外部类的对象，调用外部类的方法，里面间接在使用内部类Heart
        body.methodBody();
        //心脏跳动：蹦蹦蹦！
        //我叫：null
        System.out.println("=====================");

        // 按照公式写：
        Body1.Heart heart = new Body1().new Heart();
        heart.beat();
        //心脏跳动：蹦蹦蹦！
        //我叫：null
    }
}
