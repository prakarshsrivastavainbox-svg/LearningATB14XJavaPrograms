package ex_07_Loops;

public class Lab034_Task_Odd_EvenNo_UsingFor {
    public static void main(String[] args) {
        //Find odd and Even Number in number from 1 to 100

        for (int i = 0; i <= 100; i++) {
            if (i%2==0)
            {
                System.out.println("Even =>" + i);
               // System.out.println(i);
            }
            else{
                System.out.println("Odd  =>"+ i);
               // System.out.println(i);
            }

        }
    }
}
