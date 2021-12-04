// Demonstrating array of objects 

import java.util.Scanner;

public class TestStudent2 {
	static Scanner stdin = new Scanner(System.in);
	static final int STUDENT_COUNT = 3,  QUIZZES_COUNT = 3;
	
	public static void main(String[] args)  {
		Student[] student = new Student[STUDENT_COUNT];
		
		double sum=0;
		for(int i = 0; i < student.length; i++)	{
			System.out.println("\nCreating student #"+ (i+1));
			student[i] = createStudent();
		}
		
		System.out.println("\nID\tAverage");
		for(int i = 0; i < student.length; i++)	{
			System.out.println(student[i].getID()+"\t"+student[i].average());
			sum += student[i].sum();
	    }
		System.out.println("\nOverall average is: " + sum/(STUDENT_COUNT*QUIZZES_COUNT));
	}
	
	static Student createStudent()  {
		int id;
		double[] quiz = new double[QUIZZES_COUNT];
		System.out.print("Enter student ID# ");
		id = stdin.nextInt();
		
		System.out.println("\nEnter three quizzes for this student");
		for (int i=0; i<quiz.length; i++) {
			System.out.print("Quiz#"+ (i+1)+ " ");
		    quiz[i] = stdin.nextDouble();
		}
		
		Student s = new Student(id, quiz);
		return s;
	}	    		
}