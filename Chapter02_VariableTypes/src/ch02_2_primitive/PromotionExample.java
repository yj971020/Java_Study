package ch02_2_primitive;

public class PromotionExample {

	public static void main(String[] args) {

//		// Ÿ��(�ڷ���) ��ȯ
//		// 1.�ڵ�(������) :�����Ϸ�...
//		// 2.����(�����) :
//		
//		//(�� �������� ūŸ�� = ����Ÿ�� ) ���ս��� �߻����� �ʴ� ����
//		//byte(1) < short(2)=char(2) < int(4) < long(8) < float(4) < double(8) ���� :byte
//		//���ս��� byte�� ������ �ʴ´�
//		
//		
//		byte bv = 10;  //���� byte bv=1000; �̸� �ȵ� (byte:-128~127)
//		int iv = bv;  //int �� �ڵ�����ȯ
//		
//		int iv1 =999999999;
//		long lv =999999999_999999999L;
//		float fv =9999999999999999999_9999999999999999999.0f;
//		
//		//" �� �ս�" �߻�����
//		System.out.println((int)5.7);  //5 ���
		
		byte byteValue=10;
		int intValue=byteValue;
		System.out.println("intValue: "+ intValue);
		
		char charvalue ='��';
		intValue =charvalue;
		System.out.println("�� �� �����ڵ�: "+ intValue);
		
		intValue=50;
		long longValue=intValue;
		System.out.println("longValue: "+ longValue);
		
		longValue=100;
		float floatValue=longValue;
		System.out.println("floatvalue: "+floatValue);
		
		floatValue=100.5f;
		double doubleValue=floatValue;
		System.out.println("doublevalue: "+doubleValue);
		
		
	}

}
