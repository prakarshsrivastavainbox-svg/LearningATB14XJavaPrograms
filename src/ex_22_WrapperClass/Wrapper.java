package ex_22_WrapperClass;


public class Wrapper {
    public static void main(String[] args) {
        int a =10;
        Integer b = 11;   // This Wrapper which have some extra functionality
        System.out.println(a);
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.valueOf(b));
        String s = "10";
        int c = Integer.parseInt(s); // You need to call it using the Integer class (since parseInt() is a static method in the Integer wrapper class).
        System.out.println(c);
    }
}
