import java.util.Scanner;



public class Name {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("�̸��� �Է��Ͻÿ�: ");
		String name = sc.next();

		System.out.print("���̸� �Է��Ͻÿ�: ");
		int age = sc.nextInt();

		System.out.println(name + "�� �ȳ��ϼ���! " + (age) + "���̽ó׿�.");

	}
}
