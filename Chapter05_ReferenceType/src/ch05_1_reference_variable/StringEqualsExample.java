package ch05_1_reference_variable;

public class StringEqualsExample {

	public static void main(String[] args) {
		
	String str1= "java";
	String str2= "java";
	
	String str3= new String("java");
	String str4= new String("java");
	
	System.out.println(System.identityHashCode(str1));
	System.out.println(System.identityHashCode(str2));
	//str1 �� str2 �� �����ּ�
	
	System.out.println(System.identityHashCode(str3));
	System.out.println(System.identityHashCode(str4));
	//str3�� str4 �� �ٸ��ּ�
	
	String strVar1 ="�迹��";
	String strVar2 ="�迹��";
	
	if(strVar1==strVar2) {
		System.out.println("strVar1 �� strVar2�� ������ ����");
	}else {
		System.out.println("strVar1 �� strVar2�� ������ �ٸ�");
	}
	
	
	if(strVar1.equals(strVar2)) {
		System.out.println("strVar1 �� strVar2�� ���ڿ��� ����");
	}else {
		System.out.println("strVar1 �� strVar2��  ���ڿ��� �ٸ�");
	}
	
	String strVar3= new String("�迹��");
	String strVar4= new String("�迹��");
	
	

	if(strVar3==strVar4) {
		System.out.println("strVar3 �� strVar4�� ������ ����");
	}else {
		System.out.println("strVar3 �� strVar4�� ������ �ٸ�");
	}


	if(strVar3.equals(strVar4)) {
		System.out.println("strVar3 �� strVar4�� ���ڿ��� ����");
	}else {
		System.out.println("strVar1 �� strVar2��  ���ڿ��� �ٸ�");
	}
	
	A a1 =new A();
	System.out.println(a1.a);
	System.out.println(a1.b);
	}
}

class A{
	int a=1;
	int b=2;
}