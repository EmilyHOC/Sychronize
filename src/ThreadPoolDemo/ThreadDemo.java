package ThreadPoolDemo;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/*
* 使用工厂类Executors中的静态方法创建线程对象,指定线程的个数
* static ExecutorService newFixedThreadPool(int 个数)返回线程池对象
* 返回的是ExecutorService接口的实现类(线程池对象)
* 接口实现类对象,调用方法submit(Runable)提交线程执行任务
*
* */
public class ThreadDemo {
    public static void main(String[] args) {
        //调用工厂类的静态方法,创建线程池对象
        //返回想城池对象,是返回的接口
        ExecutorService es=Executors.newFixedThreadPool(2);
        System.out.println(es);
        //调用接口实现类对象es中的方法submit提交线程任务
        es.submit(new ThreadPoolRunnable());
        es.submit(new ThreadPoolRunnable());
        //销毁子线程池
        es.shutdown();
    }
}
