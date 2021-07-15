package day04;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class IOInputDemo {
    public static void main(String[] args) {
        FileInputStream fis = null;
        try {
            fis = new FileInputStream("fil.txt");

            byte[] bytes = new byte[5];
            int len = -1;
            while((len = fis.read(bytes)) != -1){
                String s = new String(bytes,0,len);
                System.out.print(s);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e){
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (fis != null){
                    fis.close();
                }

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
//        int read = fis.read();
//        System.out.println((char)read);


    }
}
