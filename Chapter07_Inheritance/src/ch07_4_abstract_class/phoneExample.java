package ch07_4_abstract_class;

abstract class Phone { // abstract �� Ŭ������ �Ʒ����� new �����ڷ� ��� �Ұ�
	// �ʵ�
	public String owner;

	// ������
	public Phone(String owner) {
		this.owner = owner;
	}

	// �޼ҵ�
	public void turnOn() {
		System.out.println("�� ������ �մϴ�.");
	}

	public void turnOff() {
		System.out.println("�� ������ ���ϴ�.");
	}
}
//�ڽ� Ŭ����

class SmartPhone extends Phone {
	//������
	public SmartPhone(String owner) {
		super(owner);
	}
	//�޼ҵ�
	public void internetSerach() {
		System.out.println("���ͳ� �˻��� �մϴ�.");
	}
}

public class phoneExample {
	public static void main(String[] args) {
		//Phone phone = new Phone(); �Ұ���
		
		SmartPhone smartphone = new SmartPhone("ȫ�浿");
		smartphone.turnOn();
		smartphone.internetSerach();
		smartphone.turnOff();
	}

}
