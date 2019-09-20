package OOP;

public class StudentUse02 {
    public static void main(String[] args) {
        // 1. 导包。
        // 同目录下无需导包

        // 2. 创建，格式：
        // 类名称 对象名 = new 类名称();
        // 根据Student类，创建了一个名为stu的对象
        Student stu = new Student();

        // 3. 使用其中的成员变量，格式：
        // 对象名.成员变量名
        System.out.println(stu.name); // null
        System.out.println(stu.age); // 0
        System.out.println("=============");

        // 改变对象当中的成员变量数值内容
        // 将右侧的字符串，赋值交给stu对象当中的name成员变量
        stu.name = "赵丽颖";
        stu.age = 18;
        System.out.println(stu.name); // 赵丽颖
        System.out.println(stu.age); // 18
        System.out.println("=============");

        // 4. 使用对象的成员方法，格式：
        // 对象名.成员方法名()
        stu.eat();
        stu.sleep();
        stu.study();
    }
}