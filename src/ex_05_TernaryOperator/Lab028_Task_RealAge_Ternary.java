package ex_05_TernaryOperator;

public class Lab028_Task_RealAge_Ternary {
    public static void main(String[] args) {
        //Real_Age_Classification (  age → 59 ) →  Minor, Adult (Adult , Sr Senior) - Ternary Operator
        int age;
        String result;
        age=17;
        result = (age >=60) ? "The Person is Senior Citizen" : ((age < 60 && age >=18)? "The person is Adult":((age<18)?"The Person is Minor":"Unwanted data Entered"));
        System.out.println(result);
    }
}
