package ex_11_Strings;
import java.util.Scanner;
public class Lab046_Program_Reverse {
    public static void main(String[] args) {
        System.out.println("Enter String i will reverse it");
        Scanner input = new Scanner(System.in);
        String a = input.nextLine();
        String b = "";
        for (int i =a.length()-1; i>=0; i--)
        {
            b= b + a.charAt(i);

        }
        System.out.println(b);

        // Another way is using array
        String s = "";
        char[] arr = a.toCharArray();
        for (int i =arr.length-1; i>=0; i--)
        {
            s= s + arr[i];

        }
        System.out.println(s);
    }
    }
