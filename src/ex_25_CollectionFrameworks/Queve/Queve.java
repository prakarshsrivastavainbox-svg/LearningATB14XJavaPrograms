package ex_25_CollectionFrameworks.Queve;

import java.util.*;

public class Queve {
    public static void main(String[] args) {
        PriorityQueue qu = new PriorityQueue<>();
        qu.add("Prakarsh");
        qu.add("Srivastava");
        System.out.println(qu);
        System.out.println(qu.peek());
        System.out.println(qu);
        System.out.println(qu.poll());
        System.out.println(qu);

        Deque dq = new ArrayDeque();
        dq.add("Prakarsh");
        dq.add("Srivastava");
        dq.push(5);
        System.out.println(dq);

        Queue<Integer> qe = new LinkedList();
        qe.add(6);
        Iterator<Integer> iterator =qe.iterator();
        while(iterator.hasNext()){
            Integer value = iterator.next();
            System.out.println(value);
        }
    }
}
