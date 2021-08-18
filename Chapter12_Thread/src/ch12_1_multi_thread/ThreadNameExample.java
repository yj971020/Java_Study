package ch12_1_multi_thread;

public class ThreadNameExample {
	public static void main(String[] args) {
		// 이코드를 실행하는 스레드 객체 얻기
		Thread mainThread = Thread.currentThread();
		System.out.println("프로그램 시작 스레드 이름: " + mainThread.getName());

		ThreadA threadA = new ThreadA(); // ThreadA 생성
		System.out.println("작업 스레드 이름: " + threadA.getName());
		threadA.start();

		ThreadB threadB = new ThreadB();
		System.out.println("작업 스레드 이름: " + threadB.getName());
		threadB.start();
	}

}
