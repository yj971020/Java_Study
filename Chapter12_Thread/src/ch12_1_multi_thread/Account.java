package ch12_1_multi_thread;

public class Account {

	// ÀÜ°í
	private int balance = 10_000;

	public int getBalance() {
		return balance;
	}

	public void withdraw(int money) {
		if (balance >= money) {
			try {
				Thread.sleep(1 * 1000);
			} catch (Exception e) {
			}
			balance -= money;
		}
	}
}
