package day08.test01;

public class GetRunnable implements Runnable{
    Car car = null;

    public GetRunnable(Car car) {
        this.car = car;
    }

    @Override
    public void run() {
        while (true){
            synchronized (car){
                if (!car.flag){
                    try {
                        car.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println(car.toString());
                car.flag = false;
                car.notify();
            }
        }

    }
}
