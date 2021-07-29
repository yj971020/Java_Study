package ch04;

public class ch04_06_ReverseTriangle {

	public static void main(String[] args) {

		// 04-2 6¹ø
		for (int i = 1; i <= 4; i++) {
			for (int j = 4; j >= i; j--) {
				System.out.print(" ");
			}
			for (int k = 1; k <= i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
