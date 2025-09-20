package ex_04_TypeCasting;

public class Lab023_Type_Casting_Used {
    public static void main(String[] args) {
        int a = 200;
        float gst =18.45f;
        int b,c,d,total;
        float total1;
        //total = a + gst; // This is not possible without expliciting it.
        total = a +(int)gst; // This is possible because of ht expliciting mention
        System.out.println(total);
        total1 =  gst + a; // this is possible since the float is biger than int and concept of widening is used.
        System.out.println(total1);
    }
}
