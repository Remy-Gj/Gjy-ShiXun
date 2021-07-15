package day05;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class IOProject {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        BufferedReader bfr = null;
        try {
            bfr = new BufferedReader(new FileReader("students.txt"));
            String data = null;
            while ((data = bfr.readLine())!=null){
                String[] split = data.split("-");
                list.add(new Student(Integer.parseInt(split[0]),split[1],Double.parseDouble(split[2])));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if (bfr!=null){
                try {
                    bfr.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            for (Student student : list) {
                System.out.println(student);
            }
        }
    }
}
