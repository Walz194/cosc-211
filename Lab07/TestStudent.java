import java.io.*;

public class TestStudent {
	public static void main(String[] args)	{
		double[] quiz = {50, 30, 60, 55};
		Student student = new Student(980000, quiz);
		
		/* destroy the object referenced by quiz, so that the only way to obtain quiz information
		   is from the object referenced by student
		*/
		quiz = null;
			
		System.out.println("Student information before changing grade:");
		System.out.println(student);
		
		student.setQuiz(3, 90);
		student.setQuiz(4, 75);
		
		System.out.println("\nStudent information after changing grades:");
		System.out.println(student);
	}
}