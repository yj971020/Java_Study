package ch10_3_example;

import java.util.Scanner;

public class ExceptionCase {

	public static void main(String[] args) throws DiviedByZero {

		// �� ������ ����ڷκ��� �Է� �ް� ������
		// �Է¹��� ���ڿ� ������ ����� ����Ͻÿ�
	try {
		Scanner scanner = new Scanner(System.in);

		System.out.print("a/b : a �� �Է��ϼ���");
		int a = scanner.nextInt();
		System.out.print("a/b : b �� �Է��ϼ���");
		int b = scanner.nextInt();
		System.out.printf("%d%/d=%d\n", a, b, a / b);
	}catch(ArithmeticException e) {
		System.out.println("0���� ������ �����ϴ�");
	}finally {
		System.out.println("���α׷� ����");
	}


	}
}
