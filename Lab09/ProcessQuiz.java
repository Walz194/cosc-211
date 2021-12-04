import java.io.*;
import java.util.StringTokenizer;

class ProcessQuiz {
	static final int QUIZ_COUNT = 3;
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new FileReader("quizdata.txt"));
        PrintWriter out = new PrintWriter(new FileWriter("result.txt"));
        
        String s, name, iDNumber;
        double[] quiz = new double[3];
        StringTokenizer st;
        
        while ( (s = in.readLine()) != null) {
		   	st = new StringTokenizer(s, "|");
		   	iDNumber = st.nextToken();
		   	name = st.nextToken();
		   	System.out.print(iDNumber+"\t"+name+"\t");
		   	out.print(iDNumber+"\t"+name+"\t");

	        double sum = 0; 	
		   	for (int i = 0; i<quiz.length; i++) {
		   	   quiz[i] = Double.parseDouble(st.nextToken().trim());
		   	   sum += quiz[i];
			   System.out.print(quiz[i]+"\t");
			   out.print(quiz[i]+"\t");
			}

			System.out.println(sum/QUIZ_COUNT);
			out.println(sum/QUIZ_COUNT);
	    }
	    in.close();
	    out.close();
	}
}
