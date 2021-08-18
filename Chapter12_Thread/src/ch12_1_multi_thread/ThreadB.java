package ch12_1_multi_thread;

public class ThreadB extends Thread {
	@Override
	public void run() {
		for (int i = 0; i < 2; i++) {
			System.out.println(getName() + "가 출력한 내용");
		}
	}

}
