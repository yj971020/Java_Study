package ch02_1_variable;

public class VariableMemo {
	public static void main(String[] args) {

		int a =65;
		char b=65;
		char c='c'; //����ÿ��� 67�� ����  : ���ڵ�
		
		int d1 =3;
		double d2 = 3;

		
		VariableScopeExample vse =new VariableScopeExample(); //Ŭ������ �ϳ��� �ڷ��� 
		
		//2���� , 8���� ,10���� ,16����
		int data;
		data=79;
		if(data==85) {
			System.out.println(true); //��µ��� ���� 
		}
		
		System.out.println(a); //65
		System.out.println(b); //A
		System.out.println(c); //67--->'c' : ���ڵ�
		
		System.out.println((char)a); //A :65�� ���������� ����ȯ
		
		System.out.println(d1); //3
		System.out.println(d2); //3.0
		
	}

}
