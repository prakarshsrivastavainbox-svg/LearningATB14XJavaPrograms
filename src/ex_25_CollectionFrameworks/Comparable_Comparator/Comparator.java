package ex_25_CollectionFrameworks.Comparable_Comparator;

import java.util.ArrayList;
import java.util.*;

public class Comparator {
    public static void main(String[] args) {
        employee2 em =new employee2(1,"Prakarsh");
        employee2 em2 =new employee2(2,"Ankita");
        employee2 em3 =new employee2(3,"Pratyush");
        List<employee2> emll = new ArrayList<>();
        emll.add(em);
        emll.add(em2);
        emll.add(em3);
        // In compatator we can keep both the code of comparing with ID or string but can use only one
        //Whereas in comparable we can not keep both the code, we have comment either one of them
        java.util.Comparator<employee2> nameComparator  = (e1,e2) -> e1.name.compareTo(e2.name);
        java.util.Comparator<employee2> idComparator = (e1, e2) -> e1.id-e2.id;
        Collections.sort(emll, nameComparator);
        System.out.println(emll);
    }
}

class employee2  {

    int id;
    String  name;
    public employee2(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Employee{id=" + id +", name='" + name +"'}";
    }

    }

