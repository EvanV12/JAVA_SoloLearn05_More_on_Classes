package a_Encapsulation;

public class BankAccount {
	
	private double balance = 0;
	
	public void deposit (double x) {
		if (x > 0) {
			balance += x;
		}
	}

}

