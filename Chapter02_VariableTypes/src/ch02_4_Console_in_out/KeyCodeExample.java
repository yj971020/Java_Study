package ch02_4_Console_in_out;

import java.io.IOException;

public class KeyCodeExample {

	public static void main(String[] args) throws IOException {
			
//		[키보드로부터 입력된 내용을 변수에 저장하고 출력하기]
		int keycode;
		keycode =System.in.read();
		System.out.println("keycode: "+keycode);
		
		keycode =System.in.read();
		System.out.println("keycode: "+keycode);
		
		keycode =System.in.read();
		System.out.println("keycode: "+keycode);
		
		
	}
	
}
