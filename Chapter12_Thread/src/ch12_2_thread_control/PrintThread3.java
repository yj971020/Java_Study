package ch12_2_thread_control;

public class PrintThread3 {
	public void run() {
		while(true) {
			System.out.println("실행중");
			if(Thread.interrupted()) {
				break;
			}
		}
		System.out.println("자원정리");
		System.out.println("실행종료");
	}

}
