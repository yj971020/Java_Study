package ch12_1_multi_thread;

public class ThreadNameExample {
	public static void main(String[] args) {
		// ���ڵ带 �����ϴ� ������ ��ü ���
		Thread mainThread = Thread.currentThread();
		System.out.println("���α׷� ���� ������ �̸�: " + mainThread.getName());

		ThreadA threadA = new ThreadA(); // ThreadA ����
		System.out.println("�۾� ������ �̸�: " + threadA.getName());
		threadA.start();

		ThreadB threadB = new ThreadB();
		System.out.println("�۾� ������ �̸�: " + threadB.getName());
		threadB.start();
	}

}
