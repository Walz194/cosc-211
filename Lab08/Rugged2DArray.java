import java.util.Scanner;
import java.util.StringTokenizer;

public class Rugged2DArray {
	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		
		int[][] a = new int[3][];
		a[0] = new int[5];
		a[1] = new int[3];
		a[2] = new int[4];
		
		int row, column;
		
		for(row = 0; row < a.length; row++)	{
			System.out.println("Enter " + a[row].length + " elements for row#" + (row + 1));
			String inputLine = stdin.nextLine();
			StringTokenizer tokenizer = new StringTokenizer(inputLine);
			for(column = 0; column < a[row].length; column++)
				a[row][column] = Integer.parseInt(tokenizer.nextToken());
	    }
	     
	    System.out.println("\nThe array elements are:\n");
	    
	    for(row = 0; row < a.length; row++) {
	          for(column = 0; column < a[row].length; column++)
	          		System.out.print(a[row][column] + "    ");
	          System.out.println();
	    }
	    System.out.println("\n\n");
	}
}
			
		