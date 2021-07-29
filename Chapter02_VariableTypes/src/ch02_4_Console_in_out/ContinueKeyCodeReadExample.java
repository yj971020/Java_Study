package ch02_4_Console_in_out;

import java.io.IOException;

public class ContinueKeyCodeReadExample {

	public static void main(String[] args) throws IOException { //외부에서 입력받는경우 예외처리 필요
		//원하는 값이 나올떄까지 입력받는 함수
		int keycode;
		boolean working=true;
		while(working) {
			keycode=System.in.read();
			System.out.println("keyCode: "+ keycode);
			
			if (keycode == 'q' || keycode == 'Q') { //q또는Q 를 치면 멈춤 (keycode==113)
			working =false;
			
			}
			
		}
		System.out.println("종료");
	}

}
