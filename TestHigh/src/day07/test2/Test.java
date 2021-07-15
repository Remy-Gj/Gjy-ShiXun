package day07.test2;

public class Test {
    public static void main(String[] args) {
        RunnableTicket rt = new RunnableTicket();
        Thread t1 = new Thread(rt,"窗口1");
        Thread t2 = new Thread(rt,"窗口2");
        Thread t3 = new Thread(rt,"窗口3");
        Thread t4 = new Thread(rt,"窗口4");
        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}
