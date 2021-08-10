package ch08_2_polymorphism;

interface InterfaceA{
	void methodA();
}
interface InterfaceB{
	void methodB();
}

//인터페이스는 클래스와 달리 다중상속을 허용
interface InterfaceC extends InterfaceA, InterfaceB{
	void methodC();
}
class ImplementationC implements InterfaceC{

	@Override
	public void methodA() {
		System.out.println("implementationC-methodA() 실행");
	}

	@Override
	public void methodB() {
		System.out.println("implementationC-methodB() 실행");
	}

	@Override
	public void methodC() {
		System.out.println("implementationC-methodC() 실행");
	}
}

public class Example {

	public static void main(String[] args) {

		ImplementationC impl=new ImplementationC();
		InterfaceA ia=impl;
		ia.methodA();
		System.out.println();
		
		InterfaceB ib=impl;
		ib.methodB();
		System.out.println();
		
		InterfaceC ic=impl;
		ic.methodA();
		ic.methodB();
		ic.methodC();
	}

}
