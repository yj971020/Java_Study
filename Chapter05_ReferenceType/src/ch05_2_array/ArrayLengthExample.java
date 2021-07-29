package ch05_2_array;

public class ArrayLengthExample {

	public static void main(String[] args) {
		
		int sum=0;
		int[] scores= {23,90,84};
		for(int i=0;i<scores.length;i++) {
			sum+=scores[i];
		}
		
		System.out.println("ÃÑÇÕ: "+sum);
		
		
		double avg=(double) sum/scores.length;
		System.out.println("Æò±Õ:"+avg);
	}

}
