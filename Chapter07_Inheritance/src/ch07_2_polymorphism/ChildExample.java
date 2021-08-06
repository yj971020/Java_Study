package ch07_2_polymorphism;

 class Parent {

	public void method1() {
		System.out.println("parent-method1()");
	}
	public void method2() {
		System.out.println("parent-method2()");
	}
}
 class Child extends Parent{
	 
	 @Override
	 public void method2() {
		 System.out.println("Child-method2()");
	 }
	 public void method3() {
		 System.out.println("Child-method3()");
	 }
 }

public class ChildExample {

	public static void main(String[] args) {
		
		Child child =new Child();
		
		Parent parent =child; // �ڵ� Ÿ�� ��ȯ
		parent.method1();
		parent.method2();
		//parent.method3(); ȣ�� �Ұ���
		
		

	}

}
