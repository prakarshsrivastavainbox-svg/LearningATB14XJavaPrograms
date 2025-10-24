package ex_15_Inheritence.MultiLevel_DynamicDispatchConcept;

public class MultiLevel {
    public static void main(String[] args) {
    Son p = new Son();
    p.bung();
    p.bhk2();
    p.bhk1();
    Father f =new Father();
    f.bung();
    f.bhk1();
    Grandfather g = new Grandfather();
    g.bung();

    //Dynamic Dispatch
        Grandfather g1 =new Son();
        Father f1 = new Son();
        Grandfather g2 = new Father();
       // Son s1 = new Father();  This can not be Possible as Son is extended to Father not Father is Extended to SOn.

    }
}
