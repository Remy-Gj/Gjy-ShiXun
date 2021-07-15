package day12.test2;

public class Person {
    private int age;
    public  String name;
    public  char sex;

    public Person() {
    }

    public Person(int age) {
        this.age = age;
    }

    public Person (String name, char sex) {
        this.name = name;
        this.sex = sex;
    }

    public void test(){
        System.out.println(name + "正在吃屎" + age);
    }
    private void test2(){
        System.out.println(name + age);
    }
    private void test3(String name){
        System.out.println(name);
    }
}
