package ex_13_MultidimensionalArray;

public class Lab50_MultiArray {
   public static void main(String[] args) {
        int[][] multi= {{1,2,3},{4,5,6}};
        for (int i =0; i<multi.length;i++)
        {
            for(int j=0; j<multi[i].length; j++)
            {
                System.out.print(multi[i][j]);
            }
            System.out.println(" ");
        }
    }
}
