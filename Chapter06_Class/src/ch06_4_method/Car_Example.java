package ch06_4_method;

class Car1{
	//�ʵ�
	int speed;
	//������
	//�޼ҵ�
	
	public int getSpeed() {
		return speed;
	}
	
	void keyTurnOn() {
		System.out.println("Ű�� �����ϴ�.");
	}
	
	void run() {
		for(int i=10; i<=50;i+=10) {
			speed=i;
			System.out.println("�޸��ϴ� ( �ü� : "+speed+"km/h)");
		}
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	
	
}


public class Car_Example {
public static void main(String[] args) {
	
	Car1 myCar=new Car1();
	myCar.keyTurnOn();
	myCar.run();
	int speed=myCar.getSpeed();
	System.out.println("����ӵ�: "+speed+"km/h");
}
}
