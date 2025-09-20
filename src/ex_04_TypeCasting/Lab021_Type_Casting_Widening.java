package ex_04_TypeCasting;

public class Lab021_Type_Casting_Widening {
    public static void main(String[] args) {
        byte a = 10;
        int b = a; // Widening or implicit
        System.out.println(b);
        b = (int) a; // Explicit casting where we tell the JVM to datatype
        System.out.println(b);
    }
}
