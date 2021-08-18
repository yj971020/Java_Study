package ch12_1_multi_thread;

class withdrawer implements Runnable{
	Account account =new Account();
	@Override
	public void run() {
	//����ϱ�
		while(account.getBalance()>0) {
			//100,200,300 �� �� ���Ƿ� ��� 
			int money =(int)(Math.random()*3+1)*100;
			account.withdraw(money);
			System.out.println("�����ܰ�: "+account.getBalance());
		}
	}
}

public class AccountExample {
	public static void main(String[] args) {
		/*
		 * ����ϴ� ���� ����ȭ(��Ƽ ������ ����)
		 */
		Runnable withdrawer = new withdrawer();
		Thread jWorker=new Thread(withdrawer);
		Thread yWorker=new Thread(withdrawer);
		
		jWorker.start();
		yWorker.start();
	}

}
