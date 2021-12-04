class Student {
	private int iDNumber;
	double[] quiz;
	
	public Student(int iDNumber, double[] quiz) {
		this.iDNumber = iDNumber;
		this.quiz = quiz;
	}
	
	public int getID() 	{
		return iDNumber;
	}
	
	public double getQuiz(int quizNumber) {
		if(quizNumber >= 1 && quizNumber <= quiz.length)
			return quiz[quizNumber - 1];
		else
		    return -1.0;
	}
			
	public void setQuiz(int quizNumber, double quizGrade) {
		if(quizNumber >= 1 && quizNumber <= quiz.length)
			quiz[quizNumber - 1] = quizGrade;
	}
	
	public double sum() {
		double sum = 0;
		for(int k = 0; k < quiz.length; k++)
			sum += quiz[k];
			
		return sum;
	}
		
	public double average() {
		return sum() / quiz.length;
	}
	
	public String toString() {
		String s = ""+iDNumber;
		for (int i = 0; i<quiz.length; i++)
		   s += "\t"+quiz[i];
		s += "\t"+average();
		
		return s;
	}
}
		
