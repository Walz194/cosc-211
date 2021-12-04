import java.util.Scanner;

public class IterativeSumFromOneTo {
    public static void main(String args[]) {
        System.out.println(sumFromOneTo(10));
    }

    public static int sumFromOneTo(int n) {
    	int sum=0;
    	for (int i=1; i<=n; i++)
    	    sum+=i;
    	return sum;
    }
}

