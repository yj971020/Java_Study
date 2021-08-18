package ch12_1_multi_thread;


public class MainThreadExample {
	public static void main(String[] args) {
		/*
		 * [멀티 스레딩의 단점]
		 * 여러스레드가 같은 프로세스 내에서 자원 공유하면 생기는 문제
		 * -동기화
		 * -교착상태(deadlock)
		 */
		Calculator calculator=new Calculator();
		
		User1 user1=new User1();
		user1.setCalculator(calculator);
		user1.start();
		
		User2 user2=new User2();
		user2.setCalculator(calculator);
		user2.start();
	}

}
