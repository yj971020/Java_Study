package ch06_3_constructor;

//�ϳ��� ���Ͽ� Ŭ������ ���ι� 
class Car {
	// �ٸ� �����ڸ� ȣ���ؼ� �ߺ� �ڵ� ���̱�

	String company = "�����ڵ���";
	String model;
	String color;
	int maxSpeed;
	
	// ������
	Car() {	
	}

	// ������ �����ε� :
	Car(String model) {
		this(model, "����", 250);
	}

	Car(String model, String color) {
		this(model, color, 250);
	}

	Car(String model, String color, int maxSpeed) {

		this.model = model; // ������� �ڵ�
		this.color = color; // ������� �ڵ�
		this.maxSpeed = maxSpeed; // ������� �ڵ�
	}
}

public class CarExample {
	public static void main(String[] args) {
		
		Car car1=new Car();
		System.out.println("car1.company: "+car1.company+"\n");
		
		
		Car car2=new Car("�ڰ���");
		System.out.println("car2.company: "+car2.company);
		System.out.println("car2.model: "+car2.model+"\n");
		
		Car car3=new Car("�ڰ���", "����");
		System.out.println("car3.company: "+car3.company);
		System.out.println("car3.model: "+car3.model);
		System.out.println("car3.color: "+car3.color+"\n");
		
		Car car4=new Car("�ý�", "����", 200);
		System.out.println("car4.company: "+car4.company);
		System.out.println("car4.model: "+car4.model);
		System.out.println("car4.color: "+car4.color);
		System.out.println("car4.maxSpeed:"+car4.maxSpeed+"\n");
	}
}