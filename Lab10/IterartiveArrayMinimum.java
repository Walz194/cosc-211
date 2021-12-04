import java.util.Scanner;

public class IterartiveArrayMinimum {
	public static void main(String[] args) {	
		Scanner stdin = new Scanner(System.in);
		
		double[] number = new double[10];
		for(int k = 0; k < number.length; k++)	{
			System.out.print("Please enter element#" + (k + 1)+": ");
			number[k] = stdin.nextDouble();
		}
	
		System.out.println("The minimum value in the array is " + arrayMinimum(number));
		System.out.println();
	}

	public static double arrayMinimum(double[] x) {
		double min = x[0];
		for (int i=1; i<x.length; i++)
		   if (x[i] < min)
		      min = x[i];
        return min;
	}
}