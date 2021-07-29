package ch02_1_variable;

public class VariableExchangeExample {

	public static void main(String[] args) {
	/*두개의 변수값을 맞바꾸어 주는 프로그램 
	 * temp 임의의 변수가 이용됨 
	 */
		int x=3;
		int y=5;
		System.out.println("x: "+x +",y: "+y);
		int temp=x;
		x=y;
		y=temp;
		System.out.println("x: "+x +",y: "+y);
	}

}
