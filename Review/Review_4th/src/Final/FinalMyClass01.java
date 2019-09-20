package Final;
/*
    final关键字代表最终、不可改变的。
    常见四种用法：
        1. 可以用来修饰一个类
        2. 可以用来修饰一个方法
        3. 还可以用来修饰一个局部变量
        4. 还可以用来修饰一个成员变量
*/
/*
    当final关键字用来修饰一个类的时候，格式：
        public final class 类名称 {
            // ...
        }
    含义：当前这个类不能有任何的子类。（太监类）
        //不能使用一个final类来作为父类
    注意：一个类如果是final的，那么其中所有的成员方法都无法进行覆盖重写（因为没儿子。）
 */
final class MyClass01 /*extends Object*/{
    public void method() {
        System.out.println("方法执行！");
    }
}

public class FinalMyClass01 /*xtends MyClass01*/{
    //报错 final类不能有子类
}

