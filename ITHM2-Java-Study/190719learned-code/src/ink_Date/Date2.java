package ink_Date;

import java.util.Date;//1.导包
public class Date2 {
    public static void main(String[] args) {
        date01();//构造方法
        date02();//构造方法
        date03();//成员方法
    }

    /*
        Date类的空参数构造方法
        Date() 获取当前系统的日期和时间
     */
    private static void date01() {
        Date date = new Date();
        System.out.println(date);//Fri Jul 19 20:46:52 CST 2019
    }

    /*
        Date类的带参数构造方法
        Date(long date) :传递毫秒值,把毫秒值转换为Date日期
     */
    private static void date02() {
        Date date = new Date(0L);
        System.out.println(date);// Thu Jan 01 08:00:00 CST 1970

        date = new Date(1563540370854L);
        System.out.println(date);// Fri Jul 19 20:46:10 CST 2019
    }

    /*
        long getTime() 把日期转换为毫秒值(相当于System.currentTimeMillis()方法)
          返回自 1970 年 1 月 1 日 00:00:00 GMT 以来 此 Date 对象表示的毫秒数。
     */
    private static void date03() {
        Date date = new Date();
        long time = date.getTime();//方法.var可以自动加一个变量
        System.out.println(time);//1563540412308
    }
}