package day08.test01;

public class Car {
    String name;
    double price;
    public Car(){

    }
    public Car(String name,double price){
        this.name = name;
        this.price = price;
    }

    boolean flag = false;

    @Override
    public String toString() {
        return this.name+"--->"+this.price;
    }
}
