package Thread;

/*创建和启动一个线程,创建Thread子类对象
子类对象调用start()方法
*
* */
public class ThreadDemo {
    public static void main(String[] args) {
            SubThread st=new SubThread();
            st.start();
            for(int i=0;i<50;i++){
                System.out.println("main***"+i);
            }
    }
}
