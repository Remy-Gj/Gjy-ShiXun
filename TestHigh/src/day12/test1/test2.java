package day12.test1;

import day12.test2.Person;

import java.lang.reflect.Method;

public class test2 {
    public static void main(String[] args) throws Exception{
        Class<?> aClass = Class.forName("day12.test2.Person");

//        Method[] methods = aClass.getMethods();
//        for (Method method : methods) {
//            System.out.println(method);
//        }

//        Method[] declaredMethods = aClass.getDeclaredMethods();
//        for (Method declaredMethod : declaredMethods) {
//            System.out.println(declaredMethod);
//        }

        Method test2 = aClass.getDeclaredMethod("test2");
        test2.setAccessible(true);
        Person person = (Person) aClass.newInstance();
        test2.invoke(person);

        Method test3 = aClass.getDeclaredMethod("test3", String.class);
        test3.setAccessible(true);
        Person person1= (Person) aClass.newInstance();
        test3.invoke(person1,"排查");
    }
}
