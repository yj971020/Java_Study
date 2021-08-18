package ch12_1_multi_thread;

public class User1 extends Thread{
	private Calculator calculator;
	
	public void setCalculator(Calculator calculator) {
		this.setName("User1"); //스레드 이름을 user1 로 설정
		this.calculator=calculator;//공유 객체인 calculator 를 필드에 저장
	}
	public void run() {
		calculator.setMemory(100); // 공유 객체인 calculator 의 메모리에 100 저장
	}

}
