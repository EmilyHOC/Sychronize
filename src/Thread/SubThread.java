package Thread;

public class SubThread extends Thread{
    @Override
    public void run() {
        for(int i=0;i<50;i++){
            System.out.println("run***"+i);
        }
    }
}
