package ch06_4_method;

class Car1{
	//필드
	int speed;
	//생성자
	//메소드
	
	public int getSpeed() {
		return speed;
	}
	
	void keyTurnOn() {
		System.out.println("키를 돌립니다.");
	}
	
	void run() {
		for(int i=10; i<=50;i+=10) {
			speed=i;
			System.out.println("달립니다 ( 시속 : "+speed+"km/h)");
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
	System.out.println("현재속도: "+speed+"km/h");
}
}
