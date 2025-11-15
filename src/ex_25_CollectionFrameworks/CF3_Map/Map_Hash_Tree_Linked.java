package ex_25_CollectionFrameworks.CF3_Map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Map_Hash_Tree_Linked {
    public static void main(String[] args) {
        Map mp = new HashMap(); // Randomly added
        mp.put("name","Prakarsh");
        mp.put("ID",1);
        mp.put("flaga",true);
        System.out.println(mp);

        Map mp1 =new TreeMap(); // Sorted
        mp1.put("name","Prakarsh");
        mp1.put("ID",1);
        mp1.put("flaga",true);
        System.out.println(mp1);

        Map mp2 =new LinkedHashMap(); // Value comes in a same order as we added
        mp2.put("name","Prakarsh");
        mp2.put("ID",1);
        mp2.put("flaga",true);
        System.out.println(mp2);
    }
}
