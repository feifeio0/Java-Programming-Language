package Multi;
/*
    1.对象的向上转型，其实就是多态写法
        格式：父类名称 对象名 = new 子类名称（）;
        含义：右侧创建一个子类对象，把它当作父类来看待使用。
    向上转型一定是安全的，没有问题的，正确的。但是也有一个弊端：
    对象一旦向上转型为父类，那么就无法调用子类原本特有的内容。

    解决方案：用对象的向下转型【还原】。
        格式：子类名称 对象名 = （子类名称）父类对象；
        含义：将父类对象，[还原]成为本来的子类对象。
        //本来是某一子类对象才能变成哪一种子类对象。
 */
public class DownCast03 {
    public static void main(String[] args) {
        // 对象的向上转型，就是：父类引用指向之类对象。
        Animals03 animal = new Cat03(); // 本来创建的时候是一只猫
        animal.eat(); // 猫吃鱼

//        animal.catchMouse(); // 错误写法！

        // 向下转型，进行“还原”动作
        Cat03 cat = (Cat03) animal;
        cat.catchMouse(); // 猫抓老鼠

        // 下面是错误的向下转型
        // 本来new的时候是一只猫，现在非要当做狗
        // 错误写法！编译不会报错，但是运行会出现异常：
        // java.lang.ClassCastException，类转换异常
        Dog03 dog = (Dog03) animal;
    }
}
