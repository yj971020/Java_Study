package ch04_3_for;

public class ContinueExample {

	public static void main(String[] args) {
		
		//continue �̿�
		//Ȧ���� �ǳʶٰ� ¦���� ��� �ϴ� ���α׷� 
		
		for(int i=0;i<=10; i++) {
			if(i%2!=0) {
				continue;	//i �� Ȧ����� for ���� ���ǹ����� ���ư���
			}
			System.out.println(i);	//Ȧ���϶� ��µ��� ����
		}
	}
}
