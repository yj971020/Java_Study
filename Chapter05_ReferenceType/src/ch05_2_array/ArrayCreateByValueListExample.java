package ch05_2_array;

public class ArrayCreateByValueListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] scores = { 83, 90, 87 };
		//int[] scores = new int[3];
		int sum=0;
		
		
		System.out.println("scores[0]: " + scores[0]);
		System.out.println("scores[0]: " + scores[1]);
		System.out.println("scores[0]: " + scores[2]);
		
		for (int i = 0; i < scores.length; i++) {
			System.out.print(scores[i]+" ");
			sum+=scores[i];
		}
		
		System.out.println("ÃÑÇÕÀº:  "+sum);
	}

}
