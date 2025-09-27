// Program to determine day of the week
package ex_06_IfElseIf_Switch_Condition;
import java.util.Scanner;
public class Lab032_Switch_Statement {
    public static void main(String[] args) {
        System.out.print("Please Enter the value in between 1 to 7 = ");
        Scanner input_val= new Scanner(System.in);
        if (input_val.hasNextInt()) {
            int a = input_val.nextInt();
            switch (a)
            {
                case 1 :
                    System.out.println("Monday");
                    break;
                case 2:
                    System.out.println("Tuesday");
                    break;
                case 3 :
                    System.out.println("Wednesday");
                    break;
                case 4 :
                    System.out.println("Thursday");
                    break;
                case 5:
                    System.out.println("Friday");
                    break;
                case 6 :
                    System.out.println("Saturday");
                    break;
                case 7 :
                    System.out.println("Sunday");
                    break;
                default :
                    System.out.println("Please Enter Between 1 to 7");
                    break;
            }
        }else {
            System.out.println("Kindly Enter the Integer Only");
        }
    }
}
