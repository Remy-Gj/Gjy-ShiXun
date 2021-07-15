package test111.test2;

import java.io.FileReader;
import java.lang.reflect.Method;
import java.util.Properties;

public class infoTest {
    public static void main(String[] args) throws Exception{
        Properties pr = new Properties();
        pr.load(new FileReader("info.properties"));
        String className = pr.getProperty("className");
        String methodName = pr.getProperty("methodName");

        Class<?> aClass = Class.forName(className);
        Method method = aClass.getMethod(methodName);
        Object o = aClass.newInstance();
        method.invoke(o);


    }
}
