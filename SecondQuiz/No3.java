import java.util.Scanner;



public class No3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("정수를 입력하시오: ");
		int num = sc.nextInt();

		for (int i=1; i<100; i++) {
			int multiple = num * 1;
			if (multiple >=100) {
				break;
			}
			System.out.println(multiple);
			if (multiple % 10 == 0) {
				break;
			}
		}
	}
}