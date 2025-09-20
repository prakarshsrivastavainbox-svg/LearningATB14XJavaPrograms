package ex_05_TernaryOperator;

public class Lab027_Task_CheckGreatest_Ternary {
    public static void main(String[] args) {
        //Interview - Zeta → (AT) Ter nested → Max between 3 numbers →  int n1 = 2; int n2 = 9;  int n3 = -11;
        int n1,n2,n3;
        String result;
        n1=-80;
        n2=-11;
        n3=11;
        result = (n1 > n2 && n1 > n3) ? "n1 is greatest" : ((n2>n3 && n2>n1) ? "n2 is greatest": ((n3>n2 && n3>n1) ? "n3 is greatest": "Not a Greater Number"));
        System.out.println(result);
    }
}
