package test111.test;

import java.io.FileReader;
import java.lang.reflect.Method;
import java.util.Properties;

public class test01 {
    public static void main(String[] args) throws Exception {
        Properties pr = new Properties();
        pr.load(new FileReader("info.properties"));
        String className = pr.getProperty("className");
        String methodName = pr.getProperty("methodName");


        Class<?> aClass = Class.forName(className);
        Object o = aClass.getDeclaredConstructor().newInstance();
        Method method = aClass.getMethod(methodName);
        method.invoke(o);
    }
}
