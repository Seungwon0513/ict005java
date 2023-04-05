import java.util.Scanner;



public class GenderSeperator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter gender (M/F): ");
		String gender  = sc.next();

		System.out.print("Enter age: ");
		int age = sc.nextInt();

		if (gender.equals("M")) {
			if (age >= 18) {
				System.out.println("MAN");
			}
			else {
				System.out.println("BOY");
			}
		}
		else if (gender.equals("F")) {
			if (age >= 18) {
				System.out.println("WOMAN");
			}
			else {
				System.out.println("GIRL");
			}

		}
	}
}