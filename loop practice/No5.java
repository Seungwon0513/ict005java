import java.util.Scanner;



public class No5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = 0;

		while (true) {
			int num = sc.nextInt();
			if (num == 0) break;

			if (num % 3 !=0 && num % 5 !=0) {
				count++;
			}
		}

		System.out.println("3과 5의 배수를 제외한 수의 합은: " + count);
	}
}