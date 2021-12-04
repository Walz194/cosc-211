//Lab 03
//ReadingInput.java
import java.util.Scanner;
import java.io.IOException;

public class ReadingInput {
  public static void main(String[] args)throws IOException {
    /*Scanner input = new Scanner(System.in);
    
    System.out.print("Please enter your name: ");
    String name = input.nextLine();
    
    System.out.print("Now enter your age: ");
    int age = input.nextInt();
	
	System.out.print("Enter amount to donate: ");
	double amount = input.nextDouble();
    
    System.out.printf("Mr. %s after one year you will be %d years\n",name, (age+1));
	System.out.printf("This is the amount you donated $%,.2f",amount);*/
	 int x, y, z;
	 int p = 9, q = 4, r;
	 double k =25.7,a;
	  a= Math.abs(k);
		x = 2;y = 3;z = 4 - (++y) +(++x);
		System.out.print("X= "+x+"," +"Y = "+y+"," +"Z = "+z);
		System.out.println();
		System.out.println(k);
		z = p % q;
		System.out.print("Z= "+z);
		
  }
}