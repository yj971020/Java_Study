package ch10_1_exception_class;

public class NumberFormatExceptionExample {
	public static void main(String[] args) {
		String data1 = "100";
		String data2 = "a100";

		int value1 = Integer.parseInt(data1);
		int value2 = Integer.parseInt(data2);
		int result=value1+value2;
		System.out.printf("%d+%d=%d\n",value1,value2,result); //data2 에 문자가 포함되어 예외발생
	}

}
