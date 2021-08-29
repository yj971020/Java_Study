package ch08_1_interface;

class Myclass{
	//필드
	RemoteControl rc=new Television();
	
	//생성자
	public Myclass() {
	}
	
	Myclass(RemoteControl rc){
		this.rc=rc;
		rc.turnOn();
		rc.setVolume(5);
	}
	//메소드
	void methodA() {
		RemoteControl rc = new Audio();
		rc.turnOn();
		rc.setVolume(5);
	}
	void methodB(RemoteControl rc) {
		rc.turnOn();
		rc.setVolume(5);
	}
}

public class MyClassExample {
	public static void main(String[] args) {
		System.out.println("1) ------------------------");
		
		Myclass myclass1= new Myclass();
		myclass1.rc.turnOn();
		myclass1.rc.setVolume(5);
		
		System.out.println("2) ------------------------");
		
		Myclass myclass2=new Myclass(new Audio());
		System.out.println("3) ------------------------");
		
		Myclass myclass3=new Myclass();
		myclass3.methodA();
		
		System.out.println("4) ------------------------");
	}

}
