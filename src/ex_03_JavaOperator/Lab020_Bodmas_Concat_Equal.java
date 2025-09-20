package ex_03_JavaOperator;

public class Lab020_Bodmas_Concat_Equal {
    public static void main(String[] args) {
        int a,b;
        a=10;b=10;
        String  c,d;
        c="Prakarsh"; d="Srivastava";
        System.out.println(c + d + a + b); // When concact is first then all behave in concat
        System.out.println(a + b + c + d); // When first is arithmatic then all does not behave in same way
        System.out.println(c + d + (a + b)); // When brackets are used then concat and inside bracket artihmatic
        System.out.println((8*8)+2-7/9);// BodMass
        System.out.println(!(a == b)); // When conact is first then all behave in concat
    }
}
