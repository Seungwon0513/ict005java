

public class AccountTest {

	public static void main(String[] args) {
		Account account = new Account ("441-0290-1203", 500000, 7.3/100);

		System.out.println("계좌번호: " + account.getAccount() + " 현재 잔액은 " + account.getBalance());

		account.deposit(20000);
		account.calculateInterest();

		System.out.println("계좌번호: " + account.getAccount() + " 현재 잔액은 " + account.getBalance());
		System.out.println("이자: " + account.calculateInterest()	);
	}
}
