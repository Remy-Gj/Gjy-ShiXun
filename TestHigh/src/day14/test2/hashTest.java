package day14.test2;

import java.util.HashSet;

public class hashTest {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet();
        set.add("a");
        set.add("b");
        set.add("c");
        set.add("t");
        set.add("f");
        set.add("e");
        set.add("d");
        set.add("l");


        for (String s : set) {
            System.out.println(s);
        }
    }
}
