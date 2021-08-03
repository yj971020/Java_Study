package ch06_4_method;

public class Calc_ex {

	public static void main(String[] args) {
		
		Calc c=new Calc();
		
		//정사각형 넓이
		double result1=c.areaRectangle(10);
		//직사각형 넓이
		double result2=c.areaRectangle(10, 20);

		System.out.println("정사각형 넓이:" +result1);
		System.out.println("직사각형 넓이:" +result2);
	}
}
