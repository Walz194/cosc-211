import java.util.Scanner;

public class SumFromOneTo {
    public static void main(String args[]) {
        System.out.println(sumFromOneTo(10));
    }

    public static int sumFromOneTo(int n) {
        if (n <= 0) 
           return 0;
        else 
          return sumFromOneTo(n-1)+n;
    }
}

