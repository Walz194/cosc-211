class BankAccount {
	private int accountNumber;
	private String customerName;
	private double balance;
		
	public BankAccount(int number, String name, double bal) {
		accountNumber = number;
		customerName = name;
		if (bal >= 0)
		    balance = bal;
	}
	
	public BankAccount(int accountNumber, String name) {
		this(accountNumber, name, 0.0);
	}
		
	public void deposit (double amount) {
		if (amount > 0)
		    balance += amount;
	}
	
	public void withdraw(double amount) {
		if (amount>0 && amount <= balance)
		   balance -= amount;
	} 
	
	public double getBalance() {
		return balance;
	}
	
	public void trasferTo(BankAccount account, double amount) {
		if (amount > 0 && amount <= balance) {
			withdraw(amount);
			account.deposit(amount);
	    } 		
	}
	
	public String toString() {
		return "Account Number: "+accountNumber+", Name: "+customerName+" , Balance: "+balance;
	}
}
