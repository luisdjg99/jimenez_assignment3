
public class SavingsAccountTest extends SavingsAccount {
	
	public static void main(String[] args) {
		SavingsAccount saver1 = new SavingsAccount();
		SavingsAccount saver2 = new SavingsAccount();
		
		saver1.setSavingBalance(2000.00);
		saver2.setSavingBalance(3000.00);
		
		modifyInterestRate(0.04);
		
		// I used the "\n" to make it easier to read the table
		System.out.println("Month\t saver1\t\t saver2\n");
		
		for(int i = 0; i<12; i++) {
			double balance1 =  saver1.calculateMonthlyInterest();
			double balance2 =  saver2.calculateMonthlyInterest();
			System.out.printf("%d\t %.2f\t %.2f\n", (i +1), balance1, balance2);
		}
		
		modifyInterestRate(0.05);
		
		double lastBalance1 =  saver1.calculateMonthlyInterest();
		double lastBalance2 =  saver2.calculateMonthlyInterest();
		System.out.println("");
		System.out.println("New Balance with 5% interest Rate for next month:\n");
		System.out.printf("13\t %.2f\t %.2f\n",lastBalance1, lastBalance2 );
		
		
		
	}

}
