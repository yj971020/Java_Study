package ch05_1_reference_variable;

public class StringEqualsExample {

	public static void main(String[] args) {
		
	String str1= "java";
	String str2= "java";
	
	String str3= new String("java");
	String str4= new String("java");
	
	System.out.println(System.identityHashCode(str1));
	System.out.println(System.identityHashCode(str2));
	//str1 과 str2 는 같은주소
	
	System.out.println(System.identityHashCode(str3));
	System.out.println(System.identityHashCode(str4));
	//str3과 str4 는 다른주소
	
	String strVar1 ="김예진";
	String strVar2 ="김예진";
	
	if(strVar1==strVar2) {
		System.out.println("strVar1 과 strVar2는 참조가 같음");
	}else {
		System.out.println("strVar1 과 strVar2는 참조가 다름");
	}
	
	
	if(strVar1.equals(strVar2)) {
		System.out.println("strVar1 과 strVar2는 문자열이 같음");
	}else {
		System.out.println("strVar1 과 strVar2는  문자열이 다름");
	}
	
	String strVar3= new String("김예진");
	String strVar4= new String("김예진");
	
	

	if(strVar3==strVar4) {
		System.out.println("strVar3 과 strVar4는 참조가 같음");
	}else {
		System.out.println("strVar3 과 strVar4는 참조가 다름");
	}


	if(strVar3.equals(strVar4)) {
		System.out.println("strVar3 과 strVar4는 문자열이 같음");
	}else {
		System.out.println("strVar1 과 strVar2는  문자열이 다름");
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