import java.util.Scanner;



public class No4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int sum = 0, value = 0;

		System.out.print("정수를 입력하시오: ");
		value = sc.nextInt();

		while (value != 0) {
			sum = sum + value;

			value --;
		}

		System.out.println("정수까지의 합은: " + sum + "입니다.");
	}
}