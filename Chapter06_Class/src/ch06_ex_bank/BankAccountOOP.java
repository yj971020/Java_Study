package ch06_ex_bank;

public class BankAccountOOP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BankAccount KimAccount = new BankAccount("kim");
		
		KimAccount.deposit(10000);
		KimAccount.withdraw(3000);
		KimAccount.checkBalance();
		
		BankAccount LeeAccount = new BankAccount("lee");
		
		
		
	}

}
