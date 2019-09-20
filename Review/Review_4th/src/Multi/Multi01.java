package Multi;
/*
    同一行为，通过不同事物，体现不同的形态~
    代码当中体现多态性，其实就是一句话：父类引用指向子类对象。
    前提：
        继承/实现二选一
        方法重写
    格式：
        父类名称 对象名 = new 子类名称();
            //左父右子 子类对象当作父类进行使用
    或者：
        接口名称 对象名 = new 实现类名称();
 */
class Fu01 {
    public void method() {
        System.out.println("父类方法");
    }
    public void methodFu() {
        System.out.println("父类特有方法");
    }
}
class Zi01 extends Fu01{
    @Override
    public void method() {
        System.out.println("子类方法");
    }
}
public class Multi01 {
    public static void main(String[] args) {
        // 使用多态的写法
        // 左侧父类的引用，指向了右侧子类的对象
        Fu01 obj = new Zi01();
        obj.method();//子类方法
        obj.methodFu();//父类特有方法
    }
}
