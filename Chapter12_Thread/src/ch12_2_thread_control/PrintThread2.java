package ch12_2_thread_control;

public class PrintThread2 extends Thread {
	public void run() {
		try {
			while(true) {
				System.out.println("실행중");
				//스레드가 실행대기, 실행상태일 때에는 예외 발생 x
				Thread.sleep(1); // 1/1000초
			}
		}catch(InterruptedException e) {}
		
		System.out.println("자원정리");
		System.out.println("실행종료");
	}

}
