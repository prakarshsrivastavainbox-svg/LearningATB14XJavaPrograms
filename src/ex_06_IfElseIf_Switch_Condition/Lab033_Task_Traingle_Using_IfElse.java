/*Write a program that classifies a triangle based on its side lengths.
// Given three input values representing the lengths of the sides, determine if the triangle
// is equilateral (all sides are equal), isosceles (exactly two sides are equal),
// or scalene (no sides are equal). Use an if-else statement to classify the triangle.
given all the input should be valid, and a validation should be there */
package ex_06_IfElseIf_Switch_Condition;
import java.util.Objects;
import java.util.Scanner;
public class Lab033_Task_Traingle_Using_IfElse {
    public static void main(String[] args) {
        Scanner input_val = new Scanner(System.in);
        double side1 , side2, side3;
        while (true) {
            System.out.print("Please enter a side 1: ");
            if (input_val.hasNextDouble()) {
                side1 = input_val.nextDouble();
                break; // valid input received, exit loop
            } else {
                System.out.println("Invalid input! Please enter a number.");
                input_val.next(); // discard invalid input
            }
        };
        while (true) {
            System.out.print("Please enter a side 2: ");
            if (input_val.hasNextDouble()) {
                side2 = input_val.nextDouble();
                break; // valid input received, exit loop
            } else {
                System.out.println("Invalid input! Please enter a number.");
                input_val.next(); // discard invalid input
            }
        };
        while (true) {
            System.out.print("Please enter a side 3: ");
            if (input_val.hasNextDouble()) {
                side3 = input_val.nextDouble();
                break; // valid input received, exit loop
            } else {
                System.out.println("Invalid input! Please enter a number.");
                input_val.next(); // discard invalid input
            }
        };
if ((side1+side2 > side3) && (side3+side2 > side1) && (side1+side3 > side2))
{
    if (side1 == side2 && side2 == side3 && side3 == side1)
    {
        System.out.println("Its a Equilateral Triangle"); // All Sides are equal
    }
    else if(side1 == side2 || side2 == side3 || side3 == side1){
        System.out.println("It is isoceles"); // Any Two sides are equal
    }else{
        System.out.println("It is scalene"); // no Sides are equal
    }

}else {
    System.out.println("It is not a triangle");
}
    }
}