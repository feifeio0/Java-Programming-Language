package Encapsulation;
/*
    this.成员变量名
        “通过谁调用的方法，谁就是this。”
    注意事项：
        1. 构造方法的名称必须和所在的类名称完全一样，就连大小写也要一样
        2. 构造方法不要写返回值类型，连void都不写
        3. 构造方法不能return一个具体的返回值
        4. 如果没有编写任何构造方法，那么编译器将会默认赠送一个空参构造方法。
        5. 一旦编写了至少一个构造方法，那么编译器将不再赠送。
        6. 构造方法也是可以进行重载的。
 */
public class Student {
    // 成员变量
    private String name;
    private int age;

    // 无参数的构造方法
    public Student() {
        System.out.println("无参构造方法执行啦！");
    }

    // 全参数的构造方法
    public Student(String name, int age) {
        System.out.println("全参构造方法执行啦！");
        this.name = name;
        this.age = age;
    }

    // Getter Setter
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }
}
