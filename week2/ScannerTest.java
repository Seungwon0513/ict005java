import java.util.Scanner;



public class ScannerTest {

	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("첫번째 숫자를 입력하시오: ");
		int x = sc.nextInt();

//		System.out.println( x + 100 );

		System.out.print("두번째 숫자를 입력하시오: ");
		int y = sc.nextInt();

		System.out.println(x+y);

	}

}
