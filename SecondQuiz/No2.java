import java.util.Scanner;



public class No2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("정수를 입력하시오: ");
		int num1 = sc.nextInt();

		System.out.print("정수를 입력하시오: ");
		int num2 = sc.nextInt();

		int sum = 0;
		int count = 0;

		for (int i=num1; i<=num2; i++) {
			sum += i;
			count++;
		}

		double average = (double) sum/count;

		System.out.println(num1 + "부터" + num2 + "까지의 합은: " + sum);
		System.out.println(num1 + "부터" + num2 + "까지의 합은: " + count);
	}
}