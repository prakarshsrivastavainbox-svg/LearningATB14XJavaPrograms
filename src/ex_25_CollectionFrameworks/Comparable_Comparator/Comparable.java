package ex_25_CollectionFrameworks.Comparable_Comparator;

import java.util.ArrayList;
import java.util.*;

public class Comparable {
    public static void main(String[] args) {
    employee em =new employee(1,"Prakarsh");
        employee em2 =new employee(2,"Ankita");
        employee em3 =new employee(3,"Pratyush");

        List<employee> eml = new ArrayList<>();
        eml.add(em);
        eml.add(em2);
        eml.add(em3);
        Collections.sort(eml);
        System.out.println(eml);
    }
}

class employee implements java.lang.Comparable<employee> {

    int id;
    String  name;
    public employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Employee{id=" + id +", name='" + name +"'}";
    }

    @Override
    public int compareTo(employee o) { // We can not use both
        //return this.id-o.id;  // To Sort with ID
        return this.name.compareTo(o.name); // To sort with name
    }
}