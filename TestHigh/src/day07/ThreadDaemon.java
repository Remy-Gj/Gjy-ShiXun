package day07;

public class ThreadDaemon extends Thread{
    public ThreadDaemon() {

    }
    public ThreadDaemon(String name){
        super(name);
    }

    @Override
    public void run() {
        for (int i = 0; i < 50; i++) {
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(getName() + ":" + i);
        }
    }
}
