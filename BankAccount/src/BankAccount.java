import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class BankAccount {
	private String accountNum;
	private Double checkingBal;
	private Double savingsBal;
	
	
	private static int numberOfAccts = 0;
	private static double totalBal= 0.00;
	public BankAccount(String newNum, Double newChecking, Double Savings) {
	accountNum = random10();
	checkingBal = newChecking;
	savingsBal = Savings;
	setNumberOfAccts(getNumberOfAccts() + 1);
	
	
	}
	//getter
	public static int getPeopleCount() {
		return getNumberOfAccts();
	}
	//setter
	public void setNumberofAccts(int number) {
		setNumberOfAccts(number);
	}
	
	//getter
	public double getCheckingBalance() {
		return checkingBal;
	}
	//setter
	public void setCheckingBalance(double checkingBalance) {
		checkingBal= checkingBal + checkingBalance;
	}
	
	//getter
	public double getSavingsBalance() {
		return savingsBal;
	}
	
	//setter
	public void setSavingsBalance(double savingsBalance) {
		savingsBal = savingsBal + savingsBalance;
	}
	
	public static int getNumberOfAccts() {
		return numberOfAccts;
	}
	public static void setNumberOfAccts(int numberOfAccts) {
		BankAccount.numberOfAccts = numberOfAccts;
	}
	//Random Account Number Generator
	private String random10() {
		Random ran = new Random();
		String charList = "1234567890";
		StringBuffer accnum = new StringBuffer();
		for (int i = 0; i < 10; i++) {
			int number = (ran.nextInt(9-0));
			char ch = charList.charAt(number);
			accnum.append(ch);
			}
		return (accnum.toString());
	}
	
	//Make a Deposit
	public void deposit(String accType, double value) {	
		if (accType == "Checking"){
			checkingBal = checkingBal + value;
			totalBal = totalBal + value;
		}else { System.out.println("Account Type Error, deposit of "+ value + " not completed");
		   }
		if (accType == "Savings") {
			savingsBal = savingsBal + value;
			totalBal = totalBal + value;
		
		}else { System.out.println("Account Type Error, deposit of "+ value + " not completed");
		   }
	}
	//Make a Withdrawl
	public double withdrawl(String type, double value) {
		
		if (type == "Checking"){
			if (value > checkingBal){
				System.out.println("Insufficient Funds");
				return checkingBal;
			} else{
				checkingBal = checkingBal - value;
				totalBal = totalBal - value;
				return value;
			}
		}
		
		
		if (type == "Savings") {
			if (value > savingsBal) {
				System.out.println("Insufficient Funds");
				return savingsBal;
			}
				savingsBal = savingsBal - value;
				totalBal = totalBal - value;
				return value;
		}
		else { System.out.println("Account Type Error, could not complete withdrawl of " + value + " not completed");
		return value;
		}
		
	}	
}

	


