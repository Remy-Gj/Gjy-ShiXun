package day07.test3;


public class DiedLockTest {
    public static void main(String[] args) {
        DiedLock dr = new DiedLock(true);
        Thread tr = new Thread(dr);
        Thread tr1 = new Thread(dr);

        tr.start();
        tr1.start();
    }
}
