import java.io.*;

class TestPrintWriter {
	public static void main(String[] args) throws IOException {
		String s;
		
		BufferedReader in = new BufferedReader(new FileReader("inputfile.txt"));
		PrintWriter out = new PrintWriter(new FileWriter("outputfile.txt"));
		while ((s=in.readLine()) != null)
			out.println(s);
	    in.close();
	    out.close();
   }
}		   