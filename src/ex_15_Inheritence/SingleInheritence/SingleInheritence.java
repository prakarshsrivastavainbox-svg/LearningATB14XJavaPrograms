package ex_15_Inheritence.SingleInheritence;

public class SingleInheritence {
    public static void main(String[] args) {
        Son s1 = new Son();
        System.out.println(s1.gold_f);
        s1.bhk2();
        s1.bhk3();
        Father f1 = new Father();
        f1.bhk2();
        System.out.println(f1.gold_f);
    }
}
