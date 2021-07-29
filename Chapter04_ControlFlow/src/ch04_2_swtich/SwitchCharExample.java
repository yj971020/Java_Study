package ch04_2_swtich;

public class SwitchCharExample {

	public static void main(String[] args) {

		//회원등급을 알려주는 프로그램
		char grade = 'B';

		switch (grade) {
		case 'A':
		case 'a':
			System.out.println("우수 회원입니다.");
			break;
		case 'B':
		case 'b':
			System.out.println("일반 회원입니다.");
			break;
		default:
			System.out.println("손님입니다.");
		}

	}

}
