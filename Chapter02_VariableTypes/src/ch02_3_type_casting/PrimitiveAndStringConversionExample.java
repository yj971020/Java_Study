package ch02_3_type_casting;

public class PrimitiveAndStringConversionExample {

	public static void main(String[] args) {
		
/*			[�ǹ����� ���� ���̴� ����Ÿ�Ժ�ȯ]
 * 			���ڿ�	--->	����
 * 					<---
 * 
 * 	ex) string str =100;
 * 		int var =100;
 * 		str= str+1;  //str�� 1001 �� ��µ�
 * 	
 * 		var =Integer.parseInt(str); //���ڿ��� int �� ����ȯ	//���� �빮�� -> Ŭ���� �̴�.
 */
		String number="1234";
		System.out.println(number+5);
		
		int value=Integer.parseInt(number)+1;
		System.out.println(value);
		
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Integer.SIZE);
		
		System.out.println(Byte.MAX_VALUE+"\n");
	
	//--------------------------------------------------------	
	// ���ڿ� -> ����	
		
		int value1=Integer.parseInt("10");
		double value2=Double.parseDouble("3.14");
		boolean value3 = Boolean.parseBoolean("true"); 
		
		System.out.println("value1: "+ value1);
		System.out.println("value2: "+ value2);
		System.out.println("value3: "+ value3);
	//���� -> ���ڿ�	
		String str1=String.valueOf(10);
		String str2=String.valueOf(3.14);
		String str3=String.valueOf(true);
		
		System.out.println("str1: "+ str1);
		System.out.println("str2: "+ str2);
		System.out.println("str3: "+ str3);
		
		
	
	
	}
}
