package ch04;

import java.util.Scanner;

public class ch04_07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		boolean run = true;
		int balance = 0;
		Scanner scanner = new Scanner(System.in);

		while (run) {
			System.out.println("--------------------------");
			System.out.println("1.���� |2.��� |3.�ܰ�|4.����.");

			System.out.println("--------------------------");
			System.out.print("����>");

			String input = scanner.nextLine();

			switch (input) {
			case "1":
				System.out.println("���ݾ�> 10000");
				break;
			case "2":
				System.out.println("��ݾ�> 2000");
				break;
			case "3":
				System.out.println("�ܰ�> 8000");
				break;
			case "4":
				run = false;
				System.out.println("����");
				break;
			}
		}
	}

}
