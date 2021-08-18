package ch12_2_thread_control;

public class InterruptExample {

	public static void main(String[] args) {
		
		Thread thread=new PrintThread2();
		thread.start();
		
		try {Thread.sleep(1000);}catch(InterruptedException e) {}
		thread.interrupt();//종료 시키기기 위해 InterruptedException 발생시킴

	}

}
