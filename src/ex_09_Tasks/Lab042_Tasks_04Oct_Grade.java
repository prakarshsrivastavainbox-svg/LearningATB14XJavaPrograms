//Write a program that calculates and displays the letter grade for a given numerical score
// (e.g., A, B, C, D, or F) based on the following grading scale:
// A: 90-100 //B: 80-89 //C: 70-79 //D: 60-69 //F: 0-59
package ex_09_Tasks;
import  java.util.Scanner;
public class Lab042_Tasks_04Oct_Grade {
    public static void main(String[] args) {
    Scanner input_val = new Scanner(System.in);
        System.out.println("Enter the marks out of 100");
        while  (true)
        {
            if (!input_val.hasNextInt())
            {
                System.out.println("Kindly Enter the Integer only");
                input_val.next(); // To again ask for the number to enter
            }else {
                int a = input_val.nextInt();
                if (a<0 || a>100)
                {
                    System.out.println("Enter the marks out of 100 only");
                }
                else {
                    char grade;
                    switch(a/10)
                    {
                        case 10 :
                            System.out.println("A");
                            grade ='A';
                            break;
                        case 9 :
                            System.out.println("A");
                            grade ='A';
                            break;
                        case 8 :
                            System.out.println("B");
                            grade ='B';
                            break;
                        case 7 :
                            System.out.println("C");
                            grade ='C';
                            break;
                        case 6 :
                            System.out.println("D");
                            grade ='D';
                            break;
                        default :
                            System.out.println("F");
                            grade ='F';
                            break;
                    }
                    System.out.println("Your grade for your marks is " + grade);
                }
            }
        }

    }
}
