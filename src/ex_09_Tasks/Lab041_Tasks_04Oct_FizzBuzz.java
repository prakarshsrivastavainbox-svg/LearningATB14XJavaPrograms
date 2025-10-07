//Write a program that prints numbers from 1 to 100. However, for multiples of 3,
// print "Fizz" instead of the number, and for multiples of 5, print "Buzz."
// For numbers that are multiples of both 3 and 5, print "FizzBuzz."
package ex_09_Tasks;

public class Lab041_Tasks_04Oct_FizzBuzz {
    public static void main(String[] args) {
    System.out.println(" For Multiple of 3 :- Fizz, \n For Multiple of 5 :- Buzz, \n For Multiple of 3 and 5 :- FizzBuzz");
    for (int i=0;i<=100;i++)
    {
        if (i%3==0 && i%5==0)
        {
            System.out.println("FizzBuzz");
        }else if (i%5==0)
        {
            System.out.println("Buzz");
        } else if (i%3==0) {
            System.out.println("Fizz");
        }else {
            System.out.println(i);
        }
    }
    }
}
