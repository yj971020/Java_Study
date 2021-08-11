package ch09_2_annonymous;

interface RemoteControl{
	void turnOn();
	void turnOff();
}

class AnonymousImpl{
	RemoteControl field = new RemoteControl() {
		
		@Override
		public void turnOn() {
			System.out.println("tv  �մϴ�");
			
		}
		
		@Override
		public void turnOff() {
			System.out.println("tv  ���ϴ�");
		}
	};
	void method1() {	
		RemoteControl localVar=new RemoteControl() {

			@Override
			public void turnOn() {System.out.println("audio �մϴ�");
			
			}

			@Override
			public void turnOff() {	System.out.println("audio ���ϴ�");
			}
			
		};
	}
	void method2(RemoteControl rc) {
		rc.turnOn();
	}
}
public class AnonymousImplExample {
	public static void main(String[] args) {
		AnonymousImpl anony=new AnonymousImpl();
		
		// �͸� ��ü �ʵ� ���
		anony.field.turnOn();
		
		//�͸� ��ü ���� ���� ���
		anony.method1();
		
		//�͸� ��ü �Ű��� ���
		anony.method2(new RemoteControl() {
			@Override
		public void turnOn() {
			System.out.println("tv  �մϴ�");
			
		}
		
		@Override
		public void turnOff() {
			System.out.println("tv  ���ϴ�");
		}
	});
	}

}
