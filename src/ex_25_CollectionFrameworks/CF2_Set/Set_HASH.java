package ex_25_CollectionFrameworks.CF2_Set;

import java.util.HashSet;
import java.util.*;
// In SET duplicate is not allowed, if you provide two same value it will take the first one only
public class Set_HASH {
    public static void main(String[] args) {
        Set st = new HashSet(); // Order will not be maintained
        st.add("Apple");
        st.add("Orange");
        st.add("Guava");
        st.add("Orange");
        st.add(null);
        for (Object s : st) {
            System.out.println(s);
        }
        System.out.println(st);
        System.out.println("----------");
        Set st1 = new LinkedHashSet();  // Order will also be maintained
        st1.add("Apple");
        st1.add("Orange");
        st1.add("Guava");
        st1.add("Orange");
        st1.add(null);
        for (Object s1 : st1) {
            System.out.println(s1);
        }
        System.out.println(st1);
        System.out.println("----------");
        Set st2 = new TreeSet();  // Order will also be maintained and Sorting will also be done and null is not allowed
        st2.add("Apple");
        st2.add("Orange");
        st2.add("Orange");
        st2.add("AApple");
        //st2.add(null);
        for (Object s2 : st2) {
            System.out.println(s2);
        }
        System.out.println(st2);
    }
}
