package ch12_2_thread_control;

public class PrintThread1 extends Thread{
	
	private boolean stop; //boolean�� �ʱⰪ�� false
	public void Stop(boolean stop)
	{
		this.stop=stop;
	}
	@Override
	
	public void run() {
		while(!stop) { // true �� ����..
			System.out.println("������");
		}
		System.out.println("�ڿ�����");
		System.out.println("��������");
	}

}
