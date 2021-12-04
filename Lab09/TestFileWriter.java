import java.io.*;

class TestFileWriter {
	public static void main(String[] args) throws IOException {
		char c;
		int input;
		
		FileReader in = new FileReader("inputfile.txt");
		FileWriter out = new FileWriter("outputfile.txt");
		while ((input=in.read()) != -1) {
			c = (char) input;
			out.write(c);
	    }
	    System.out.println(); 
	    in.close();
	    out.close();
   }
}		   