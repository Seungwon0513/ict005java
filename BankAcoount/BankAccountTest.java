

public class BankAccountTest {

	public static void main (String[] args) {
		BankAccount2 myAccount = new BankAccount2(10000);
//		myAccount.deposit(10000);
		System.out.println(myAccount);
		myAccount.withdraw(8000);
		System.out.println(myAccount);
	}
}
