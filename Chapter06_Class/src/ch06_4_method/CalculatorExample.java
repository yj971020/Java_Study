package ch06_4_method;

public class CalculatorExample {

	public static void main(String[] args) {

		Calculator myCalc= new Calculator();
		myCalc.PowerOn();
		
		int result1= myCalc.plus(5, 6);
		System.out.println("result: "+result1);
		
		byte x=10;
		byte y=4;
		double result2=myCalc.divide(x, y); // byte 가 int 로 들어감 -> int 로 자동 형변환
		System.out.println("result2: "+result2);
		
		double result3=myCalc.divide(4, 8); //int 변수 선언 불가능
		System.out.println("result3: "+ result3);
		
		myCalc.excute();
		myCalc.powerOff();
		
	}

}
