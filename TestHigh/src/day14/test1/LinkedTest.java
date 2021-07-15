package day14.test1;

import java.util.LinkedList;

public class LinkedTest {
    private LinkedList<String> list = new LinkedList();

    public void setlist(String nasa){
        list.addFirst(nasa);
    }

    public String getlist(){
        return list.removeFirst();
    }

    public boolean isEmpity(){
        return !list.isEmpty();
    }
}
