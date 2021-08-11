package ch09_2_annonymous;

class Animal {
	void sound() {
		System.out.println("~");
	}
}

class cat extends Animal {
	void sound() {
		System.out.println("�߿�");
	}

	void jump() {
		System.out.println("���� �Ѵ´�.");
	}

}

class Fish extends Animal {
	void sound() {
		System.out.println("����");
	}

	void swim() {
		System.out.println("���ģ��");
	}
}

public class Example {

	public static void main(String[] args) {

		Animal ani = new Animal() { // �ѹ� ���� ���� �ڵ� -> �׳� ���ڸ��� �ٷ� ����
			void sound() {
				System.out.println("�۸�~~");
			}

			void run() {
				System.out.println("�Ĵٴ�");
			}
		};

		ani.sound();

	}
}