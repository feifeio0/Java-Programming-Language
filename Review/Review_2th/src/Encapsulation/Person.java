package Encapsulation;
/*
    问题描述：定义Person的年龄时，无法阻止不合理的数值被设置进来。
    解决方案：用private关键字将需要保护的成员变量进行修饰。

    一旦使用了private进行修饰，那么本类当中仍然可以随意访问。
    但是！超出了本类范围之外就不能再直接访问了。

    间接访问private成员变量，就是定义一对儿Getter/Setter方法
    必须叫setXxx或者是getXxx命名规则。
    对于Getter来说，不能有参数，返回值类型和成员变量对应；
    对于Setter来说，不能有返回值，参数类型和成员变量对应。
 */
public class Person {
    public String name; // 姓名（自己的）
    private int age; // 年龄
    public void show() {
        System.out.println("我叫：" + name + "，年龄：" + age);
    }

    // 这个成员方法，专门用于向age设置数据
    public void setAge(int num) {
        if (num < 100 && num >= 9) { // 如果是合理情况
            age = num;
        } else {
            System.out.println("数据不合理！");
        }
    }
    // 这个成员方法，专门获取age的数据
    public int getAge() {
        return age;
    }

    // 参数name是对方的名字
    // 成员变量name是自己的名字
    public void sayHello(String name) {
        System.out.println(name + "，你好。我是" + this.name);
        System.out.println(this);//person的地址值
    }
}
