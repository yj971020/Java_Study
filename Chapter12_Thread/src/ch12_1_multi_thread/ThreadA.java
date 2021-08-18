package ch12_1_multi_thread;

public class ThreadA extends Thread {
	public ThreadA() {
//스레드 이름 설정
		setName("ThreadA");

	}

	public void run() {
		for (int i = 0; i < 2; i++) {
			System.out.println(getName() + " 가 출력한 내용");
		}
	}
}
