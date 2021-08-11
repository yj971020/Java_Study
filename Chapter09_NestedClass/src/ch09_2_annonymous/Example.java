package ch09_2_annonymous;

class Animal {
	void sound() {
		System.out.println("~");
	}
}

class cat extends Animal {
	void sound() {
		System.out.println("야옹");
	}

	void jump() {
		System.out.println("담을 넘는다.");
	}

}

class Fish extends Animal {
	void sound() {
		System.out.println("뻐끔");
	}

	void swim() {
		System.out.println("헤엄친다");
	}
}

public class Example {

	public static void main(String[] args) {

		Animal ani = new Animal() { // 한번 쓰고 버릴 코드 -> 그냥 이자리에 바로 구현
			void sound() {
				System.out.println("멍멍~~");
			}

			void run() {
				System.out.println("후다닥");
			}
		};

		ani.sound();

	}
}