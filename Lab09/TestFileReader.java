import java.io.*;

class TestFileReader {
	public static void main(String[] args) throws IOException {
		char c;
		int input;
		
		FileReader in = new FileReader("inputfile.txt");
		while ((input=in.read()) != -1) {
			c = (char) input;
			System.out.print(c);
	    }
	    System.out.println(); 
	    in.close();
   }
}		   