package ch02_4_Console_in_out;

public class PrintfExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.printf("�̸�: %s","���ڹ�");
		
		int value =123;
		System.out.printf("��ǰ�� ����: %d��\n",value); //%d:����
		System.out.printf("��ǰ�� ����: %6d��\n",value); //6�ڸ� ����, ���ʺ��ڸ� ����
		System.out.printf("��ǰ�� ����: %-6d��\n",value); //6�ڸ� ����, �����ʺ��ڸ� ����
		System.out.printf("��ǰ�� ����: %06d��\n",value); //6�ڸ� ����, ���� ���ڸ��� 0
		
		double area = 3.14159*10*10;
		System.out.printf("�������� %d �� ���� ����: %10.2f\n",10,area ); // %10.2f :�Ҽ��� �̻� 7�ڸ�, �Ҽ��� ���� 2�ڸ�, ���� �� �ڸ� ���� (= �Ҽ��� ���� 10�ڸ�, �Ҽ��� (����) ���� 2�ڸ�) 

		String name ="ȫ�浿 ";
		String job = "����";
		System.out.printf("%6d | %-10s | %10s \n",name,job);
		
		}

}
