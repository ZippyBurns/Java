
public class BankAccountTest {
	public static void main(String[] args) {
		BankAccount acc1 = new BankAccount("", 0.00, 0.00);
//		BankAccount acc2 = new BankAccount("", 0.00, 0.00);
		System.out.println(BankAccount.getNumberOfAccts());
//		BankAccount acc3 = new BankAccount("", 0.00, 0.00);
		acc1.deposit("Checking", 45.00);
		acc1.withdrawl("Checking", 28.00);
		System.out.println(acc1.getCheckingBalance());
//		
	}
}
