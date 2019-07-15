/*
题目：
自定义4个学生对象，添加到集合，并遍历。
思路：
1. 自定义Student学生类，四个部分。
2. 创建一个集合，用来存储学生对象。泛型：<Student>
3. 根据类，创建4个学生对象。
4. 将4个学生对象添加到集合中：add
5. 遍历集合：for、size、get
 */
import ink.hanfei.Student;

import java.util.ArrayList;
public class ArrayListStudent {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        Student one = new Student("小一",11);
        Student two = new Student("小二",12);
        Student three = new Student("小三",13);
        Student four = new Student("小四",14);

        list.add(one);
        list.add(two);
        list.add(three);
        list.add(four);

        // 遍历集合
        for(int i=0;i<list.size();i++)
        {
            Student stu = list.get(i);
            System.out.println("姓名：" + stu.getName() + "，年龄" + stu.getAge());
        }
    }
}
