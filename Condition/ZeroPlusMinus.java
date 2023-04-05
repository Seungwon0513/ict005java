import java.util.Scanner;



public class ZeroPlusMinus {

	public static void main(String[] args) {
		int number;
		Scanner sc = new Scanner(System.in);

		System.out.print("정수를 입력하시오: ");
		number = sc.nextInt();

		if (number == 0) {
			System.out.println("zero");
		}
		else if (number > 0 ) {
			System.out.println("plus");
		}
		else if (number < 0 ) {
			System.out.println("minus");
		}

	}
}
