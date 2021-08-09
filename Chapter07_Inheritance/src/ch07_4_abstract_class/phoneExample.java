package ch07_4_abstract_class;

abstract class Phone { // abstract 한 클래스는 아래에서 new 연산자로 사용 불가
	// 필드
	public String owner;

	// 생성자
	public Phone(String owner) {
		this.owner = owner;
	}

	// 메소드
	public void turnOn() {
		System.out.println("폰 전원을 켭니다.");
	}

	public void turnOff() {
		System.out.println("폰 전원을 끕니다.");
	}
}
//자식 클래스

class SmartPhone extends Phone {
	//생성자
	public SmartPhone(String owner) {
		super(owner);
	}
	//메소드
	public void internetSerach() {
		System.out.println("인터넷 검색을 합니다.");
	}
}

public class phoneExample {
	public static void main(String[] args) {
		//Phone phone = new Phone(); 불가능
		
		SmartPhone smartphone = new SmartPhone("홍길동");
		smartphone.turnOn();
		smartphone.internetSerach();
		smartphone.turnOff();
	}

}
