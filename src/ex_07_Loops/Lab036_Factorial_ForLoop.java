package ex_07_Loops;
import java.util.Scanner;

public class Lab036_Factorial_ForLoop {
    public static void main(String[] args) {
        System.out.println("Enter Number");
      Scanner input_val = new Scanner(System.in);
      if (!input_val.hasNextInt()) {
          System.out.println("Kindly enter Integer only");
      }
          else  {
          int n = input_val.nextInt();
          int f = 1;
              if (n==0)
          {
              System.out.println("Factorial of Zero is 1");
          }
          else{
              if (n<0 || n>Integer.MAX_VALUE)
              {
                  System.out.println("The Value is Out of range");
              } else{
              int i=1;
              while(i<=n)
              {
                 f=f*i;
                 i++;
              }
                  System.out.println(f);
              }
          }
      }
      }
    }

