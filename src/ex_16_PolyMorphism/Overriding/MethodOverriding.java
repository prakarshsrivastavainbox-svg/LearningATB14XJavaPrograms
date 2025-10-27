package ex_16_PolyMorphism.Overriding;
// Overrigding is only possible in Polymorphism case, it means Child Class Overrides the Parent Class

public class MethodOverriding {
    public static void main(String[] args) {
     son s = new son();
     s.home();
        Father f = new Father();
        f.home();
        Father f1 = new son(); // Dynamic Dispatch as well as runtime Polymorphism
        f1.home();
    }
}

class Father
{
    void home(){
        System.out.println("Father has a home");
    }
}
class son extends Father {
    @Override
    void home() {
        System.out.println("Son has a Bigger home than Father");
    }
}