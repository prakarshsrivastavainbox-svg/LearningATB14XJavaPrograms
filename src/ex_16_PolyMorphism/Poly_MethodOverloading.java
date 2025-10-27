package ex_16_PolyMorphism;
/*//Polymorphism means when same class/function perform multiple operation i.e behave differently when called, whereas
its name remain same
method overloading means :- When same method is called again and again with different operation
 */

public class Poly_MethodOverloading {

    public static void main(String[] args) {
    MathOperation m1 = new MathOperation();
    int r1 = m1.add(15,17);
    double r2 = m1.add(15.5,16.7);
    String s1 = m1.add("Prakarsh", "Srivastava");
        System.out.println(r1 +" "+ r2 +" "+ s1);

        MyTasks t = new MyTasks();
        t.task();
        t.task("Java");
    }
}

class MathOperation{
    int add(int a, int b)
    {
        return a+b;
    }
    long add(long a, long b)
    {
        return a+b;
    }
    double add(double a, double b)
    {
        return a+b;
    }
    String add(String a, String b)
    {
        return a+ " " +b;
    }
}
class MyTasks
{
    void task()
    {
        System.out.println("Lets Play game");
    }
    void task(String study){
        System.out.println("Lets Study First" + " "+ study);
    }

}