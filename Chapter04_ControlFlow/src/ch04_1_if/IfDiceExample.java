package ch04_1_if;

public class IfDiceExample {

	public static void main(String[] args) {

		// Math.random �� 0���� 1 ���� ������ ���� .

		System.out.println((int) (Math.random() * 10)); // 0~9 ������ ���� Math.random()*10;
		System.out.println((int) (Math.random() * 10));

		System.out.println((int) (Math.random() * 10 + 1)); // 1~10 ������ ���� Math.random()*10 +1
		System.out.println((int) (Math.random() * 10 + 1));

		// �ֻ��� (1~6)
		System.out.println((int) (Math.random() * 6 + 1)); // 1~6 ������ ����
		
		// �ֻ��� ���� ����ϴ� �ſ� ��ȿ������ if else ��
		int dice = (int)(Math.random()*6+1);
		
		if (dice==1) {
			System.out.println("�ֻ��� ���� 1");
		}
		else if (dice==2){
			System.out.println("�ֻ��� ���� 2");
		}
		else if (dice==3){
			System.out.println("�ֻ��� ���� 3");
		}
		else  if (dice==4){
			System.out.println("�ֻ��� ���� 4");
		}
		else if (dice==5){
			System.out.println("�ֻ��� ���� 5");
		}
		else {
			System.out.println("�ֻ��� ���� 6");
		}
	

	}

}
