import java.io.*;
import java.util.Scanner;
import java.util.StringTokenizer;
 
public class Matrix {
  static Scanner stdin = new Scanner(System.in);  
  
  public static double[][] sum(double[][] a, double[][] b) {
     int row = a.length;
     int col = a[0].length;
     double[][] c = new double[row][col];
 
     for (int i=0; i<row; i++) 
      for (int j=0; j<col; j++) 
        c[i][j] = a[i][j] + b[i][j];
      
        return c;
  }
  
  public static double[][] createArray(int row, int col) {
     double[][] array = new double[row][col];
 
     
     for (int i=0; i<row; i++) {
     	System.out.println("Enter a "+row+" by "+col+" matrix row-wise");
        String input = stdin.nextLine();
        StringTokenizer st = new StringTokenizer(input);
         for (int j=0; j<col; j++) 
         array[i][j] = Double.parseDouble(st.nextToken());
     }  
        return array;
  }
  
  public static void print(double[][] a) {
     int row = a.length;
     int col = a[0].length;
 
     for (int i=0; i<row; i++) {
      for (int j=0; j<col; j++) 
        System.out.print(a[i][j]+ "\t");
      System.out.println();
     }  
  }
  
  public static void main(String[] args) throws IOException {
   int row, column;
   System.out.print("Enter number of rows: ");
   row = Integer.parseInt(stdin.nextLine());
   System.out.print("Enter number of columns: ");
   column = Integer.parseInt(stdin.nextLine());
   
   double[][] a = createArray(row, column);
   double[][] b = createArray(row, column);
   double[][] c = sum(a,b);
   System.out.println("The sum of the two arrays is");
   print(c);
  }
}