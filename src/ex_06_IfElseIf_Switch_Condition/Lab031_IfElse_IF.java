
package ex_06_IfElseIf_Switch_Condition;
import java.util.Scanner;
public class Lab031_IfElse_IF {
    public static void main(String[] args) {
        // Program to validate that person is allowed to vote or not, using user input.

        Scanner input_val = new Scanner(System.in);
        System.out.println("Enter a Valid Age to determine whether you are allowed to Vote or Not");
    if(input_val.hasNextInt())
    {
        int age = input_val.nextInt();
        if (age>18) {
            System.out.println("You are allowed to Vote");
        }
        else {
            System.out.println("You Are Minor");
        }
    }
    else {
        System.out.println("Not a valid Integer");
    }

    }
    }
