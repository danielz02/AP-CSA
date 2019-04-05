package classesAndObjects;

public class Client {
	public static void  main(String[] args) {
		BankAccount daniel = new BankAccount("111111", 50000, 12345678);
		BankAccount andy = new BankAccount();
		System.out.println(daniel.getBalance());
		System.out.println(BankAccount.getTotalAccountNum());
		
	
	/**The difference between 0, null, and void.
	 * 
	 * Null represents nonexistence, which is the default value of reference type.
	 * Void is a return type, which returns nothing.
	 */
		
	}
}
