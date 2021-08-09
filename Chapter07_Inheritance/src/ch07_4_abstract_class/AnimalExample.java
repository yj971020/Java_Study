package ch07_4_abstract_class;

abstract class Animal {
	public String kind;

	public void breathe() {
		System.out.println("숨을 쉽니다.");
	}

	// 추상 메소드 시그니처만 해놓은것( 구현이 안되어있는 상태)
	// 자식클래스에서도 오버라이딩 안할경우 오류 발생 -> 반드시 자식 클래스에서 구현해야함!!!!
	// 추상메소드: 상속받는 자식 클래스에서의 오버라이딩을 강제화
	public abstract void sound();
}

class Dog extends Animal {
	public Dog() {
		this.kind = "포유류";
	}

	public void sound() {
		System.out.println("멍멍");
	}
}

class Cat extends Animal {
	public Cat() {
		this.kind = "포유류";
	}

	public void sound() {
		System.out.println("야옹");
	}
}

public class AnimalExample {
	public static void main(String[] args) {
		Dog dog = new Dog();
		Cat cat = new Cat();
		dog.sound();
		cat.sound();
		System.out.println("----------------");

		// 변수의 자동 타입 변환
		Animal animal = null; // animal : 참조변수
		animal = new Dog();
		animal.sound();
		animal = new Cat();
		animal.sound();
		System.out.println("----------------");

		// 메소드의 다형성
		animalSound(new Dog());
		animalSound(new Cat());

	}

	public static void animalSound(Animal animal) {
		animal.sound();
	}

}
