package ink_Lambda;
/*
    使用实现Runnable接口的方式实现多线程程序
    Thread类需要Runnable接口作为参数 抽象run方法时用来指定线程任务内容的核心
    为了指定run方法体，//不得不需要runnable接口的实现类
    为了省去定义一个runnableimpl实现类的麻烦，//不得不使用匿名内部类
    必须覆盖重写抽象run方法,其名称参数返回值必须重写一遍且不能出错
    似乎只有方法体时关键所在
 */
public class Runnable00 {
    public static void main(String[] args) {
        //创建Runnable接口的实现类对象
        RunnableImpl00 run = new RunnableImpl00();
        //创建Thread类对象,构造方法中传递Runnable接口的实现类
        Thread t = new Thread(run);
        //调用start方法开启新线程,执行run方法
        t.start();

        //简化代码,使用匿名内部类,实现多线程程序
        Runnable r = new Runnable(){
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName()+" 新线程创建了");
            }
        };
        new Thread(r).start();

        //简化代码
        new Thread(new Runnable(){
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName()+" 新线程创建了");
            }
        }).start();
    }
}
