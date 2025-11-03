package ex_23_Exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Checked_UnChecked {
    public static void main(String[] args) {
        int a=0;
        int b=1;
      //  int c = 1/0; // java.lang.ArithmeticException  This is unchecked As JVM did not highligted it here, instead it gave exception at the compile time
    //    System.out.println(c);
      //  FileInputStream fileInputStream = new FileInputStream(\\C:\Users\nigam\Downloads\SmartConnect); // Checked Exception as As JVM is detecting the error at the Run level.
        // This above exception Can be handled by try and catch method
        try
        {
            FileInputStream fileInputStream = new FileInputStream("C://Users//nigam//Downloads//SmartConnect");
        }
        catch(FileNotFoundException e)
        {
            System.out.println("Exception is Present");
        } finally{
            System.out.println("I will get printed for sure even if try happens or catch happens"); // We can use close mechanism, like sc.close();
        }

    }
}
