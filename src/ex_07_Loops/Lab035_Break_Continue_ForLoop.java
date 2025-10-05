package ex_07_Loops;

public class Lab035_Break_Continue_ForLoop {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            if (i== 5)
            {
                continue; // Continue the condition without going to another step, hence skip the run for given condition
            }
            else if(i==9){
                break; // Break the loop and come out of it when condition is met
            }else {
                System.out.println(i);
            }

        }
    }
}
