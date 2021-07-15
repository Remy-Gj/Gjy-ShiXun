package day14.test3;

import java.util.HashSet;

public class HashSetDemoo {
    public static void main(String[] args) {
        HashSet<Student> hashSet = new HashSet<>();

        hashSet.add(new Student("老高",18));
        hashSet.add(new Student("菜菜",16));

        hashSet.add(new Student("老高",18));


        for (Student student : hashSet) {
            System.out.println(student);
        }
    }
}
