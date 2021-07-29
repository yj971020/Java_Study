package ch02_4_Console_in_out;

import java.util.Scanner;

public class ScannerExample {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		String inputData = ""; // 초기화

		while (true) {
			inputData = scanner.nextLine();
			System.out.println("입력된 문자열: \"" + inputData + "\"");
			System.out.printf("입력하신 문자열은 \"%s\"입니다.\n",inputData);
			if (inputData.equalsIgnoreCase("q")) { // equalsIgnoreCase: 대소문자 상관 안함
				// string 은 inputData=='q' 이런식으로 사용 안함
				// inputData.equals("q")
				break;
			}
		}
		System.out.println("프로그램 종료");
		scanner.close(); // 리소스 해제 : 프로그램 종료시 스캐너 리소스 해제 시키기
	}
}
