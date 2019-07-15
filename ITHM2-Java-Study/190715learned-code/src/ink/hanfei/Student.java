package ink.hanfei;
//对于姓名年龄学号来说，每个对象都有自己独立的数据。
//但是对于所在教室来说，这应该是多个对象共享同一份数据才行。
//所有本类对象共享同一份static，

public class Student {
    private int id; // 学号
    private String name; // 姓名
    private int age; // 年龄
    public static String room; // 所在教室
    private static int idCounter = 0; // 学号计数器，每当new了一个新对象的时候，计数器++

    public Student() {
        this.id = ++idCounter;//自动生成学号
    }

    public Student(String name, int age) {
        this.id = ++idCounter;//自动生成学号
        this.name = name;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

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
