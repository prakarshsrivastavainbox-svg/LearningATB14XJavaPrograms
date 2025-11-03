package ex_20_Abstraction_OOPS;

public class Lab_Abstraction {
    public static void main(String[] args) {
        son s1= new son();
        s1.loan50k();
        s1.loan10k();

    }
}
abstract class father {
abstract void loan50k();
 void loan10k(){
    System.out.println("Paid this amount");
}
}

class son extends father{
    @Override
    void loan50k() {
        System.out.println("I am giving this loan amount");
    }
}