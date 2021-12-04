import java.io.*;
import java.util.StringTokenizer;

class GoodAndPoor {
	static final int QUIZ_COUNT = 3,  MAX_STUDENT_COUNT = 30;
	
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new FileReader("quizdata.txt"));
        PrintWriter good = new PrintWriter(new FileWriter("good.txt"));
        PrintWriter poor = new PrintWriter(new FileWriter("poor.txt"));
        Student[] student = new Student[MAX_STUDENT_COUNT];  
        double [] quiz; 
        
        String s, name;
        int iDNumber, actualStudentCount = 0;
        StringTokenizer st;
        double sum=0, average;
        
        while ( (s = in.readLine()) != null) {
		   	st = new StringTokenizer(s, "|");
		   	iDNumber = Integer.parseInt(st.nextToken().trim());
		   	name = st.nextToken();
		   	quiz = new double[QUIZ_COUNT];
		   	for (int i=0; i<quiz.length; i++)
		   	  quiz[i] = Double.parseDouble(st.nextToken().trim());

			student[actualStudentCount] = new Student(iDNumber, name, quiz);
			sum += student[actualStudentCount].average();
			actualStudentCount++;
	    }
	    average = sum/actualStudentCount;
	    
	    good.println("The class average is: "+average);
	    good.println("\r\nStudents with grades equal or above average are:\r\n");
	    
	    poor.println("The class is: "+average);
	    poor.println("\r\nStudents with grades equal or above average are:\r\n");
	    
	    for (int i=0; i<actualStudentCount; i++)
	      if (student[i].average() >= average)
	          good.println(student[i]);
	      else
	          poor.println(student[i]);
	              
	    in.close();
	    good.close();
	    poor.close();
	}
}
