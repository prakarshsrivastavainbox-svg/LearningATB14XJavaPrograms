package ex_12_Arrays;
import java.util.Scanner;
public class Lab49_MaxNumber {
    public static void main(String[] args)
    {
        Scanner input_val = new Scanner(System.in); // For dynamic input
        System.out.println("Enter the Length of array");
        int len = input_val.nextInt();
        int[] arr = new int[len];
        System.out.println("Enter the elements of array");
        for (int j =0;j<=len-1;j++) {
            arr[j] = input_val.nextInt();
        }
        int c=0,b=0;
        for (int i=0;i<=arr.length-1;i++) {
            if (arr[i] > b) {
                c=b; // Logic for second largest number
                b = arr[i];
            }
            else if(arr[i]>c && arr[i]<b) // Logic for second largest number
            {
                c=arr[i];
            }
        }
        /*int[] a= {0,1,2,3,4,5,6,10,8,9,14}; // For Static Input
        int c=0,b=0;
        for (int i=0;i<=a.length-1;i++) {
            if (a[i] > b) {
                c=b; // Logic for second largest number
                b = a[i];
            }
            else if(a[i]>c && a[i]<b) // Logic for second largest number
            {
                c=a[i];
            }
            }*/
        System.out.println("Entered Array is");
        System.out.print("[");
        for (int k = 0; k<= len -1; k++)
        {
            System.out.print(arr[k]);
            if (k< len -1)
            {
                System.out.print(",");
            }

                    }
        System.out.print("]");
        System.out.println("\nSecond largest Number is = " + c);
        System.out.println("Largest Number is = " + b);
        }
           }
