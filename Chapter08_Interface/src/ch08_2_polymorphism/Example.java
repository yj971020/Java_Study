package ch08_2_polymorphism;

interface InterfaceA{
	void methodA();
}
interface InterfaceB{
	void methodB();
}

//�������̽��� Ŭ������ �޸� ���߻���� ���
interface InterfaceC extends InterfaceA, InterfaceB{
	void methodC();
}
class ImplementationC implements InterfaceC{

	@Override
	public void methodA() {
		System.out.println("implementationC-methodA() ����");
	}

	@Override
	public void methodB() {
		System.out.println("implementationC-methodB() ����");
	}

	@Override
	public void methodC() {
		System.out.println("implementationC-methodC() ����");
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
