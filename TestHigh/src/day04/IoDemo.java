package day04;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class IoDemo {
    public static void main(String[] args) {
        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream("c.txt");
            fos.write(97);
            System.out.println(10/0);
            fos = null;
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e){
            e.printStackTrace();
        } catch (Exception e){
            e.printStackTrace();
        }
            finally {
            try {
                if (fos != null) {
                    fos.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
