package ch04_2_swtich;

public class SwitchExample {

	public static void main(String[] args) {
		
		int dice = (int) (Math.random() * 6 + 1);

		switch(dice) { 	//dice ���� ����ϴ� switch ��. case ����  break;
		case 1:
			System.out.println("�ֻ��� ���� 1");
			break;
		case 2:
			System.out.println("�ֻ��� ���� 2");
			break;
		case 3:
			System.out.println("�ֻ��� ���� 3");
			break;
		case 4:
			System.out.println("�ֻ��� ���� 4");
			break;
		case 5:
			System.out.println("�ֻ��� ���� 5");
			break;
		default:
			System.out.println("�ֻ��� ���� 6");
			break;
		}
		
//		//������ ���� ����� �˷��ִ� ���α׷�
//		int score=85;
//		char grade=0;
		
//		switch (score) {
//		case 100:				//break �� �����Ƿ� �����ٷ� ������
//		case 99 :
//		case 98 :
//			... //�̷������� 90����
//			grade = 'a'
//			break;
//		case 89:
//		
//		}
		
		
		//������ ����ϴ� ���α׷� (switch �� �̿� )
		
		int month = 3;
		
		switch(month) {
		case 12:
		case 1:
		case 2:
			System.out.println("�ܿ��Դϴ�");
			break;
		case 3:
		case 4:
		case 5:
			System.out.println("���Դϴ�");
			break;
		case 6:
		case 7:
		case 8:
			System.out.println("�����Դϴ�");
			break;
		case 9:
		case 10:
		case 11:
			System.out.println("�����Դϴ�");
			break;
		}

	}

}
