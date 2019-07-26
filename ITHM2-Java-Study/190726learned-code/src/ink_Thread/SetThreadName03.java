package ink_Thread;
public class SetThreadName03 {
    public static void main(String[] args) {
        //开启多线程
        MyThread03 mt = new MyThread03();
        //mt.start();//Thread-0
        mt.setName("小强");
        mt.start();

        //开启多线程
        new MyThread03("旺财").start();
    }
}
