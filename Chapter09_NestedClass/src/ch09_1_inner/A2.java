package ch09_1_inner;

public class A2 {
	int field1;
	void method1() {}
	
	static int field2;
	static void method2() {}
	
	class B2{
	void method() {
			field1 =10;
			method1();
			
			field2=10;
			method2();
		}
	}
static class C2{
	void method() {
		//field1=10;  C ��   static. field1 �� �������� �ٲ�� �ִ� ���̹Ƿ� ���Ұ�
		//method1();
		
		field2=10;
		method2();
	}
}
}
