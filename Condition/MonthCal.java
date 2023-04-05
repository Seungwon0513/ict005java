import java.util.Scanner;



public class MonthCal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("월을 입력하시오: ");
		int month = sc.nextInt();

		int days = 0;

		if (month == 2) {
			days = 28;
		}
		else if (month == 4 || month == 6 || month == 9 || month == 11) {
			days = 30;
		} else {
			days = 31;
		}
		System.out.println(days);
		
		sc.close();

	}
}
