package ch02_1_variable;

public class VariableInitializationExample {

	public static void main(String[] args) {
		
		int value;
		value=30;
		
		int result =value +10;
		System.out.println(result); 
		// int a=0; b=0; c=0; 이런식으로 가로로 쓰는것도 가능
		/*
		 * 변수란 ? 
		 * 상수의 반댓말 , 변하는 수 
		 * 상수는 final 
		 * final double pi = 3.141592; 상수 선언
		 * pi=3.14 -> 오류 :상수 선언한뒤에 값 변경 불가 
		 * 
		 */
		
		/*만약 int a=5; int b=0;
		 * b=a;
		 * system.out.println(a==b);
		 * 
		 * 결과는  true
		 */
	}

}
