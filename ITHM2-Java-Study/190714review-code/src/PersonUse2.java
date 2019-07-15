import ink.hanfei.Person;

public class PersonUse2 {
    public static void main(String[] args) {
        Person person = new Person();
        // 设置我自己的名字
        person.name = "王健林";
        person.sayHello("王思聪");//王思聪，你好。我是王健林

        System.out.println(person); // 地址值
    }
}
