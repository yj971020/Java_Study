package ftp_program;

import java.util.Scanner;

public class ServerMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// 깔끔한 화면을위해 프롬프트 최상단 정리
		for (int i = 0; i < 17; i++) {
			System.out.println(" ");
		}

		// 예외 처리 완료
		int select = 0;
		Loop1: while (true) {
			Menu.dundunDance();
			showMenu();
			System.out.printf("                >");
			try {
				select = Integer.parseInt(sc.nextLine());
			} catch (NumberFormatException e) {
				System.out.println("          1 또는 0만 입력 가능합니다 !!!");
				continue;
			}
			if (select == 1 || select == 0) {
				switch (select) {
				case 1:
					System.out.printf("          1 → Start                   \n");
					System.out.printf("                                      \n");
					break Loop1;
				case 0:
					System.out.println("프로그램을 종료합니다.");
					System.exit(0);
					break;
				}
			} else {
				System.out.println("          1 또는 0만 입력 가능합니다 !!!");
			}
		}
		FTPServer server = new FTPServer();

		// 서버 초기화
		server.init();

		// 서버 시작
		server.start();
	}

	public static void showMenu() {
		System.out.printf("                                      \n");
		System.out.printf("          ■■■■■■■■■■■■■■■■■■■■■■■■■■■■\n");
		System.out.printf("                                      \n");
		System.out.printf("             ♥고결의 나만 쓰는 서버♥              \n");
//		System.out.printf("            [SERVER version 1.0.1®]   \n");
		System.out.printf("                                      \n");
		System.out.printf("          ■■■■■■■■■■■■■■■■■■■■■■■■■■■■\n");
		System.out.printf("                                      \n");
		System.out.printf("                                      \n");
		System.out.printf("                                      \n");

		System.out.printf("          1 → Start                   \n");
		System.out.printf("          0 → End                     \n");
		System.out.printf("                                      \n");
		System.out.printf("                                      \n");
	}
}
