package Encapsulation;
/*
    这样标准的类也叫做Java Bean
*/
public class JavaBean06 {
    //所有的成员变量都要使用private关键字修饰
    private String name; // 姓名
    private int age; // 年龄
    //编写一个无参数的构造方法
    public JavaBean06() {
    }
    //编写一个全参数的构造方法
    public JavaBean06(String name, int age) {
        this.name = name;
        this.age = age;
    }
    //为每一个成员变量编写一对儿Getter/Setter方法
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
