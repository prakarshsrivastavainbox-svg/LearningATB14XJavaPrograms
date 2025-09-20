package ex_05_TernaryOperator;

public class Lab025_NestedternaryOperator {
    public static void main(String[] args) {
        String result;
        int a =  20;

        result = (a==20) ? (a>21 ? "Yes You can be member" : "No you can not be a member") : "You are minor";
        System.out.println(result);
    }
}
