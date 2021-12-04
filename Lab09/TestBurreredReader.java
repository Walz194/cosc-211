import java.io.*;

class TestBufferedReader {
	public static void main(String[] args) throws IOException {
		String s;
		
		BufferedReader in = new BufferedReader(new FileReader("inputfile.txt"));
		while ((s=in.readLine()) != null) 
			System.out.println(s);
			
	    in.close();
   }
}		   