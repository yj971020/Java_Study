package ch10_3_example;
//예외처리 

class Calculator {

	// 업무적으로 i , j값이 1000을 넘으면 에러!
	int add(int i, int j) throws BizThousandOverException, BizMinusException { // 예외객체를 던질것임 : 예외클래스은 내가 정하는것
		if (i + j > 1000) {
			throw new BizThousandOverException(); // 예외 객체를 던짐
		}
		if (i + j < 0) {
			throw new BizMinusException();
		}
		return i + j;
	}

	// 업무적으로 i-j 값이 음수이면 에러
	int sub(int i, int j) throws BizMinusException {
		if (i - j < 0) {
			throw new BizMinusException();
		}
		return i - j;
	}

	int multi(int i, int j) {
		return i * j;
	}

	// 업무적으로 j 가 0이면 에러
	int div(int i, int j) throws BizDivisionException {
		if (j == 0) {
			throw new BizDivisionException();
		}
		return i / j;
	}

}

public class ExceptionExample {
	public static void main(String[] args) throws BizThousandOverException, BizMinusException, BizDivisionException {
		
		Calculator cal = new Calculator();

		try {
			System.out.println(cal.add(10000, -2));
			System.out.println(cal.div(10000, 0));
			
		} catch (BizMinusException e) {
			e.printStackTrace();
			System.out.println(e.toString());
			
		} catch (BizThousandOverException e) {
			//e.printStackTrace();
			System.out.println(e.toString());
			
		} catch (BizDivisionException e) {
			System.out.println(e.toString());
			
		} finally { // 마지막에 무조건 들르는곳
			System.out.println("입력값을 확인하세요");
		}
//System.out.println(cal.sub(5,3));
//cal.multi(1,3);
//cal.div(4,2);
//

	}

}
