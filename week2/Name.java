import java.util.Scanner;



public class Name {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("이름을 입력하시오: ");
		String name = sc.next();

		System.out.print("나이를 입력하시오: ");
		int age = sc.nextInt();

		System.out.println(name + "님 안녕하세요! " + (age) + "살이시네요.");

	}
}
