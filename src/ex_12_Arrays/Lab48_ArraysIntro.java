package ex_12_Arrays;

public class Lab48_ArraysIntro {
   public static void main(String[] args) {
        int[] a = {0,1,2,3,4,5};
       boolean[] b = {true, false};
        String s = "Prakarsh";
        for (int i=0;i<= a.length-1;i++)
        {
            System.out.println(a[i]);
        };
       String[] s2 = s.split("");
for (String s1 :s2)
{
    System.out.println(s1);
}
   }
}
