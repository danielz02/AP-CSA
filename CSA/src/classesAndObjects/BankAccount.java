package classesAndObjects;

public class BankAccount {
	private String password;
	private double balance;
	public int accountNum;
	public static final double OVERDRAWN_PENALTY = 20.00;
	private static int countAccount;
	
	public static void welcome() {
		System.out.println("Welcome to Daniel's Bank!");}
	
	//Default constructor constructs bank account with default values.
	public BankAccount()
	{
		balance = 0.0;
		password = "111111";
		accountNum = 12345678;
		countAccount ++;
	}
	public BankAccount(String myPassword, double myBalance, int myNum)
	{
		myBalance = balance;
		myPassword = password;
		myNum = accountNum;
		countAccount ++;
	}
	
	/**
		public double getBanlance(int myNum, String myPassword)
	{	if(myPassword.equals(password) && myNum == accountNum) {
			return balance;
		}	
		else {
			return Double.MIN_VALUE;
		}
		
	}
	 */	
	//By convention getElement doesn't require parameter input.
	public double getBalance() {
		return balance;
	}
	
	//This method is a mutator, which changes the state of the object.
	public boolean deposit(int myNum, String myPassword, double amount)
	{	if (myNum == accountNum && myPassword.equals(password)) {
			balance = balance + amount;
			return true;
		}
		else {
			return false;
		}
		
	}
		
	public void withdraw(String acctPassowrd, double amount)
	{}
	
	//Method Overload:个数、顺序、属性任意一个不同
	public boolean transfer(int myNum, String myPassword, BankAccount other, double amount) {
		return false;
	}
	
	public boolean transfer(int myNum, String myPassword, BankAccount other, String Swift, double amount) {
		return false;
	}
	
	public String toString() {
		String result = "Account Number: " + this.accountNum + "\nBalance: " + this.balance;
		return result;
	}
	
	public static int getTotalAccountNum() {
		return countAccount;
	}//Whether a method is static or not depends on whether this method changes the state of an object.
	
	public boolean euqals(Object x) {
		if (this.balance == ((BankAccount)x).balance)
			return true;
		else
			return false;
	}
}
