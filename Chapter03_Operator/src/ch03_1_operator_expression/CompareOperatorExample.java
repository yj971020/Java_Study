package ch03_1_operator_expression;

public class CompareOperatorExample {

	public static void main(String[] args) throws InterruptedException {
		int num1 = 10;
		int num2 = 10;
		boolean result1 = (num1 == num2);
		boolean result2 = (num1 != num2);
		boolean result3 = (num1 <= num2);

		System.out.printf("result1= %b\n ", result1);
		System.out.printf("result2= %b\n ", result2);
		System.out.printf("result3= %b\n ", result3);

		char char1 = 'A';
		char char2 = 'B';
		System.out.printf("result4= %b\n", char1 < char2);
		
//		int count =10;
//		while (count!=0) {
//			Thread.sleep(500);
//			System.out.println(count--);
//		}
		System.out.println("น฿ป็");
	}

}
