package ch04_1_if;

public class IfExample {

	public static void main(String[] args) {
		
		int score =95;
		char grade =0 ; //�ʱ�ȭ 
		
		 if (score > 90 ) {
			 grade = 'A';
		 }
		 else if (score > 80) {
			 grade='B';
		 }
		 
		 System.out.println("����� : "+ grade);
		 
		 grade = (score > 90) ? 'A':'B';
		 System.out.println("����� : "+ grade);
		 
		 grade = (score >90) ? 'A' : ( (score>80) ? 'B':'C'); //���׿����ڴ� if- else ������ �ٲܼ� �ִ�. 
		// ���׿����ڴ� grade �� �ʱ�ȭ �Ƚ����൵ ��� ����.( �������� ������ �ϳ��� �Ҵ�Ǳ� ����)
		// if - else �ϰ�쿡�� �ʱ�ȭ �ʼ� (grade=0;) : ��� false �� ��� �Ҵ�Ǵ� ���� ���� �� �ֱ� ������ �����߻� ���� (�������� ���ؼ��� else ���� �Է�)
		 System.out.println("����� : "+ grade);

	}
}
