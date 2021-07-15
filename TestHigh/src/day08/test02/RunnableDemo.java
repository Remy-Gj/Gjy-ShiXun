package day08.test02;

import java.util.concurrent.Callable;

public class RunnableDemo implements Callable {

    @Override
    public Object call() throws Exception {
        int num = 0;
        for (int i = 0; i < 10; i++){
            num+=1;
        }
        return num;
    }
}
