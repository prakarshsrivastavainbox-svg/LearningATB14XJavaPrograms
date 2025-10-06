package ex_08_Functions;
import java.util.Scanner;
public class Lab040_Functions_Arithmatic {
    public static void main(String[] args) {
    Scanner input_val = new Scanner(System.in);
    int a = input(input_val,"Enter First Number");
    int b = input(input_val,"Enter Second Number");
        int su = sum(a,b);
        System.out.println("Sum of Entered number is " + su);
        int sb = sub(a,b);
        System.out.println("Subtration of Entered number is " + sb);
        int mu = mul(a,b);
        System.out.println("Multiplication of Entered number is " + mu);
        int di = div(a,b);
        System.out.println("Division of Entered number is " + di);
    }
    static int input(Scanner input_val, String Prompt)
    {
        while(true) {
            System.out.println(Prompt);
            if (input_val.hasNextInt()) {
                return input_val.nextInt();
            } else {
                System.out.println("Kindly Enter Integer only");
                input_val.next();
            }
        }
    };
    static int sum(int a , int b)
    {
        return a+b;
    };
    static int mul(int a , int b)
    {
        return a*b;
    };
    static int sub(int a , int b)
    {
        if(a>b) {
            return a - b;
        }else{
            System.out.println("As Second number is Greater than first hence, subtracting first from second");
            return b-a;
        }
    };
    static int div(int a , int b)
    {
        if(a !=0 && b!=0) {
            return a / b;
        }else{
            System.out.println("Kindly enter non Zero");
            throw new ArithmeticException("Kindly enter non zero number only"); // Another method to throw error


        }
    }

}
