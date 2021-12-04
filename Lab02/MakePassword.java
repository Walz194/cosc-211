/* generates a password for a student using his initials and age */
// Lab02
//MakePassword.java
public class MakePassword {
	public static void main(String[] args) {
		String firstName = "Amr";
		String middleName = "Samir";
		String lastName = "Al-Ibrahim";
		int age = 20;
		
		//extract initials
		String initials = 
		     firstName.substring(0,1)+
		     middleName.substring(0,1)+
		     lastName.substring(3,4);
		     
		//append age
		String password = initials.toLowerCase()+age;
		
		System.out.printf("Your Password = %-20s",password);
	}
}


		
