import java.util.Scanner;



public class No1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count =0;

		while (true) {
			int i = sc.nextInt();
			if (i == 0) break;

			if (i% 3 !=0 && i % 5 !=0) {
				count++;
			}
		}

		System.out.println("3과 5의 배수를 제외한 수들의 개수: " + count);
	}
}