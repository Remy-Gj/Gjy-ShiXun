package day04;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class IOReadInputDemo {
    public static void main(String[] args) {
        FileInputStream fis = null;
        FileOutputStream fos = null;
        try {
            fis = new FileInputStream("F:\\接收文件\\高级\\day03\\资源\\决战优酷之巅.mp4");
            fos = new FileOutputStream("决战优酷之巅(ab).mp4");
            byte[] bytes = new byte[1024];
            int len = -1;
            while ((len = fis.read(bytes)) != -1) {
                fos.write(bytes, 0, len);
            }
            fos = null;
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (fis != null && fos != null) {
                try {
                    fos.close();
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }


}
