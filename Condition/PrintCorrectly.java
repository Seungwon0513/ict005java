import java.util.Scanner;



public class PrintCorrectly {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String letter = sc.next();

		switch(letter) {
		case "A":
			System.out.println("Excellent"); break;
		case "B":
			System.out.println("Good"); break;
		case "C":
			System.out.println("Usually"); break;
		case "D":
			System.out.println("Effor"); break;
		case "F":
			System.out.println("Failure"); break;
		default:
			System.out.println("error"); break;
		}
	}
}
