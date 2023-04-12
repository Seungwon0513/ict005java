import java.util.Scanner;



public class Add {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = 0;

		//초기식
		int number = 0;
		while(number !=-1) {//조건식
			System.out.print("정수를 입력하시오: ");
			number = sc.nextInt();
			
			sum += number;
			//증감식
		}

		System.out.println("정수의 합은 " + (sum+1) +"입니다!");
	}
}