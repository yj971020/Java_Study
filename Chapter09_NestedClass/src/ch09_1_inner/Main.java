package ch09_1_inner;

import ch09_1_inner.A.B;

public class Main {
	public static void main(String[] args) {
		A a = new A();

		// �ν��Ͻ� ��� Ŭ���� ��ü ����
		A.B b = a.new B(); // ���� ����  a��ü �̿� : a.new �� ����
		b.field1=3; 
		b.method1();

		// ���� ��� Ŭ���� ��ü ����(static)
		A.C c=new A.C(); 
		c.field1=3;
		c.method1();
		A.C.field2=3;
		A.C.method2();	

		// ����Ŭ���� ��ü ������ ���� �޼ҵ� ȣ��
		a.method();
	}
}
