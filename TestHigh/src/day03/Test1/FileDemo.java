package day03.Test1;

import java.io.File;
import java.io.IOException;

public class FileDemo {
    public static void main(String[] args) throws IOException {


      /*  String str = "E:\\";
        File file1 = new File(str, "woCao.txt");

        File file2 = new File(str, "woCao");*/

     /*   boolean newFile = file.createNewFile();
        System.out.println(newFile);

        boolean mkdir = file2.mkdir();
        System.out.println(mkdir);

        File file3 = new File("E:\\我他吗直呼牛逼\\我草\\666");
        boolean mkdirs = file3.mkdirs();
        System.out.println(mkdirs);*/

        /*File file = new File("E:\\1238Wocao.txt");
        File file4 = new File("E:\\我他吗直呼牛逼\\我草\\1238Wocao.txt");
        boolean b = file.renameTo(file4);
        System.out.println(b);
        String absolutePath = file4.getAbsolutePath();
        System.out.println(absolutePath);
        String path = file4.getPath();
        System.out.println(path);
        String name = file4.getName();
        System.out.println(name);
        long length = file4.length();
        System.out.println(length000000);
*/
        File file123 = new File("E:\\");

        String[] list = file123.list();
        for (String s : list) {
            System.out.println(s);
        }
        System.out.println("====================================================");
        File[] files = file123.listFiles();
        for (File file : files) {
            System.out.println(file.getAbsolutePath());
        }
    }
}
