

public class No2 {

	public static void main(String[] args) {
		for (int i=2; i<=9; i++) {
			System.out.println(i + "단");

			for (int y=1; y<=9; y++) {
				System.out.println(i + "+" + y + "=" + (i*y));
			}
		}
	}
}