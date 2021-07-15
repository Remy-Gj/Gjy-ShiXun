package day12.test1;

import day12.test2.Person;

import java.lang.reflect.Field;

public class test {
    public static void main(String[] args) throws Exception{
        Class<?> aClass = Class.forName("day12.test2.Person");
//        Field[] fields = aClass.getFields();
//        for (Field field : fields) {
//            System.out.println(field);
//        }
//        Field[] declaredFields = aClass.getDeclaredFields();
//        for (Field declaredField : declaredFields) {
//            System.out.println(declaredField);
//        }
        Field field = aClass.getField("name");
        Person person =(Person) aClass.newInstance();
        field.set(person,"草");
        System.out.println(person.name);



        Field name = aClass.getDeclaredField("age");
        name.setAccessible(true);
        Person person1 =(Person) aClass.newInstance();
        name.set(person1,123);
        person1.test();


    }
}
