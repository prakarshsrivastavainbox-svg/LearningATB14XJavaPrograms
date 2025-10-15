package ex_13_MultidimensionalArray;
import java.util.Scanner;
/*
				    j<n	n-i
			n	row	star space
		*	3	1	1	2
	*	*	3	2	2	1
*	*	*	3	3	3	0
sequence be like in aow first space then star

 */

public class Lab54_Tiranglepattern4 {
   public static void main(String[] args) {
        Scanner input_val =new Scanner(System.in);
       System.out.println("GIve the number to print the pattern");
        int n = input_val.nextInt();
                for (int i = 0; i<n;i++)
        {
            for (int k =0;k<=(n- i);k++)
            {
                System.out.print(" ");
            }
            for ( int j=0;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
