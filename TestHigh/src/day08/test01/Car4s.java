package day08.test01;

public class Car4s {
    public static void main(String[] args) {
        Car car = new Car();
        SetRunnable sr = new SetRunnable(car);
        GetRunnable gr = new GetRunnable(car);
        Thread sr1 = new Thread(sr);
        Thread gr1 = new Thread(gr);
        sr1.start();
        gr1.start();
    }
}
