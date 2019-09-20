package Inner;
/*
    如果一个类是定义在一个方法内部的，那么这就是一个局部内部类。
    “局部”：只有当前所属的方法才能使用它，出了这个方法外面就不能用了。
    定义格式：
        修饰符 class 外部类名称 {
            修饰符 返回值类型 外部类方法名称(参数列表) {
                class 局部内部类名称 {
                    // ...
                }
            }
        }
    小结一下类的权限修饰符：
        public > protected > (default) > private
    定义一个类的时候，权限修饰符规则：
        1. 外部类：public / (default)
        2. 成员内部类：public / protected / (default) / private
        3. 局部内部类：什么都不能写
 */
class Outer03 {
    public void methodOuter() {
        class Inner { // 局部内部类        inner.methodInner();
            int num = 10;
            public void methodInner() {
                System.out.println(num); // 10
            }
        }
        Inner inner = new Inner();
        inner.methodInner();
    }
}
/*
    局部内部类如果希望访问所在方法的局部变量，那么这个局部变量必须是【有效final的】。
    备注：从Java 8+开始，只要局部变量事实不变，那么final关键字可以省略。
    原因：
        1. new出来的对象在堆内存当中。
        2. 局部变量是跟着方法走的，在栈内存当中。
        3. 方法运行结束之后，立刻出栈，局部变量就会立刻消失。
        4. 但是new出来的对象会在堆当中持续存在，直到垃圾回收消失。
 */
class MyOuter03 {
    public void methodOuter() {
        int num = 10; // 所在方法的局部变量
        //final int num = 10;
        class MyInner {
            public void methodInner() {
                System.out.println(num);
            }
        }
        new MyInner().methodInner();
    }
}
public class InnerLocalUse03 {
    public static void main(String[] args) {
        Outer03 obj = new Outer03();
        obj.methodOuter();//10

        MyOuter03 obj1 = new MyOuter03();
        obj1.methodOuter();//10
    }
}
