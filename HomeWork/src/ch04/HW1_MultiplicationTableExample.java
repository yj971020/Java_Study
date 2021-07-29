package ch04;

public class HW1_MultiplicationTableExample {

	public static void main(String[] args) {
		// 옆으로 구구단

		int i;
//		
//		for(int k=1; k<=9; k++) {
//					System.out.printf("**%d단**\t",k);
//				}
//		

		for (i = 1; i <= 9; i++) {

			for (int j = 1; j <= 9; j++) {
				System.out.print(j + "x" + i + "=" + i * j + "\t");
			}
			System.out.println();
		}

	}

}
