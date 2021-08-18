package ch12_1_multi_thread;

class withdrawer implements Runnable{
	Account account =new Account();
	@Override
	public void run() {
	//출금하기
		while(account.getBalance()>0) {
			//100,200,300 원 중 임의로 출금 
			int money =(int)(Math.random()*3+1)*100;
			account.withdraw(money);
			System.out.println("현재잔고: "+account.getBalance());
		}
	}
}

public class AccountExample {
	public static void main(String[] args) {
		/*
		 * 출금하는 일을 병렬화(멀티 스레딩 구성)
		 */
		Runnable withdrawer = new withdrawer();
		Thread jWorker=new Thread(withdrawer);
		Thread yWorker=new Thread(withdrawer);
		
		jWorker.start();
		yWorker.start();
	}

}
