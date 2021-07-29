package ch02_3_type_casting;

public class CastingExample1 {
	public static void main(String[] args) {

		/*
		 * 강제 (명시적) 형변환 :~ 해석하는 방법을 변환
		 */
		System.out.println((char) 65); //출력: A
		
		// 확장 (promotion): int ---> double 손실(x) 자동형변환
		// 축소(Demotion) : double ---> int 손실(o) 강제형변환 ..0.5 --> 0

		int iv = 127;
		iv = 1000000;
		// byte bv = iv; 작은곳에 큰값 넣음 --> 오류

		byte bv = (byte) iv;
		System.out.println(bv); // 출력:64

		// (char)<--- int ... long...
		double dv = 3.14;
		iv = (int) dv;

		System.out.println(iv); // 출력 :3

		System.out.println("971020"); // 숫자가 아닌 문자열 (string)
		// 예) 회원가입시 형변환이 필요함

	}
}
