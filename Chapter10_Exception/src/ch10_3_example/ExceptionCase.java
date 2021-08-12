package ch10_3_example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionCase {

	public static void main(String[] args) throws DiviedByZero {

		// 두 정수를 사용자로부터 입력 받고 나눗셈
		// 입력받은 숫자와 나누기 결과를 출력하시오
		Scanner scanner = new Scanner(System.in);

		try {

			System.out.print("a/b : a 를 입력하세요");
			double a = scanner.nextDouble();
			System.out.print("a/b : b 를 입력하세요");
			double b = scanner.nextDouble();
			if (Double.isInfinite(a / b)) {
				throw new ArithmeticException();
			}
			System.out.printf("%f/%f=%f\n", a, b, a / b);

		} catch (InputMismatchException e) {
			System.out.println("숫자를 입력해야합니다.");
		} catch (ArithmeticException e) {
			System.out.println("0으로 나눌수 없습니다");
		} finally {
			System.out.println("프로그램 종료");
		}

	}
}
