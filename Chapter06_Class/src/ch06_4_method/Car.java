package ch06_4_method;

public class Car {
	//필드
	int gas;
	
	//생성자
	
	//메소드
	//연료 충전 메소드
	void setGas(int gas) { //리턴값이 없는 메소드, 매개값을 받아 gas필드값 변경
		this.gas=gas;
	} 
	//연료 잔량 상태
	boolean isLeftGas() {
		if(gas==0) {
			System.out.println("gas 없음");
			return false;
		}
		System.out.println("gas 있음");
		return true;
	}
	//주행
	void run() throws InterruptedException {
		while(true) {
			if(gas>0) {
				System.out.println("달립니다.(gas잔량 : "+gas+")"); 
				gas -=1;
				Thread.sleep(500); // 조금 느리게 실행
			}
			else {
				System.out.println("멈춥니다.(gas잔량 : "+gas+")");
				return;
			}
		}
	}
}
