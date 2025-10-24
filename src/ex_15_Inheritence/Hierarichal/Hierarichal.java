package ex_15_Inheritence.Hierarichal;

public class Hierarichal {
    public static void main() {
        Child1 c1= new Child1();
        c1.bhk1();
        c1.bung();
        Child2 c2 = new Child2();
        c2.bung();
        c2.bhk2();
        Father f1 = new Father();
        f1.bung();

        // Child2 c5 = new Child1();  Can not be possible as Extend are not given in between the child
        // Child1 c6 = new Child2();
        //DynamicDispatch
        Father f2= new Child1();
        Father f3 = new Child2();
        // Child2 c3 = new Father(); Can not be possible
        // Child1 c4 = new Father(); Can not be possible
    }
}
