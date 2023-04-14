import java.util.Scanner;



public class No3 {

	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("정수를 입력하시오: ");
		int n = sc.nextInt();

		System.out.print(n + "의 배수는: ");
		for (int i=1; i<=10; i++) {
			System.out.print(n * i + " ");
		}
	}
}
