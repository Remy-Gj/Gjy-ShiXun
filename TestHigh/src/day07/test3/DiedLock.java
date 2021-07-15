package day07.test3;

public class DiedLock implements Runnable {
    boolean flag;

    public DiedLock() {
    }

    public DiedLock(boolean flag) {
        this.flag = flag;
    }

    @Override
    public void run() {
        if (flag) {
            flag=!flag;
            synchronized (MyLock.l1) {
                System.out.println("A");
                synchronized (MyLock.l2) {
                    System.out.println("B");
                }
            }
        } else {
            synchronized (MyLock.l2) {
                System.out.println("A1");
                synchronized (MyLock.l1) {
                    System.out.println("B1");
                }
            }
        }
    }
}
