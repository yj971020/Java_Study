package ch12_2_thread_control;

public class PrintThread2 extends Thread {
	public void run() {
		try {
			while(true) {
				System.out.println("������");
				//�����尡 ������, ��������� ������ ���� �߻� x
				Thread.sleep(1); // 1/1000��
			}
		}catch(InterruptedException e) {}
		
		System.out.println("�ڿ�����");
		System.out.println("��������");
	}

}
