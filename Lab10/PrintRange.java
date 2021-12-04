import java.util.Scanner;;

public class PrintRange {
    public static void main(String args[]) {
		Scanner stdin = new Scanner(System.in);
    	
    	System.out.print("Enter starting value: ");
    	int start = stdin.nextInt();
    	System.out.print("Enter stoping value: ");
    	int stop = stdin.nextInt();
    	System.out.print("Enter stepping value: ");
    	int step = stdin.nextInt();
    	printRange(start, stop, step);
    }

    public static void printRange(int start, int stop, int step) {
        if (start <= stop) {
           System.out.println(start); 
           printRange(start+step, stop, step);
        }   
    }
}

