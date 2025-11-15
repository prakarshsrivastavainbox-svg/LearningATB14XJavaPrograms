package ex_25_CollectionFrameworks.CF1_List;

import java.util.LinkedList;
import java.util.List;

public class List_LinkedList {
    public static void main(String[] args) {
        List lt = new LinkedList();
        lt.add("a");
        lt.add("1");
        lt.add(1);
        for (Object o:lt)
        {
            System.out.println(o);
        }
    }
}
