package day13.test3;

import java.util.ArrayList;
import java.util.ListIterator;

public class test3 {
    public static void main(String[] args) {
        ArrayList a = new ArrayList();

        a.add("aaa");
        a.add("bbb");
        a.add("ccc");


        ListIterator listIterator = a.listIterator();
        while (listIterator.hasNext()){
            String str = (String)listIterator.next();
            if (str.equals("bbb")){
                listIterator.add("我草");
                listIterator.previous();
            }
            System.out.println(str);
        }
    }
}
