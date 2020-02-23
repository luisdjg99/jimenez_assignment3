import java.util.*;

public class SavingsAccount {

	private static double anualInterestRate ;
	double savingBalance;
	
	public double calculateMonthlyInterest() {
		savingBalance = ((savingBalance * anualInterestRate)/12) + savingBalance;
		return savingBalance;
	}
	
	public static void modifyInterestRate(double interestRate) {
       anualInterestRate = interestRate;
	}
	
	public double getSavingBalance() {
		return savingBalance;
	}
	
	public void setSavingBalance(double balance) {
		this.savingBalance = balance;
	}
	
	
	
}
