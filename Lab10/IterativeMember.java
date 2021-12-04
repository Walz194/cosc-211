import java.util.Scanner;

public class IterativeMember {
	public static void main(String[] args)  {	
		Scanner stdin = new Scanner(System.in);
		
		double[] number = new double[10];
		for(int k = 0; k < number.length; k++)	{
			System.out.print("Please enter element#" + (k + 1)+": ");
			number[k] = stdin.nextDouble();
		}
	
		System.out.print("\nNow enter element to search for: ");
		double element = stdin.nextDouble();
		
		if (isMember(element, number))
		    System.out.println(element+ " is contained in the array");
		else
		    System.out.println(element+ " is NOT contained in the array");
	}
	
	public static boolean isMember(double e, double[] x) {
		for (int i=0; i<x.length; i++)
		   if (x[i] == e)
		      return true;
		      
		return false;
	}
}