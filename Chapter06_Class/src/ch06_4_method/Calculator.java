package ch06_4_method;

public class Calculator {

	void PowerOn() {
		System.out.println("������ �մϴ�.");
	}

	int plus(int x, int y) {
		int result = x + y;
		return result;
	}

	double avg(int x, int y) {
		double sum=plus(x,y);
		double result=sum/2;
		return result;
	}
	
	void excute() {
		double result =avg(7,10);
		println("������: "+ result);
	}
	private void println(String string) {
		System.out.println(string);
		
	}

	double divide(int x, int y) {
		if(y==0) {
			System.out.println("0���� ���� �� �����ϴ�.");
		}
		double result = (double) x / (double) y;
		return result;
	}

	void powerOff() {
		System.out.println("������ ���ϴ�");
	}

}
