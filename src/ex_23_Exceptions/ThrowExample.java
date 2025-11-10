package ex_23_Exceptions;
import java.util.Scanner;
public class ThrowExample {
    public static void main(String[] args) throws Exception {
    Scanner input_val = new Scanner(System.in);
        System.out.println("Enter Input Number");
        int age = input_val.nextInt();
        validate(age);
    }
    static void validate(int a) throws Exception {
        if (a < 18)
        {
            throw new Exception("Age should be more than 18");
        }else {
            System.out.println("Enjoy");
        }
    }
}
