package ch02_4_Console_in_out;

import java.util.Scanner;

public class ScannerExample {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		String inputData = ""; // �ʱ�ȭ

		while (true) {
			inputData = scanner.nextLine();
			System.out.println("�Էµ� ���ڿ�: \"" + inputData + "\"");
			System.out.printf("�Է��Ͻ� ���ڿ��� \"%s\"�Դϴ�.\n",inputData);
			if (inputData.equalsIgnoreCase("q")) { // equalsIgnoreCase: ��ҹ��� ��� ����
				// string �� inputData=='q' �̷������� ��� ����
				// inputData.equals("q")
				break;
			}
		}
		System.out.println("���α׷� ����");
		scanner.close(); // ���ҽ� ���� : ���α׷� ����� ��ĳ�� ���ҽ� ���� ��Ű��
	}
}
