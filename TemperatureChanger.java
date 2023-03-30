import java.util.Scanner;



public class TemperatureChanger {
	
	public static void main(String[] args) {
		// 1. 화씨 -> 섭씨, 2. 섭씨 -> 화씨
		// 번호를 선택하시오: 화씨온도를 입력하시오: 섭씨온도
		Scanner sc = new Scanner(System.in);
		
		System.out.print("번호를 선택하시오: ");
		int num = sc.nextInt();
		
		System.out.print( (num == 1) ? "화씨온도를 입력하시오: " : "섭씨온도를 입력하시오: ");
		float f = sc.nextFloat();
		System.out.print( (num == 1) ? "섭씨온도는 " + (f - 32) * 5/9 : "화씨온도는 " + (f * 9/5) + 32);
		
	}

}