package ch07_1_Inheritance;

public class CellPhone {

	// �ʵ�
	String model;
	String color;

	// ������

	// �޼ҵ�
	void poweron() {
		System.out.println("������ �մϴ�");
	}

	void powerOff() {
		System.out.println("���� ��");
	}

	void bell() {
		System.out.println("�� �︲");
	}

	void sendVoice(String message) {
		System.out.println("��: " + message);
	}

	void reciveVoice(String message) {
		System.out.println("����: " + message);
	}

	void hangup() {
		System.out.println("��ȭ �����ϴ�");
	}

}
