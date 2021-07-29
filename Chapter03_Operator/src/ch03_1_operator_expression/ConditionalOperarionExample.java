package ch03_1_operator_expression;

public class ConditionalOperarionExample {

	public static void main(String[] args) {

		int score = 85;

		char grade = (score > 90) ? 'A' : ((score > 80) ? 'B' : 'C');
		System.out.printf("%d 점은 %c 등급 입니다 . \n", score, grade);
	}

}
