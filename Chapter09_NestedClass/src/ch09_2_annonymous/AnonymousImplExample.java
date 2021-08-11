package ch09_2_annonymous;

interface RemoteControl{
	void turnOn();
	void turnOff();
}

class AnonymousImpl{
	RemoteControl field = new RemoteControl() {
		
		@Override
		public void turnOn() {
			System.out.println("tv  켭니다");
			
		}
		
		@Override
		public void turnOff() {
			System.out.println("tv  끕니다");
		}
	};
	void method1() {	
		RemoteControl localVar=new RemoteControl() {

			@Override
			public void turnOn() {System.out.println("audio 켭니다");
			
			}

			@Override
			public void turnOff() {	System.out.println("audio 끕니다");
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
		
		// 익명 객체 필드 사용
		anony.field.turnOn();
		
		//익명 객체 로컬 변수 사용
		anony.method1();
		
		//익명 객체 매개값 사용
		anony.method2(new RemoteControl() {
			@Override
		public void turnOn() {
			System.out.println("tv  켭니다");
			
		}
		
		@Override
		public void turnOff() {
			System.out.println("tv  끕니다");
		}
	});
	}

}
