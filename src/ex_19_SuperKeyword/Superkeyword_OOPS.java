package ex_19_SuperKeyword;

public class Superkeyword_OOPS {

}
class baseclass{

    baseclass(){
        System.out.println("Default Constructor");
    }
    baseclass(String browser){
        this.browser=browser;
        System.out.println("Parametrized Constructor");
    };
    private String browser; // Encapsulation

    public String getBrowser() {
        return browser;
    }

    public void setBrowser(String browser) {
        this.browser = browser;
    }

    void openbrowser(){ // method overloading
        System.out.println("Opening Browser");
    }
    void openbrowser(String browsername){ // Method Overloading

        System.out.println("Open Browser" + browsername);
    }
    void closebrowser(){
        System.out.println("Close Browser");
    }
}
//Inheritence
class testclass extends baseclass{
    void bike(){}
    int a =10;
    testclass(){
        //super(); // Default Constructor
        super("Chrome"); // Either default can be used or parametrized can be used, as we can not call two constructor
        super.openbrowser();
        super.openbrowser("Mac");
        super.closebrowser();
        super.getBrowser();
        super.setBrowser("Apple");
        this.bike(); // this is used to call in the same class or child class whereas Super is used to call from parent class
        System.out.println(this.a);
    }

}