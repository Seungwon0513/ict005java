import java.util.Scanner;



public class No1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int sum = 0;
		String letter;

		do {
			System.out.println("정수를 입력하시오: ");
			letter = sc.nextLine();

			if (!letter.equals("q")) {
				int num = Integer.parseInt(letter);
				sum += num;
			}
		} while (!letter.equals("q"));

		System.out.println("정수의 합계는: " + sum);
	}
}