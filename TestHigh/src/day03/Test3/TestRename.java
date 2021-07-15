package day03.Test3;

import java.io.File;

public class TestRename {
    public static void main(String[] args) {
        File file = new File("E:\\Ð¡Ëµ");
        File[] fi = file.listFiles();
        for (File fil : fi) {
            if (fil.isFile()) {
                String oldName = fil.getName();
                String first = oldName.substring(0, oldName.lastIndexOf("_"));//±àºÅ
                String last = oldName.substring(oldName.lastIndexOf("_")+1,oldName.lastIndexOf("."));
                String nameName = last + first + ".txt";
                String parent = fil.getParent();
                File file33 = new File(parent,nameName);
                boolean flag = fil.renameTo(file33);
            }
        }
    }
}
