import java.util.Scanner;



public class QuestionNo2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("민수의 키를 입력하시오(cm): ");
		double minsooheight = sc.nextDouble();
		System.out.println("민수의 몸무게를 입력하시오(kg): ");
		double minsooweight = sc.nextDouble();

		System.out.println("기영이의 키를 입력하시오(cm): ");
		double giyoungheight = sc.nextDouble();
		System.out.println("기영이의 몸무게를 입력하시오(kg): ");
		double giyoungweight = sc.nextDouble();

		if (minsooheight < giyoungheight && minsooweight < giyoungweight) {
			System.out.println("1");
		} else {
			System.out.println("0");
		}
	}
}