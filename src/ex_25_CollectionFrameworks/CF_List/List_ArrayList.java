package ex_25_CollectionFrameworks.CF_List;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
public class List_ArrayList {
    public static void main(String[] args) {
    List fruits = List.of("Apple", 1, "1");
        System.out.println(fruits);

        List array = new ArrayList<>();

        array.add("Prakarsh");
        array.add("Ankita");
        array.add("Pramrasha");
        array.add("Seher");
        array.add("1");
        array.add(1);
        array.add(true);
        System.out.println(array);
        System.out.println(array.indexOf("1"));
        System.out.println(array.contains(1));
        for (Object o:array){
            System.out.println(o);
        }
        Iterator it = array.iterator();
            while(it.hasNext())
            {
                System.out.println(it.next());
            }
    }
}
