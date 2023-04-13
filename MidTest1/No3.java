

public class No3 {

	public static void main(String[] args) {

		int sum = 0;

		for (int i=1; i<=100; i++) {
			if (i % 6 == 0) {
				sum += i;
			}
		}

		System.out.println("1부터 100사이의 6의 배수의 합은: " + sum);
	}
}