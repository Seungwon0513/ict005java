

public class BankAccount2 {
	
	private double balance;
	
	public BankAccount2(double initialBalance) {
		balance = initialBalance;
	}
	
	public void deposit (double amount) {
		balance += amount;
	}
	
	public void withdraw (double amount) {
		if (balance >= amount) {
			balance -= amount;
		} else {
			System.out.println("Insufficient funds");
		}
	}
	
	public String toString() {
		return "현재 잔액 " + balance + "입니다.";
	}
}
