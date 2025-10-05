package ex_07_Loops;
import java.util.Random;
import java.util.Scanner;
public class Lab037_GuessGame_Whileloop {
    public static void main(String[] args) {
        System.out.println("GUESS THE NUMBER GAME");
        System.out.println("Kindly guess the number between 1 to 100, Enter it");
        Scanner input_value = new Scanner(System.in);
                Random ran = new Random();
        int guess = ran.nextInt(101);
        //System.out.println(guess);  // Printing the number
        System.out.println("Enter any Number");
        int i =0;
        while (true) {
            i= i+1;
            if (!input_value.hasNextInt()) {
                System.out.println("Kindly enter the integer value only");
                input_value.next(); // to continue the loop and avoid infinite loop
               continue  ;
            } else {
                int v = input_value.nextInt();
                if (v<0 || v>100){
                    System.out.println("Kindly enter the number in between 1 to 100");
            }else if (v < guess)
                {
                    System.out.println("You are behind from the guess, Try Again");
                }
                else if (v>guess){
                    System.out.println("You are far ahead of the number, Try Again");
                }else {
                    System.out.println("You Guess it right in the count of " + i);
                }
            }
        }
    }
}
