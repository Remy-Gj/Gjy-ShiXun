package day03.Test4;

import java.io.FileOutputStream;
import java.io.IOException;

public class TestOutputStream {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("a.txt");
        byte[] aa = {1,2,97,98,99,6,7,8,9,0};
        fos.write(aa,2,3);
        fos.write(aa);


    }
}
