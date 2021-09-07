package ftp_program;

import java.util.Scanner;

public class ClientMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// 깔끔한 화면을위해 프롬프트 최상단 정리
		for (int i = 0; i < 17; i++) {
			System.out.println(" ");
		}
		
		//예외 처리 완료
		int select =0;
		Loop1: while (true) {
			Menu.dundunDance();
			showMenu();
			System.out.printf("                >");
			try {
			select = Integer.parseInt(sc.nextLine());
			}catch(NumberFormatException e) {
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
		FTPClient client = new FTPClient();

		// 클라이언트 초기화
		client.init();

		// 클라이언트 시작
		client.start();
	
	}

	public static void showMenu() {
		System.out.printf("                                      \n");
		System.out.printf("          ■■■■■■■■■■■■■■■■■■■■■■■■■■■■\n");
		System.out.printf("                                      \n");
		System.out.printf("            ♥고결의 나만 쓰는 클라이언트♥       \n");
//		System.out.printf("            [CLIENT version 1.0.1®]   \n");
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
