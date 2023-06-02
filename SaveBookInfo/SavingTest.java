import java.util.ArrayList;
import java.util.Scanner;


public class SavingTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList <SaveBookInfo> list = new ArrayList <SaveBookInfo> ();
		int menu = 0;

		while (menu !=4) {
			System.out.println("====================================");
			System.out.println("1. 책 등록");
			System.out.println("2. 책 검색");
			System.out.println("3. 모든 책 출력");
			System.out.println("4. 종료");
			System.out.println("====================================");
			System.out.print("번호를 입력하시오: ");
			menu = sc.nextInt();

			switch (menu) {
			case 1:
				System.out.println("책 제목: ");
				String bookName = sc.next();
				sc.nextLine();
				System.out.println("책 평점: ");
				int rate = sc.nextInt();

				list.add(new SaveBookInfo(bookName,rate));
				System.out.println("책이 등록되었습니다.");
				break;

			case 2:
				System.out.println("검색할 책 제목: ");
				String searchName = sc.next();

				for (int i=0; i<list.size(); i++) {
					if (searchName.equals(list.get(i).bookName)) {

					}
				}

				break;

			case 3:
				System.out.println("등록된 모든 책: ");
				
				for (SaveBookInfo obj : list) {
					System.out.println("책 제목: " + obj.bookName);
					System.out.println("책 평점: " + obj.rate);
					System.out.println("-----------------------");

				}

				break;

			case 4:
				System.out.println("프로그램을 종료합니다.");
				
				break;
				
			}
		}

		sc.close();
	}
}
