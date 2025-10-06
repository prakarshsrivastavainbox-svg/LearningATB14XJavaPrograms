package ex_08_Functions;
import java.util.Scanner;
public class Lab039_Functions_with_inout {
    public static void main(String[] args) {
        Scanner input_val = new Scanner(System.in);
        int a,b;
       while(true) {
           System.out.println("Enter First Number");
           if (!input_val.hasNextInt())
           {
               System.out.println("Enter Integer Only");
               input_val.next();
           }else{
               a = input_val.nextInt();
               break;
           }

       };
        while(true) {
            System.out.println("Enter Second Number");
            if (!input_val.hasNextInt())
            {
                System.out.println("Enter Integer Only");
                input_val.next();
            }else{
                b = input_val.nextInt();
                break;
            }

        };
        wo_pa_wo_rt();
        String s = wo_pa_wi_rt();
        System.out.println(s);
        wi_pa_wo_rt("Prakarsh",33,100);
        int sum = wi_pa_wi_rt(a,b);
        System.out.println(sum);
    }

    /*
Four kind of Functions
1. Without parameters without return type
2. Without parameter with return type
3. With parameter without return type
4. With parameter with return type
 */
    // 1. Without parameters without return type
    static void wo_pa_wo_rt(){
        System.out.println("Hello its a function of  Without parameters without return type");
    };
    // 2. Without parameter with return type
    static String wo_pa_wi_rt(){
        System.out.println("Hello its a function of Without parameter with return type");
        return "Prakarsh";
    };
    // 3. With parameter without return type
    static void wi_pa_wo_rt(String name, int age, double salary){
        System.out.println("Your name is " + name + "\n Your age is " + age + "\n Your salary which keep on increasing day by day by " + salary +"%");

    };
    // 4. With parameter with return type
    static int wi_pa_wi_rt(int a , int b){
        System.out.println("Hello its a function of With parameter with return type");
        System.out.println("Sum of Two Numbers");
        return a+b;
    }
}
