package ch09_1_inner;

import ch09_1_inner.A.B;

public class Main {
	public static void main(String[] args) {
		A a = new A();

		// 인스턴스 멤버 클래스 객체 생성
		A.B b = a.new B(); // 먼저 만든  a객체 이용 : a.new 로 접근
		b.field1=3; 
		b.method1();

		// 정적 멤버 클래스 객체 생성(static)
		A.C c=new A.C(); 
		c.field1=3;
		c.method1();
		A.C.field2=3;
		A.C.method2();	

		// 로컬클래스 객체 생성을 위한 메소드 호출
		a.method();
	}
}
