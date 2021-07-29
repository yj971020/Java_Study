package ch02_1_variable;

public class VariableUseExample {

	public static void main(String[] args) {
		/*
		 * 시간을 표시함
		 * 시간은 분으로 바꾸어 표시함
		 */
		int hour=3;
		int minute =5;
		System.out.println(hour +" 시간"+minute+"분");
		int totalminute =(hour*60) + minute;
		System.out.println("총 "+ totalminute + "분");
		//system.out.println ("3"+3); 하면 
		//결과는 33 나옴 
	}

}
