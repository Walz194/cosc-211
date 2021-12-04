public class Employee {

   private int iDNumber;
   private String name;
   private double salary;

   public Employee(int iDNumber, String name, double salary) {
      this.iDNumber = iDNumber;
      this.name = name;
      this.salary = salary;
   }

   public Employee(String name, int iDNumber, double salary) {
      this(iDNumber,name,salary);
   }

   public Employee(int iDNumber, String name) {
      this(iDNumber, name, 0.0);
   }

   public Employee(String name, int iDNumber) {
      this(iDNumber, name, 0.0);
   }

   public void setSalary(double salary) {
      this.salary = salary;
   }

   public int getIDNumber() {
      return iDNumber;
   }

   public String getName() {
      return name;
   }

   public double getSalary() {
      return salary;
   }        

   public void reomveDeductions(double amount) {
      salary -= amount;
   }

   public void raiseSalary(double percentIncrease) {
      salary += salary * percentIncrease/100;
   }

   public String toString() {
      return iDNumber+"\t"+name+"\t"+salary;
   }
}
