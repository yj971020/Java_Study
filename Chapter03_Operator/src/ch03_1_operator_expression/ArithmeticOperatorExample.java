package ch03_1_operator_expression;

public class ArithmeticOperatorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int v1=5;
		int v2=2;
		
		int result1=v1+v2;
		System.out.printf("result1 : %d\n ",result1);
		
		int result2=v1-v2;
		System.out.printf("result2 : %d\n ",result2);
		
		int result3=v1*v2;
		System.out.printf("result3 : %d\n ",result3);
				
		int result4=v1/v2;
		System.out.printf("result4 : %d\n ",result4);
		
		int result5=v1%v2;
		System.out.printf("result5 : %d\n ",result5);
		
		double result6=(double) v1/v2 ;
		System.out.printf("result1 : %3.0f\n ",result6);
	}

}
