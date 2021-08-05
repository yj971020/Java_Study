package ch07_1_Inheritance;

public class Computer extends Calculator{
	@Override
	double areaCircle(double r) {
		System.out.println("Computer °´Ã¼ÀÇ areaCircle() ½ÇÇà");
		return Math.PI*r*r;
	}

}
