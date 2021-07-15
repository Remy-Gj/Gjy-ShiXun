package day12.test1;

import java.io.FileReader;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Properties;

public class test3 {
    public static void main(String[] args)throws Exception {
        Properties p = new Properties();
        p.load(new FileReader("info.properties"));
        String className = p.getProperty("className");
        String methodName = p.getProperty("methodName");
        String filedName = p.getProperty("filedName");


        Class<?> aClass = Class.forName(className);
        Object o = aClass.newInstance();
        Method method = aClass.getMethod(methodName);
        Field field = aClass.getField(filedName);
        field.set(o,"老八");
        method.invoke(o);
        System.out.println(field.get(o));

    }
}
