package ex_20_Abstraction_OOPS;

public class AbstractionbetterExample {
    public static void main(String[] args) {
        wagonr wg = new wagonr();
        wg.startcar();
        wg.stopcar();
        wg.drive();
        wg.fronttyre();
        wg.blacktyre();
    }
}

abstract class car{
    abstract void startcar();
    abstract void stopcar();
}

class wagonr extends car implements tyre{

    void drive(){
        this.stopcar();
        this.startcar();
    }

    @Override
    void startcar() {
        System.out.println("Car Started");
    }

    @Override
    void stopcar() {
        System.out.println("Car Stopped");
    }

    @Override
    public void blacktyre() {
        System.out.println("Black Tyres");
    }

    @Override
    public void fronttyre() {
        System.out.println("Front Tyre");
    }
}

interface tyre{
    void blacktyre();
    void fronttyre();
}