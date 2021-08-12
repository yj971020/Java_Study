package ch10_3_example;
//����ó�� 

class Calculator {

	// ���������� i , j���� 1000�� ������ ����!
	int add(int i, int j) throws BizThousandOverException, BizMinusException { // ���ܰ�ü�� �������� : ����Ŭ������ ���� ���ϴ°�
		if (i + j > 1000) {
			throw new BizThousandOverException(); // ���� ��ü�� ����
		}
		if (i + j < 0) {
			throw new BizMinusException();
		}
		return i + j;
	}

	// ���������� i-j ���� �����̸� ����
	int sub(int i, int j) throws BizMinusException {
		if (i - j < 0) {
			throw new BizMinusException();
		}
		return i - j;
	}

	int multi(int i, int j) {
		return i * j;
	}

	// ���������� j �� 0�̸� ����
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
			
		} finally { // �������� ������ �鸣�°�
			System.out.println("�Է°��� Ȯ���ϼ���");
		}
//System.out.println(cal.sub(5,3));
//cal.multi(1,3);
//cal.div(4,2);
//

	}

}
