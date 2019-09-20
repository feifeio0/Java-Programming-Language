package OOP;
public class Student {
    //成员变量
    public String name;//姓名
    public int age;//年龄
    private boolean male; // 是不是爷们儿
    // 成员方法
    public void eat() {
        System.out.println("吃饭饭！");
    }
    public void sleep() {
        System.out.println("睡觉觉！");
    }
    public void study() {
        System.out.println("学习！");
    }
    //基本类型当中的boolean值，Getter方法一定要写成isXxx的形式，而setXxx规则不变
    public void setMale(boolean b) {
        male = b;
    }
    public boolean isMale() {
        return male;
    }
    public void setName(String str) {
        name = str;
    }
    public String getName() {
        return name;
    }
    public void setAge(int num) {
        age = num;
    }
    public int getAge() {
        return age;
    }
}
