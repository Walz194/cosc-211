public class ShallowCloning {
 public static void main(String args[]) {
 	
    double[][] a = {{1, 2, 3},
                    {4, 5, 6},
                    {7, 8, 9}};

    System.out.println("Printing array a");
    Matrix.print(a);
    
    double[][] b = (double[][])a.clone();
    System.out.println("Printing array b  - clone of a");
    Matrix.print(b);
    
    b[1][1] = 20;
    System.out.println("Printing array b after making changes to it");
    Matrix.print(b);
   
    System.out.println("Printing array a after changing its clone");
    Matrix.print(a);
  }
}
