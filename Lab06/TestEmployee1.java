import java.util.Scanner;

public class TestEmployee1 {
	
	public static void main(String[] args)  {
		Scanner stdin = new Scanner(System.in);
	
		int number;
		String name;
		double salary;
		
		System.out.print("Enter Name for Employee 1: ");
		name = stdin.nextLine();
		System.out.print("Enter ID Number for Employee 1: ");
		number = stdin.nextInt();
		System.out.print("Enter Salary for Employee 1: ");
		salary = stdin.nextDouble();
		
		//any of the following constructors be used to create the object
		Employee1 emp1 = new Employee1(number, name, salary);

// or   Employee1 emp1 = new Employee1(name, number, salary);		
		
		System.out.print("\nEnter Name for Employee 2: ");
		name = stdin.nextLine();
		System.out.print("Enter ID Number for Employee 2: ");
		number = stdin.nextInt();
		
		//if we do not know the salary, we can use the following constructors
		Employee1 emp2 = new Employee1(number, name);
//or	Employee1 emp2 = new Employee1(name, number);

// suppose we wish to assign to emp2 same salary as emp1 
		emp2.setSalary(emp1.getSalary());
		
		emp1.deductions(50);
		emp2.deductions(60, 40);
		
		emp1.printDetails();
		emp2.printDetails();
	}		
}