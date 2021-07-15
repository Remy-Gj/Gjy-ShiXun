package day03.Test2;

import java.io.File;
import java.io.FilenameFilter;

public class FileTest {
    public static void main(String[] args) {
        File file = new File("E:\\");
        File[] files = file.listFiles(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                File file = new File(dir,name);
                return file.isFile() && name.endsWith(".jpg");
            }
        });
        for (File file1 : files) {
            System.out.println(file1);
        }
        /*assert files != null;
        for (File file1 : files) {
            if (file1.isFile()){
                String name = file1.getName();
                if (name.endsWith(".jpg")){
                    System.out.println(file1);
                }
            }
        }*/

    }
}
