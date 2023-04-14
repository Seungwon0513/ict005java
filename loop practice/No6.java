import java.util.Scanner;



public class No6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char continueFlag = 'Y';

		while (continueFlag == 'Y' || continueFlag == 'y') {
			System.out.println("Enter the base of the triangle: ");
			double base = sc.nextDouble();

			System.out.println("Enter the height of the triangle: ");
			double height = sc.nextDouble();

			double area = (base * height) / 2.0;
			area = Math.round (area * 10.0) / 10.0;

			System.out.println("The area of the triangle is: " + area);

			System.out.print("Continue? (Y/N): ");
			continueFlag = sc.next().charAt(0);
		}
	}
}