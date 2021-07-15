package day07.test1;

public class RunnableTest {
    public static void main(String[] args) {
        MyRunnable mr = new MyRunnable();
        Thread t1 = new Thread(mr,"wc");
        Thread t2 = new Thread(mr,"nm");
        t1.start();
        t2.start();
    }
}
