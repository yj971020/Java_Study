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

//abc �Է½ð�� :97 -->a �ϳ��� ������ 
//������ abc --> 97 98 99 13 10 (13 :ĳ�������� / 10 : ����) : read�� 5�� �ϰ��ϸ� ��