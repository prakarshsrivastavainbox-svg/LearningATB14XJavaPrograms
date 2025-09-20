package ex_05_TernaryOperator;

public class Lab026_Task_CheckEvenOdd_Ternary {
    public static void main(String[] args) {
        String result;
        int a =10;
        int b,c;
        c= a%2;
        System.out.println("Checking Number is Even or Odd");
        result = c==0 ? "Even" : "Odd";
        System.out.printf("The number is = %s", result);
    }
}
