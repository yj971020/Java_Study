package ch06_ex_bank;

public class BankAccountPop {
	static int balance=0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//계좌 잔고 초기화
		int balance=0;
		
		//-> 계좌 입금하기
		deposit(10000);
		
		// -> 계좌 출금 하기
		withdraw(3000);
		
		//계좌 잔고 출력
		checkBalance();			
 
}

	private static void deposit(int i) {
		balance+=i;
	}
	private static void withdraw(int i) {
		balance-=i;
	}
	private static void checkBalance() {
		System.out.println("현재 잔고"+ balance);
	}
}
