import java.util.Scanner;

public class ArrayMinimum {
	public static void main(String[] args)  {	
		Scanner stdin = new Scanner(System.in);
		
		double[] number = new double[10];
		for(int k = 0; k < number.length; k++)	{
			System.out.print("Please enter element#" + (k + 1)+": ");
			number[k] = stdin.nextDouble();
		}
	
		System.out.println("The minimum value in the array is " + arrayMinimum(number, 0));
		System.out.println();
	}

	public static double arrayMinimum(double[] x, int start) {
		if (start == x.length-1)
		   return x[x.length-1];
		else
		   return Math.min(x[start], arrayMinimum(x, start+1));
	}
}