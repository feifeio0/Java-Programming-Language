package ink_final;
/*
对于成员变量来说，如果使用final关键字修饰，那么这个变量也照样是不可变。

1. 由于成员变量具有默认值，所以用了final之后必须手动赋值，不会再给默认值了。
2. 对于final的成员变量，要么使用直接赋值，要么通过构造方法赋值。二者选其一。
3. 必须保证类当中所有重载的构造方法，都最终会对final的成员变量进行赋值。
 */
public class Person4 {
    private final String name/* = "鹿晗"*/;//2选1

    public Person4() {
        name = "关晓彤";//2选1
    }

    public Person4(String name) {
        this.name = name;//2选1
    }

    public String getName() {
        return name;
    }

//    public void setName(String name) {
//        this.name = name;
//    }
}
