package ex_11_Strings;

public class Lab045_StringsBuilder_StringBuffer {
  public  static void main(String[] args) {
      StringBuffer a = new StringBuffer("Prakarsh"); // Mutable in nature(It will delete the previous value if any operations are done)
      StringBuilder b = new StringBuilder("Srivastava"); // Mutable in nature
      System.out.println(a);
      System.out.println(b);
      System.out.println(a.reverse());
      System.out.println(b.reverse());




  }
}
