package ch04_1_if;

public class IfElseIfElseExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int score = 75;
			
		if(score>=90) {
			System.out.println("������ 100~90 �Դϴ� . \n ����� A �Դϴ�");
		}
		else if (score >= 80){
			System.out.println("������ 80~89 �Դϴ� . \n ����� B �Դϴ�");
		}
		else if (score >= 70) {
			System.out.println("������ 70~79 �Դϴ� . \n ����� C �Դϴ�");
		}
		else {
			System.out.println("������ 70�̸� �Դϴ� . \n ����� D �Դϴ�");
		}
			

	}

}
