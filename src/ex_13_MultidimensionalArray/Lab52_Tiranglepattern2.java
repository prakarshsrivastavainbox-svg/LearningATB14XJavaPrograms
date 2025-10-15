package ex_13_MultidimensionalArray;
import java.util.Scanner;
/*
				i<=n	j<=n	k<i
			n	i	j	k
*	*	*	3	1	3	0
	*	*	3	2	2	1
		*	3	3	1	2

*/
public class Lab52_Tiranglepattern2 {
   public static void main(String[] args) {
        Scanner input_val =new Scanner(System.in);
       System.out.println("GIve the number to print the pattern");
        int n = input_val.nextInt();
        for (int i = 0; i<n;i++)
        {
            for (int k =0;k<i;k++)
        {
            System.out.print(" ");
        }
            for (int j=i;j<n;j++)
            {
                System.out.print("*");
                            }

            System.out.println();
        }
    }
}
