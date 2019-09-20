package APIArrayList;

import APIUse1.Person;

/*
    题目：
    定义一个数组，用来存储3个Person对象。
    数组有一个缺点：一旦创建，程序运行期间长度不可以发生改变。
 */
public class OOArray01 {
    public static void main(String[] args) {
        // 首先创建一个长度为3的数组，里面用来存放Person类型的对象
        Person[] array = new Person[3];

        Person one = new Person("迪丽热巴", 18);
        Person two = new Person("古力娜扎", 28);
        Person three = new Person("玛尔扎哈", 38);

        // 将one当中的地址值赋值到数组的0号元素位置
        array[0] = one;
        array[1] = two;
        array[2] = three;

        System.out.println(array[0]); // 地址APIUse1.Person@50cbc42f
        System.out.println(array[1]); // 地址APIUse1.Person@75412c2f
        System.out.println(array[2]); // 地址APIUse1.Person@282ba1e

        System.out.println(array[1].getName()); // 古力娜扎
    }
}
