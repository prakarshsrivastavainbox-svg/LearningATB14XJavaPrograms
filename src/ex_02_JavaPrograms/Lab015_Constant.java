package ex_02_JavaPrograms;

public class Lab015_Constant {
    public static void main(String[] args) {
        int a =10;
        System.out.println(a);
        a=11;
        System.out.println(a);
        final int b =12;
        System.out.println(b);
        /*b=13; //java: cannot assign a value to final variable b
        System.out.println(b);*/
    }
}
