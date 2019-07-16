package ink;

/*
在继承的关系中，“子类就是一个父类”。也就是说，子类可以被当做父类看待。
例如父类是员工，子类是讲师，那么“讲师就是一个员工”。关系：is-a。
//共性抽取
定义父类（基类）的格式：（一个普通的类定义）
public class 父类名称 {
    // ...
}
定义子类(派生类)的格式：
public class 子类名称 extends 父类名称 {
    // ...
}
 */
public class Extends1 {
    public static void main(String[] args) {
        // 创建了一个子类对象
        Teacher1 teacher1 = new Teacher1();
        // Teacher类当中虽然什么都没写，但是会继承来自父类的method方法。
        teacher1.method();

        // 创建另一个子类助教的对象
        Assistant1 assistant1 = new Assistant1();
        assistant1.method();
    }
}
