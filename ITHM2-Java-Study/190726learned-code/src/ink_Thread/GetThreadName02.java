package ink_Thread;
/*
    线程的名称:
        主线程: main
        新线程: Thread-0,Thread-1,Thread-2
 */
public class GetThreadName02 {
    public static void main(String[] args) {
        //创建Thread类的子类对象
        MyThread02 mt = new MyThread02();
        //调用start方法,开启新线程,执行run方法
        mt.start();//Thread-0

        new MyThread02().start();//Thread-1
        new MyThread02().start();//Thread-2

        //链式编程
        System.out.println(Thread.currentThread().getName());
    }
}