package Final;
/*
    对于成员变量来说，如果使用final关键字修饰，那么这个变量也照样是不可变。
        1. 由于成员变量具有默认值，所以用了final之后必须手动赋值，不会再给默认值了。
        2. 对于final的成员变量，要么使用直接赋值，要么通过构造方法赋值。二者选其一。
        3. 必须保证类当中所有重载的构造方法，都最终会对final的成员变量进行赋值。
 */
class Student04 {
    private String name;
    public Student04() {
    }
    public Student04(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}

class Person04{
    private final String name/* = "鹿晗"*/;//2选1
    public Person04() {
        name = "关晓彤";//2选1
    }
    public Person04(String name) {
        this.name = name;//2选1
    }
    public String getName() {
        return name;
    }
//    public void setName(String name) {
//        this.name = name;
//    }
}

public class FinalMemberVar04 {
    public static void main(String[] args) {
        // 对于基本类型来说，不可变说的是变量当中的数据不可改变
        // 对于引用类型来说，不可变说的是变量当中的地址值不可改变
        Student04 stu1 = new Student04("赵丽颖");
        System.out.println(stu1);//Final.Student04@50cbc42f
        System.out.println(stu1.getName()); // 赵丽颖
        stu1 = new Student04("霍建华");
        System.out.println(stu1);//Final.Student04@75412c2f
        System.out.println(stu1.getName()); // 霍建华
        System.out.println("===============");

        final Student04 stu2 = new Student04("高圆圆");
        // 错误写法！final的引用类型变量，其中的地址不可改变
//        stu2 = new Student("赵又廷");
        System.out.println(stu2.getName()); // 高圆圆
        stu2.setName("高圆圆圆圆圆圆");
        System.out.println(stu2.getName()); // 高圆圆圆圆圆圆
    }
}
