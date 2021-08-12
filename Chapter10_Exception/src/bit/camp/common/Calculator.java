package bit.camp.common;

public class Calculator {

	// 업무적으로 x+y 값은 1000 을 넘으면 에러!
	// 업무적으로 x+y 값은 음수이면 에러!
	public static int add(int x, int y) throws BizThousandOverException
	, BizMinusException {
		int result = x + y;
		if (result > 1_000) {
			throw new BizThousandOverException();
		}
		if (result < 0) {
			throw new BizMinusException();
		}
		return result;
	}

	// 업무적으로 x-y 값은 음수이면 에러!
	public static int sub(int x, int y) throws BizMinusException {
		int result = x - y;
		if (result < 0) {
			throw new BizMinusException();
		}
		return result;
	}

	public static int multi(int x, int y) {
		int result = x * y;
		return result;
	}

	// 업무적으로 y가 값이 0 이면 에러! 
	public static int div(int x, int y) throws BizDivisionException {
		if(y == 0) {
			throw new BizDivisionException();
		}
			
		int result = x / y;
		return result;
	}

}
