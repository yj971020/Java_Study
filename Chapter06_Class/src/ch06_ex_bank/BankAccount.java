package ch06_ex_bank;

public class BankAccount {
	
	//�ʵ�
	String name;
	String number;
	int balance;
	
	//������
	public BankAccount(String name) {
		this(name,"123-456",0);
	}
	
	public BankAccount(String name, String number) {
		this(name,number,0);
	}
	public BankAccount(String name, String number, int balance) {
		this.name=name;
		this.number=number;
		this.balance=balance;
	}
	//�޼ҵ�
	public void deposit(int i) {
		this.balance+=i;
		
	}
	public void withdraw(int i) {
		this.balance-=i;
	}
	public void checkBalance() {
		System.out.println("�����ܰ�: "+this.balance);
	}
	
}
