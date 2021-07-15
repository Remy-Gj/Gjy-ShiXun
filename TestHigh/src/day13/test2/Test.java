package day13.test2;

import java.util.ArrayList;
import java.util.Collection;

public class Test {
    public static void main(String[] args) {

        Collection con = new ArrayList();
        Collection con1 = new ArrayList();
        con.add("w");
        con.add("b");
        con1.add("w");
        con1.add("cc");
        con1.add("a");

        boolean b = con.containsAll(con1);
        System.out.println(b);

        boolean b1 = con.removeAll(con1);
        System.out.println(b1);
        boolean b2 = con1.removeAll(con);

        for (Object o : con) {
            System.out.println(o.toString());
        }

        for (Object o : con1) {
            System.out.println(o.toString());
        }
    }
}
