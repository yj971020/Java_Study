package ch07_3_polymorphism_ex;

class MobilePhone {
	// 필드
	protected String number; // 전화번호

	// 생성자
	public MobilePhone(String num) {
		this.number = num;
	}

	// 메소드
	public void receive() {
		System.out.println("Hi~from :" + this.number);
	}
}

class SmartPhone extends MobilePhone {
	// 필드
	private String androidVer; // 외부에서 못가져가도록

	// 생성자
	public SmartPhone(String num, String ver) { // 부모 생성자의 매개변수를 받아와야함(String num)
		super(num); // 부모꺼를 위쪽에 써줘야함
		androidVer = ver;
	}

	// 메소드
	public void send(String number) {
		System.out.println("Hello~ to :" + number);
	}

	public void playApp() {
		System.out.println("App is running in " + androidVer);
	}

	@Override
	public void receive() {
		super.receive();
		System.out.println("I am Smart");
	}

}

public class MobileSmartPhone {
	public static void main(String[] args) {
		// 스마트폰 객체 생성
		SmartPhone phone1 = new SmartPhone("010-1234-5678", "Andriod 7.0");

		// 부모 클래스의 참조변수(phone2) 는 자식 클래스의 (SmartPhone) 의 인스턴스를 참조 가능 !!***
		// 자동 형변환 일어남 ->but 부모형의 메소드 밖에 접근 못함
		MobilePhone phone2 = new SmartPhone("010-2222-3333", "Ios 14.7.1");

		// 전화걸기
		phone1.send("010-1111-1111");
		// phone2.send("010-1111-1111");불가능
		
		// 전화받기
		phone1.receive();
		phone2.receive();
		
		//앱을 선택하여 실행하기
		phone1.playApp();
		//phone2.playApp(); 불가능

	}
}
