package ch02_3_type_casting;

public class ByteOperationExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// [정수 연산에서의 자동 타입변환]
		byte x = 10, y = 20; 
	   //  byte result=x+y; // 컴파일에러: 연산시 int로 자동변환함 --> 저 작은 byte로 변환불가
		byte result=(byte)(x+y);//강제형변환
		System.out.println(result);
		
		byte x1=100,y1=29;
		byte result1=(byte)(x1+y1);
		System.out.println(result1); //출력: -127
		
		
	}

}
