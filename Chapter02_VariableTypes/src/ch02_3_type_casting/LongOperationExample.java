package ch02_3_type_casting;

public class LongOperationExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte val1=10;
		int val2=100;
		long val3=1000L;
		long result = val1+val2+val3; //가장 큰 type으로 맞춰짐
		
		//연산에서의 자동형변환
		//byte +int +long 
		//int+long (byte+int ->int)
		//long+long
		
		
		System.out.println(result);
	}

}
