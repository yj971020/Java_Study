package object;

public class StringcharAtExample {

	public static void main(String[] args) {

		String ssn="010624-1230123";
		char sex=ssn.charAt(7); // 7번 인덱스 *인덱스 : 0부터 시작
		switch(sex) {
		case '1':
		case '3': System.out.println(" 남자입니다.");
		break;
		case '2':
		case '4':
			System.out.println("여자입니다.");
			break;
		}
	}

}
