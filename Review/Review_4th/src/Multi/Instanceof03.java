package Multi;
/*
    如何才能知道一个父类引用的对象，本来是什么子类？
    格式：
    对象 instanceof 类名称
    这将会得到一个boolean值结果，也就是判断前面的对象能不能当做后面类型的实例。
 */
public class Instanceof03 {
    public static void main(String[] args) {
        Animals03 animal = new Dog03(); // 本来是一只狗
        animal.eat(); // 狗吃SHIT

        // 如果希望调用子类特有方法，需要向下转型
        /*
        // 判断一下父类引用animal本来是不是Dog
        if (animal instanceof Dog03) {
            Dog03 dog = (Dog03) animal;
            dog.watchHouse();
        }
        // 判断一下animal本来是不是Cat
        if (animal instanceof Cat03) {
            Cat03 cat = (Cat03) animal;
            cat.catchMouse();
        }
        */
        giveMeAPet(new Dog03());//狗看家
    }

    public static void giveMeAPet(Animals03 animal) {
        if (animal instanceof Dog03) {
            Dog03 dog = (Dog03) animal;
            dog.watchHouse();
        }
        if (animal instanceof Cat03) {
            Cat03 cat = (Cat03) animal;
            cat.catchMouse();
        }
    }
}
