package ch06_ex_bank;

public class BankAccountPop {
	static int balance=0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//���� �ܰ� �ʱ�ȭ
		int balance=0;
		
		//-> ���� �Ա��ϱ�
		deposit(10000);
		
		// -> ���� ��� �ϱ�
		withdraw(3000);
		
		//���� �ܰ� ���
		checkBalance();			
 
}

	private static void deposit(int i) {
		balance+=i;
	}
	private static void withdraw(int i) {
		balance-=i;
	}
	private static void checkBalance() {
		System.out.println("���� �ܰ�"+ balance);
	}
}
