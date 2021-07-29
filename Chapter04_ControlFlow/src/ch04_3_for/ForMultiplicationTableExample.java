package ch04_3_for;

public class ForMultiplicationTableExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ±¸±¸´Ü

		int i;
		for (i = 1; i <= 9; i++) {
			for (int j = 1; j <= 9; j++) {
				// System.out.println(i+"x"+j+"="+i*j);
				System.out.printf("%d x %d = %d\n", i, j, i * j);
			}
		}
	}
}
