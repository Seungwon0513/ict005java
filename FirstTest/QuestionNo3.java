import java.util.Scanner;



public class QuestionNo3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("첫번째 정수를 입력하십시오: ");
		int num1 = sc.nextInt();

		System.out.print("두번째 정수를 입력하십시오: ");
		int num2 = sc.nextInt();

		System.out.print("세번째 정수를 입력하십시오: ");
		int num3 = sc.nextInt();

		int max = num1;

		if (num2 > max) {
			max = num2;
		}

		if (num3 > max) {
			max = num3;
		}

		System.out.println("가장 큰 수는 " + max + "입니다.");
	}
}