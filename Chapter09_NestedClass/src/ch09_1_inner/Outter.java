package ch09_1_inner;

public class Outter {

	String field = " Outter-field";
	void method() {
		System.out.println("outter-method");
	}
	class Nested{
		String field="Nested field";
		void method() {
			System.out.println("nested medtod");}
		
	
	void print() {
		// ��ø ��ü ����
		System.out.println(this.field);
		this.method();
		//�ٱ� ��ü ����
		System.out.println(Outter.this.field);
		Outter.this.method();
		}
	}
}
