package ex_21_Stattic;

public class Staticvariable_Mth {
    public static void main(String[] args) {
        student st = new student(23);
        student s2 =new student(40);
        System.out.println(st.a);
        System.out.println(s2.a);

        System.out.println(student.course); // This is called directly without creating instance bacause of Static
        student.methodm1();
    }
}

class student {
    int a =10;
    static String course = "ATB";
    public student(int age){
        this.a=age;
    }
    static void methodm1(){
        System.out.println("I am static Method");
    }
}