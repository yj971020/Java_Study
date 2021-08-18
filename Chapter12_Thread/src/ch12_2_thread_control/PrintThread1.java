package ch12_2_thread_control;

public class PrintThread1 extends Thread{
	
	private boolean stop; //boolean의 초기값은 false
	public void Stop(boolean stop)
	{
		this.stop=stop;
	}
	@Override
	
	public void run() {
		while(!stop) { // true 일 동안..
			System.out.println("실행중");
		}
		System.out.println("자원정리");
		System.out.println("실행종료");
	}

}
