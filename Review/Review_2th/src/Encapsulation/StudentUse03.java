package Encapsulation;
import OOP.Student;

public class StudentUse03 {
    public static void main(String[] args) {
        Student stu = new Student();

        stu.setName("鹿晗");
        stu.setAge(20);
        stu.setMale(true);

        System.out.println("姓名：" + stu.getName());//姓名：鹿晗
        System.out.println("年龄：" + stu.getAge());//年龄：20
        System.out.println("是不是爷们儿：" + stu.isMale());//是不是爷们儿：true
    }
}
