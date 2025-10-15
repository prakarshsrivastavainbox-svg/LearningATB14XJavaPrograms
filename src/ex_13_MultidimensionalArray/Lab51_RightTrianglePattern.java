package ex_13_MultidimensionalArray;
import java.util.Scanner;
public class Lab51_RightTrianglePattern {
   public static void main(String[] args) {
        Scanner input_val =new Scanner(System.in);
       System.out.println("GIve the number to print the pattern");
        int n = input_val.nextInt();
        for (int i = 0; i<n;i++)
        {
            for (int j=0;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
