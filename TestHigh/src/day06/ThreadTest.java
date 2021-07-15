package day06;

public class ThreadTest {
    public static void main(String[] args) {
        method5();
    }
    public static  void method1(){
        Thread thread = new MyThread();
        thread.start();
    }
    public static  void method2(){
        Thread thread2 = Thread.currentThread();
        String name1 = thread2.getName();
        System.out.println(name1);

        MyThread thread = new MyThread();
        String name = thread.getName();
        System.out.println(name);
    }

    public static  void method3(){
        MyThread thread = new MyThread();
        MyThread thread1 = new MyThread();
        thread.setName("D");
        thread1.setName("W");
        System.out.println(thread.getPriority());
        System.out.println(thread1.getPriority());
        thread.start();
        thread1.start();
    }
    public static  void method4(){
        MyThread thread = new MyThread();
        thread.setName("ÄôÖ¾ºÆ: ");
        thread.start();
    }

    public static  void method5(){
        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();
        MyThread t3 = new MyThread();

        t1.setName("A");
        t2.setName("B");
        t3.setName("c");

        t1.start();
        try {
            t1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        t2.start();
        t3.start();
    }
}
