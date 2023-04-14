import java.util.Scanner;



public class No2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("정수를 입력하시오: ");
		int num = sc.nextInt();

		int sum = 0;
		for (int i=num; i<=100; i++) {
			sum += i;
		}

		System.out.println(num + "부터 100까지의 합은: " + sum);
	}
}