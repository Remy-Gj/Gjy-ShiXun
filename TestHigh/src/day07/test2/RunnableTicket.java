package day07.test2;

import java.util.concurrent.locks.ReentrantLock;

public class RunnableTicket implements Runnable {
    int ticket = 100;
    Object obj = new Object();
    private ReentrantLock rLock = new ReentrantLock();

    /*@Override
    public void run() {
        while (true) {
            if (ticket % 2 == 0) {
                synchronized (this) {
                    if (ticket > 0) {
                        System.out.println(Thread.currentThread().getName() + "����������" + (ticket--) + "��Ʊ");
                    }
                }

            } else{
                function();
            }
        }

    }
    public void function(){
        synchronized (this) {
            if (ticket > 0) {
                System.out.println(Thread.currentThread().getName() + "����������" + (ticket--) + "��Ʊ");
            }
        }

    }*/
    @Override
    public void run() {

            while (true) {
                if (ticket > 0) {
                    System.out.println(Thread.currentThread().getName() + "����������" + (ticket--) + "��Ʊ");
                }
            }
    }
}
