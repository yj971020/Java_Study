package ch02_4_Console_in_out;

import java.io.IOException;

public class SystemInOut {
	public static void main(String[] args) throws IOException {

		int keyCode;

		// keyCode = System.in.read();

		try {
			// keyCode = System.in.read();
			System.out.printf("keycode: %d\n", System.in.read());

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}

//abc 입력시결과 :97 -->a 하나만 읽은것 
//원래는 abc --> 97 98 99 13 10 (13 :캐리지리턴 / 10 : 엔터) : read를 5번 하게하면 됨