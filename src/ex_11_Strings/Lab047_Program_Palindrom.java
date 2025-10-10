package ex_11_Strings;
import java.util.Scanner;
public class Lab047_Program_Palindrom {
   public static void main(String[] args) {
       Scanner input = new Scanner(System.in);

       while (true) {
           System.out.println("Enter text to check for palindrome (type 'exit' to quit):");
           String a = input.nextLine().trim();

           // Exit condition
           if (a.equalsIgnoreCase("exit")) {
               System.out.println("Exiting program...");
               break;
           }

           // Check if input is numeric (even partially)
           if (a.matches(".*\\d.*")) { // contains any digit
               System.out.println("❌ Numeric input detected! Please enter TEXT only.\n");
               continue; // go back to asking again
           }

           // Remove spaces and convert to lowercase for proper palindrome checking
           String cleanedText = a.replaceAll("\\s+", "").toLowerCase();

           // Reverse the text
           String reversedText = new StringBuilder(cleanedText).reverse().toString();

           // Check if palindrome
           if (cleanedText.equals(reversedText)) {
               System.out.println("✅ The text is a palindrome!");
           } else {
               System.out.println("❌ The text is NOT a palindrome.");
           }
           System.out.println("Reversed text: " + new StringBuilder(a).reverse() + "\n");
       }

       input.close();
   }
}
