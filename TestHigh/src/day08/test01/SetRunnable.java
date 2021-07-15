package day08.test01;

public class SetRunnable implements Runnable{
    Car car = null;

    int i = 0;

    public SetRunnable(Car car) {
        this.car = car;
    }


    @Override
    public void run() {
        while (true){
            synchronized (car){
                if (car.flag) {
                    try {
                        car.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                    if (i%2==0){
                        car.name = "����3";
                        car.price= 300000;
                    }else{
                        car.name = "������";
                        car.price = 19000000;
                    }
                    i++;

                    car.flag = true;
                    car.notify();

            }
        }
    }
}
