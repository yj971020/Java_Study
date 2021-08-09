package ch07_4_abstract_class;

abstract class Animal {
	public String kind;

	public void breathe() {
		System.out.println("���� ���ϴ�.");
	}

	// �߻� �޼ҵ� �ñ״�ó�� �س�����( ������ �ȵǾ��ִ� ����)
	// �ڽ�Ŭ���������� �������̵� ���Ұ�� ���� �߻� -> �ݵ�� �ڽ� Ŭ�������� �����ؾ���!!!!
	// �߻�޼ҵ�: ��ӹ޴� �ڽ� Ŭ���������� �������̵��� ����ȭ
	public abstract void sound();
}

class Dog extends Animal {
	public Dog() {
		this.kind = "������";
	}

	public void sound() {
		System.out.println("�۸�");
	}
}

class Cat extends Animal {
	public Cat() {
		this.kind = "������";
	}

	public void sound() {
		System.out.println("�߿�");
	}
}

public class AnimalExample {
	public static void main(String[] args) {
		Dog dog = new Dog();
		Cat cat = new Cat();
		dog.sound();
		cat.sound();
		System.out.println("----------------");

		// ������ �ڵ� Ÿ�� ��ȯ
		Animal animal = null; // animal : ��������
		animal = new Dog();
		animal.sound();
		animal = new Cat();
		animal.sound();
		System.out.println("----------------");

		// �޼ҵ��� ������
		animalSound(new Dog());
		animalSound(new Cat());

	}

	public static void animalSound(Animal animal) {
		animal.sound();
	}

}
