import java.util.Scanner;



public class No4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int score0 = 0;
		int score1 = 0;
		int score2 = 0;
		int score3 = 0;
		int score4 = 0;
		int score5 = 0;
		int score6 = 0;
		int score7 = 0;
		int score8 = 0;
		int score9 = 0;

		for (int i=1; i<=15; i++) {
			int student = sc.nextInt();
			if (student < 10) {
				score0++;
			} else if (student < 20) {
				score1++;
			} else if (student < 30) {
				score2++;
			} else if (student < 40) {
				score3++;
			} else if (student < 50) {
				score4++;
			} else if (student < 60) {
				score5++;
			} else if (student < 70) {
				score6++;
			} else if (student < 80) {
				score7++;
			} else if (student < 90) {
				score8++;
			} else if (student <= 100) {
				score9++;
			}
		}

		System.out.println("0~10 : " + score0);
		System.out.println("10~20 : " + score1);
		System.out.println("20~30 : " + score2);
		System.out.println("30~40 : " + score3);
		System.out.println("40~50 : " + score4);
		System.out.println("50~60 : " + score5);
		System.out.println("60~70 : " + score6);
		System.out.println("70~80 : " + score7);
		System.out.println("80~90 : " + score8);
		System.out.println("90~100 : " + score9);
	}
}
