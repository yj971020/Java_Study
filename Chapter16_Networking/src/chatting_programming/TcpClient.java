package chatting_programming;

import java.util.Scanner;

import com.framework.TcpApplication;

public class TcpClient {

	public static void main(String[] args) {
		//깔끔한 화면을위해 프롬프트 최상단 정리
		for(int i=0; i<17; i++) {
			System.out.println(" ");
		}
		
		showMenu();
		Scanner sc = new Scanner(System.in);
		System.out.printf("                >");
		int select = sc.nextInt();
		
		switch(select) {
		case 1:
			System.out.printf("          1 → Start                   \n");
			System.out.printf("                                      \n");
			break;
			
		case 0:
			System.out.println("프로그램을 종료합니다.");
			System.exit(0); //프로그램 종료 시켜버림
		}
		
		/*
		 * TCP/IP 어플리케이션 생성
		 */
		TcpApplication app = new AppClient();
		
		//설정 초기화
		app.init();
		
		//어플리케이션 실행
		app.start();
		
		sc.close();
	}


	    public static void showMenu() {
	        System.out.printf("                                      \n");
	        System.out.printf("          ■■■■■■■■■■■■■■■■■■■■■■■■■■■■\n");
	        System.out.printf("                                      \n");
	        System.out.printf("            [CLIENT version 1.0.1®]   \n");
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


