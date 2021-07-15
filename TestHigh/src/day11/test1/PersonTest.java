package day11.test1;

import day12.test2.Person;

import java.lang.reflect.Constructor;

public class PersonTest {
    public static void main(String[] args) throws Exception {
       // Class r = Person.class;

          Class c = Class.forName("day12.test2.Person");
          Constructor[] constructors = c.getConstructors();
//        Person person =(Person) c.newInstance();
//        System.out.println(person.name);
//        System.out.println(person.sex);
//        person.test();
        Constructor constructor = c.getConstructor(String.class,char.class);
        Person person =(Person) constructor.newInstance("老八",'男');
        person.test();
        Constructor declaredConstructor = c.getDeclaredConstructor(int.class);
        declaredConstructor.setAccessible(true);
        person =(Person) declaredConstructor.newInstance(200);
        person.test();
    }
}
