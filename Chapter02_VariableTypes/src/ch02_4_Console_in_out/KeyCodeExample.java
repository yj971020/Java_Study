package ch02_4_Console_in_out;

import java.io.IOException;

public class KeyCodeExample {

	public static void main(String[] args) throws IOException {
			
//		[Ű����κ��� �Էµ� ������ ������ �����ϰ� ����ϱ�]
		int keycode;
		keycode =System.in.read();
		System.out.println("keycode: "+keycode);
		
		keycode =System.in.read();
		System.out.println("keycode: "+keycode);
		
		keycode =System.in.read();
		System.out.println("keycode: "+keycode);
		
		
	}
	
}
