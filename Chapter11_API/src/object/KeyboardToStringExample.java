package object;

import java.io.IOException;

public class KeyboardToStringExample {

	public static void main(String[] args) throws IOException {
		// ���� ����Ʈ�� �����ϱ� ���� �迭 ����
		byte[] bytes = new byte[100];

		System.out.print(" �Է� : ");
		int readByteNo;
		try {
			readByteNo = System.in.read(bytes); // �迭�� ���� ����Ʈ�� �����ϰ� ���� ����Ʈ ���� ����

			// �迭�� ���ڿ��� ��ȯ
			String str = new String(bytes, 0, readByteNo - 2);
			System.out.println(str);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
