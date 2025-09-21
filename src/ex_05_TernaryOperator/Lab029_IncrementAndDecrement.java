package ex_05_TernaryOperator;

public class Lab029_IncrementAndDecrement {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        System.out.println(a++); // Post increment
        System.out.printf("value %d\n",a);
        System.out.println(++a); // Pre increment increment
        System.out.printf("value %d\n",a);
        System.out.println(a++ + ++a); // Post and pre increment increment
        System.out.printf("value %d\n",a);
        System.out.println(++a + a++); // Post and pre increment increment
        System.out.printf("value %d\n",a);

        System.out.println(b--); // Post decrement
        System.out.printf("value %d\n",b);
        System.out.println(--b); // Pre decrement
        System.out.printf("value %d\n",b);
        System.out.println(b-- + --b); // Post and pre increment decrement
        System.out.printf("value %d\n",b);
        System.out.println(--b + b--); // Pre and Post increment decrement
        System.out.printf("value %d\n",b);
    }
}
