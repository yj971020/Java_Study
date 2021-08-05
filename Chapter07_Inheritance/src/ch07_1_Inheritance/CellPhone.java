package ch07_1_Inheritance;

public class CellPhone {

	// 필드
	String model;
	String color;

	// 생성자

	// 메소드
	void poweron() {
		System.out.println("전원을 켭니다");
	}

	void powerOff() {
		System.out.println("전원 끔");
	}

	void bell() {
		System.out.println("벨 울림");
	}

	void sendVoice(String message) {
		System.out.println("나: " + message);
	}

	void reciveVoice(String message) {
		System.out.println("상대방: " + message);
	}

	void hangup() {
		System.out.println("전화 끊습니다");
	}

}
