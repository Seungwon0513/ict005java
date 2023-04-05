import java.util.Scanner;



public class PrintingIntoEnglish {

	public static void main(String[] args) {
		// 1: 개, 2: 고양이, 3: 병아리
		Scanner sc = new Scanner (System.in);

		System.out.print("Number? ");
		int number = sc.nextInt();

		String animal;

		switch(number) {
		case 1:
			System.out.println("dog"); break;
		case 2:
			System.out.println("cat"); break;
		case 3:
			System.out.println("chick"); break;
		default:
			System.out.println("I don't know."); break;
		}

	}
}
