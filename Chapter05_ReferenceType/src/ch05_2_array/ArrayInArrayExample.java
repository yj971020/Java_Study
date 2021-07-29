package ch05_2_array;

public class ArrayInArrayExample {

	public static void main(String[] args) {

		int[][] mathScores = new int[2][3];

		for (int i = 0; i < mathScores.length; i++) { // mathScores.length : ÇàÀÇ °¹¼ö
			for (int k = 0; k < mathScores[i].length; k++) { // mathScores[i].length :i ÇàÀÇ ¿­ÀÇ °¹¼ö
				System.out.println("mathScores[" + i + "][" + k + "]=" + mathScores[i][k]);
			}
		}
		System.out.println();

		int[][] englishScores = new int[2][];
		englishScores[0] = new int[2];
		englishScores[1] = new int[3];

		for (int i = 0; i < englishScores.length; i++) { // englishScores.length : ÇàÀÇ °¹¼ö
			for (int k = 0; k < englishScores[i].length; k++) { // englishScores[i].length :i ÇàÀÇ ¿­ÀÇ °¹¼ö
				System.out.println("englishScores[" + i + "][" + k + "]=" + englishScores[i][k]);
			}
		}
		System.out.println();

		int[][] javaScores = { { 95, 80 }, { 92, 96, 80 } };
		for (int i = 0; i < javaScores.length; i++) { // javaScores.length : ÇàÀÇ °¹¼ö
			for (int k = 0; k < javaScores[i].length; k++) { // javaScores[i].length :i ÇàÀÇ ¿­ÀÇ °¹¼ö
				System.out.println("javaScores[" + i + "][" + k + "]=" + javaScores[i][k]);
			}
		}
	}
}
