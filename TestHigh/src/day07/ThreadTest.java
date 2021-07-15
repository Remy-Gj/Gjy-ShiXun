package day07;

public class ThreadTest {
    public static void main(String[] args) {
        Thread thread = new ThreadDemo();

        thread.start();
        try {
            Thread.sleep(4000);
            thread.interrupt();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
