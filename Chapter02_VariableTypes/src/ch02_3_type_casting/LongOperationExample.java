package ch02_3_type_casting;

public class LongOperationExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte val1=10;
		int val2=100;
		long val3=1000L;
		long result = val1+val2+val3; //���� ū type���� ������
		
		//���꿡���� �ڵ�����ȯ
		//byte +int +long 
		//int+long (byte+int ->int)
		//long+long
		
		
		System.out.println(result);
	}

}
