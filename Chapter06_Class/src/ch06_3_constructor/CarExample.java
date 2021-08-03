package ch06_3_constructor;

//하나의 파일에 클래스와 메인문 
class Car {
	// 다른 생성자를 호출해서 중복 코드 줄이기

	String company = "현대자동차";
	String model;
	String color;
	int maxSpeed;
	
	// 생성자
	Car() {	
	}

	// 생성자 오버로딩 :
	Car(String model) {
		this(model, "은색", 250);
	}

	Car(String model, String color) {
		this(model, color, 250);
	}

	Car(String model, String color, int maxSpeed) {

		this.model = model; // 공통실행 코드
		this.color = color; // 공통실행 코드
		this.maxSpeed = maxSpeed; // 공통실행 코드
	}
}

public class CarExample {
	public static void main(String[] args) {
		
		Car car1=new Car();
		System.out.println("car1.company: "+car1.company+"\n");
		
		
		Car car2=new Car("자가용");
		System.out.println("car2.company: "+car2.company);
		System.out.println("car2.model: "+car2.model+"\n");
		
		Car car3=new Car("자가용", "빨강");
		System.out.println("car3.company: "+car3.company);
		System.out.println("car3.model: "+car3.model);
		System.out.println("car3.color: "+car3.color+"\n");
		
		Car car4=new Car("택시", "검정", 200);
		System.out.println("car4.company: "+car4.company);
		System.out.println("car4.model: "+car4.model);
		System.out.println("car4.color: "+car4.color);
		System.out.println("car4.maxSpeed:"+car4.maxSpeed+"\n");
	}
}