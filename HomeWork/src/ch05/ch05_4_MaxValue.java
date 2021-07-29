package ch05;

public class ch05_4_MaxValue {

	public static void main(String[] args) {

		int max = 0;
		int[] array = { 1, 5, 3, 8, 2 };
		for (int i = 0; i < array.length; i++) {
			if (max < array[i]) {
				max = array[i];
			}
		}
		System.out.println("최대값은 :" +max);
	}
}
