package day07;

public class ThreadTestTicket {
    public static void main(String[] args) {
        ThreadTicket t1 = new ThreadTicket();
        ThreadTicket t2 = new ThreadTicket();
        t1.start();
        t2.start();
    }
}
