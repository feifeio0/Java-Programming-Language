package Extends;
/*
    局部变量：         直接写成员变量名
    本类的成员变量：    this.成员变量名
    父类的成员变量：    super.成员变量名
*/
class Fu02 {
    int num = 10;
}
class Zi02 extends Fu02 {
    int num = 20;
    public void method() {
        int num = 30;
        System.out.println(num); // 30，局部变量
        System.out.println(this.num); // 20，本类的成员变量
        System.out.println(super.num); // 10，父类的成员变量
    }
}
public class ExtendsField02 {
    public static void main(String[] args) {
        Zi02 zi = new Zi02();
        zi.method();
    }
}
