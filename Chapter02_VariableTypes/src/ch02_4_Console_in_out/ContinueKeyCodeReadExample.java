package ch02_4_Console_in_out;

import java.io.IOException;

public class ContinueKeyCodeReadExample {

	public static void main(String[] args) throws IOException { //�ܺο��� �Է¹޴°�� ����ó�� �ʿ�
		//���ϴ� ���� ���Ë����� �Է¹޴� �Լ�
		int keycode;
		boolean working=true;
		while(working) {
			keycode=System.in.read();
			System.out.println("keyCode: "+ keycode);
			
			if (keycode == 'q' || keycode == 'Q') { //q�Ǵ�Q �� ġ�� ���� (keycode==113)
			working =false;
			
			}
			
		}
		System.out.println("����");
	}

}
