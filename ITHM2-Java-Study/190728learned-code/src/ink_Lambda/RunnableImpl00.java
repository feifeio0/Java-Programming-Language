package ink_Lambda;

public class RunnableImpl00 implements Runnable{
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+" 新线程创建了");
    }
}
