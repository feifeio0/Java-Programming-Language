import ink.hanfei.Student2;

public class Student2Use {
    public static void main(String[] args) {
        Student2 stu1 = new Student2(); // 无参构造
        stu1.setAge(20);
        stu1.setName("hanfei");
        System.out.println("姓名：" + stu1.getName() + "，年龄：" + stu1.getAge());
        System.out.println("============");

        Student2 stu2 = new Student2("赵丽颖", 20); // 全参构造
        System.out.println("姓名：" + stu2.getName() + "，年龄：" + stu2.getAge());
        // 如果需要改变对象当中的成员变量数据内容，仍然还需要使用setXxx方法
        stu2.setAge(21); // 改变年龄
        System.out.println("姓名：" + stu2.getName() + "，年龄：" + stu2.getAge());
    }
}
