import java.util.Random;



public class DiceCounting {
	private int face;

	public DiceCounting() {
		this.face = 0;
	}

	public void roll() {
		Random random = new Random();
		this.face = random.nextInt(6) + 1;
	}

	public int getValue() {
		return this.face;
	}

	public void setValue(int value) {
		this.face = value;
	}

	public static int countOccurrences(DiceCounting dice1, DiceCounting dice2) {
		int count = 0;

		for (int i=0; i<1000; i++) {
			dice1.roll();
			dice2.roll();

			if (dice1.getValue() == 1 && dice2.getValue() == 1) {
				count++;
			}
		}

		return count;
	}

	public static void main(String[] args) {
		DiceCounting dice1 = new DiceCounting();
		DiceCounting dice2 = new DiceCounting();

		dice1.setValue(5);
		dice2.setValue(5);
		System.out.println("주사위1 = " + dice1.getValue() + " 주사위2 = " + dice2.getValue());

		dice1.setValue(3);
		dice2.setValue(4);
		System.out.println("주사위1 = " + dice1.getValue() + " 주사위2 = " + dice2.getValue());

		dice1.setValue(1);
		dice2.setValue(1);
		System.out.println("주사위1 = " + dice1.getValue() + " 주사위2 = " + dice2.getValue());

		int occurrenceCount = countOccurrences(dice1, dice2);
		System.out.println("(1, 1)이 나오는데 걸리는 횟수 = " + occurrenceCount);	
	}
}
