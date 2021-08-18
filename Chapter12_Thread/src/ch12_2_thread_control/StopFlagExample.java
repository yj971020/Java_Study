package ch12_2_thread_control;

public class StopFlagExample {

	public static void main(String[] args) {
		
		PrintThread1 th1=new PrintThread1();
		th1.start();
		
		try {
			Thread.sleep(1*2000);
		}catch(Exception e) {}
		
		th1.Stop(true);
		

	}

}
