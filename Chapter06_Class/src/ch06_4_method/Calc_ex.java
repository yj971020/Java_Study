package ch06_4_method;

public class Calc_ex {

	public static void main(String[] args) {
		
		Calc c=new Calc();
		
		//���簢�� ����
		double result1=c.areaRectangle(10);
		//���簢�� ����
		double result2=c.areaRectangle(10, 20);

		System.out.println("���簢�� ����:" +result1);
		System.out.println("���簢�� ����:" +result2);
	}
}
