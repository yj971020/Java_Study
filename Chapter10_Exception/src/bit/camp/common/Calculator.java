package bit.camp.common;

public class Calculator {

	// ���������� x+y ���� 1000 �� ������ ����!
	// ���������� x+y ���� �����̸� ����!
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

	// ���������� x-y ���� �����̸� ����!
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

	// ���������� y�� ���� 0 �̸� ����! 
	public static int div(int x, int y) throws BizDivisionException {
		if(y == 0) {
			throw new BizDivisionException();
		}
			
		int result = x / y;
		return result;
	}

}
