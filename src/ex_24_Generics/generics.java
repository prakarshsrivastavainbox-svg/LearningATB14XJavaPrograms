package ex_24_Generics;
// Generics is a feature where we can crate a function which is general in nature which means
// we do not have to mention the datatype like int,float etc we can just pass the value and it will
// automatically detect the data type of the input value
public class generics {
    public static void main(String[] args) {
        temp_sum_t(10,10);
    }
    // creating generic function
    static <T> T temp_sum_t(T a, T b)
    {
        System.out.println("Values: " + a + ", " + b);
    return null;
    }
}
