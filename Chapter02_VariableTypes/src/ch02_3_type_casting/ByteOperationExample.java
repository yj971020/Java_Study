package ch02_3_type_casting;

public class ByteOperationExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// [���� ���꿡���� �ڵ� Ÿ�Ժ�ȯ]
		byte x = 10, y = 20; 
	   //  byte result=x+y; // �����Ͽ���: ����� int�� �ڵ���ȯ�� --> �� ���� byte�� ��ȯ�Ұ�
		byte result=(byte)(x+y);//��������ȯ
		System.out.println(result);
		
		byte x1=100,y1=29;
		byte result1=(byte)(x1+y1);
		System.out.println(result1); //���: -127
		
		
	}

}
