import java.util.Scanner;



public class QuestionNo4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("나이를 입력하십시오: ");
		int age = sc.nextInt();

		if (age >= 20) {
			System.out.println("adult");
		}
		else {
			System.out.println((20-age) + "years later");
		}
	}
}