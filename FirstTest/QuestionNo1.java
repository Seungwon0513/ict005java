import java.util.Scanner;



public class QuestionNo1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("정수를 입력하시오: ");

		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		int e = sc.nextInt();
		System.out.print(a + 3);
		System.out.print(b - 3);
		System.out.print(c * 3);
		System.out.print(d / 3);
		System.out.print(e % 3);
	}
}