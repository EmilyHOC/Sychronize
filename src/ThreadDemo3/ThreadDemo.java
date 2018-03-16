package ThreadDemo3;

/*多线程并发访问同一个和数据资源
3个线程,访问同一个票源
*
* */
public class ThreadDemo {
    public static void main(String[] args) {
        //创建Runnable接口与实现类
        Tickets t=new Tickets();
        //创建3个Thread类对象,传递Runnable接口实现类
        Thread t0=new Thread(t);
        Thread t1=new Thread(t);
        Thread t2=new Thread(t);

        t0.start();
        t1.start();
        t2.start();
    }
}
