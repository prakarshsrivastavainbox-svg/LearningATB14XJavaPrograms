package ex_23_Exceptions;
import java.util.Scanner;
public class Exception_UsingThrow {
    public static void main(String[] args) throws CustomException {
    Scanner input_val = new Scanner(System.in);
    if (!input_val.next().equalsIgnoreCase("Pramod"))
    {
        throw new CustomException("Trying Custome Exception");
    }
    }
}
// Custom Exception Class
class CustomException extends Exception {
    public CustomException(String message) {
        super(message);
    }
}