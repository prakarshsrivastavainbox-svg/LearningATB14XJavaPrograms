package ex_04_TypeCasting;

public class Lab022_Type_Casting_Narrowing {
    public static void main(String[] args) {
        int a = 300;
        //byte b =a; // This is not possible means implicit is not valid
        byte b = (byte)a; // This is explicit
        System.out.println(b);
    }
}
