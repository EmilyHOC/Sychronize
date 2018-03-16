package ThreadDemo3;

public class Tickets implements  Runnable {
    //定义出售的票源
    private int ticket=100;
    @Override
    public void run() {
        //对票数判断,大于0,可以出售,变量--操作
        while (true){
            if (ticket>0){
                System.out.println(Thread.currentThread().getName()+"出售第"+ticket--);
            }

        }
    }
}
