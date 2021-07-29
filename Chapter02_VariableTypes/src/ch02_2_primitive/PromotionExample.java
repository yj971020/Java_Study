package ch02_2_primitive;

public class PromotionExample {

	public static void main(String[] args) {

//		// 타입(자료형) 변환
//		// 1.자동(묵시적) :컴파일러...
//		// 2.강제(명시적) :
//		
//		//(값 허용범위가 큰타임 = 작은타입 ) 값손실이 발생하지 않는 범위
//		//byte(1) < short(2)=char(2) < int(4) < long(8) < float(4) < double(8) 단위 :byte
//		//값손실은 byte로 따지지 않는다
//		
//		
//		byte bv = 10;  //만약 byte bv=1000; 이면 안됨 (byte:-128~127)
//		int iv = bv;  //int 로 자동형변환
//		
//		int iv1 =999999999;
//		long lv =999999999_999999999L;
//		float fv =9999999999999999999_9999999999999999999.0f;
//		
//		//" 값 손실" 발생여부
//		System.out.println((int)5.7);  //5 출력
		
		byte byteValue=10;
		int intValue=byteValue;
		System.out.println("intValue: "+ intValue);
		
		char charvalue ='가';
		intValue =charvalue;
		System.out.println("가 의 유니코드: "+ intValue);
		
		intValue=50;
		long longValue=intValue;
		System.out.println("longValue: "+ longValue);
		
		longValue=100;
		float floatValue=longValue;
		System.out.println("floatvalue: "+floatValue);
		
		floatValue=100.5f;
		double doubleValue=floatValue;
		System.out.println("doublevalue: "+doubleValue);
		
		
	}

}
