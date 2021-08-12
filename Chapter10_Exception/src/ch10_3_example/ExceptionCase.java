package ch10_3_example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionCase {

	public static void main(String[] args) throws DiviedByZero {

		// �� ������ ����ڷκ��� �Է� �ް� ������
		// �Է¹��� ���ڿ� ������ ����� ����Ͻÿ�
		Scanner scanner = new Scanner(System.in);

		try {

			System.out.print("a/b : a �� �Է��ϼ���");
			double a = scanner.nextDouble();
			System.out.print("a/b : b �� �Է��ϼ���");
			double b = scanner.nextDouble();
			if (Double.isInfinite(a / b)) {
				throw new ArithmeticException();
			}
			System.out.printf("%f/%f=%f\n", a, b, a / b);

		} catch (InputMismatchException e) {
			System.out.println("���ڸ� �Է��ؾ��մϴ�.");
		} catch (ArithmeticException e) {
			System.out.println("0���� ������ �����ϴ�");
		} finally {
			System.out.println("���α׷� ����");
		}

	}
}
