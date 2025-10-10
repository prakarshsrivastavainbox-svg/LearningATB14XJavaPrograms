package ex_10_Strings;

public class Lab044_Strings_Functions {
    public static void main(String[] args)
    {
        String name = "Prakarsh";
        String name1 = " Prakarsh1"; // Immutable in Nature (This means it will not delete the previous value in memory)
        String name2 = new String("Srivastava"); // Immutable in Nature
        System.out.println(name.toUpperCase());
        System.out.println(name.substring(4));
        System.out.println(name1.trim());
        System.out.println(name2);
    }
}
