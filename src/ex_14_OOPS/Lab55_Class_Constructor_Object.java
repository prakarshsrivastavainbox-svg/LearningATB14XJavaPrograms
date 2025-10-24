package ex_14_OOPS;

public class Lab55_Class_Constructor_Object {
 public static void main(String[] args) {
     Cat c1 = new Cat();
     Cat c2 = new Cat("Prakarsh");
     LoginPage l1 = new LoginPage();

     System.out.println(c1.name);
     System.out.println(c2.name);
     c1.running();
     c2.running();
    // System.out.println(l1);
    }
}
class Cat {

    String name; // Defining variable (Instance variable it is not Local variable)
    Cat(){              // Contructor without the Parameter, Means Non Parameterized or Default constructor
        name = "Kitty";
    }
    Cat(String nameparam)//Parameterized Constructor which is having parameter such as Variable
    {
        this.name=nameparam;

    }
    void running()// Functionality / Behavior
        {
            System.out.println("Who is runing " + name);
        }
}
