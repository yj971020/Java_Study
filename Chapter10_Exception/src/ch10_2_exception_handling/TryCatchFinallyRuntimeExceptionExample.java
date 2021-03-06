package ch10_2_exception_handling;

public class TryCatchFinallyRuntimeExceptionExample {
	public static void main(String[] args) {
		
		String data1=null;
		String data2 =null;
		try {
			data1=args[0];
			data2=args[1];
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("실행 매개값의 수가 부족합니다.");
			return; //빠져나가면  프로그램 종료. 아래코드 실행 안됨
		}
		
		try {
			int value1= Integer.parseInt(data1);
			int value2= Integer.parseInt(data2);
			int result=value1+value2;
			System.out.printf("%d+%d=%d",value1,value2,result);
		}catch(NumberFormatException e) {
			System.out.println("숫자로 변환할 수 없습니다.");
		}finally {
			System.out.println("다시실행하세요");
		}
		System.out.println("프로그램 종료");
	}

}
