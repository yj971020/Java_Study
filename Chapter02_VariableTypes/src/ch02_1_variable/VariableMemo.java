package ch02_1_variable;

public class VariableMemo {
	public static void main(String[] args) {

		int a =65;
		char b=65;
		char c='c'; //저장시에는 67로 저장  : 인코딩
		
		int d1 =3;
		double d2 = 3;

		
		VariableScopeExample vse =new VariableScopeExample(); //클래스도 하나의 자료형 
		
		//2진수 , 8진수 ,10진수 ,16진수
		int data;
		data=79;
		if(data==85) {
			System.out.println(true); //출력되지 않음 
		}
		
		System.out.println(a); //65
		System.out.println(b); //A
		System.out.println(c); //67--->'c' : 디코딩
		
		System.out.println((char)a); //A :65를 문자형으로 형변환
		
		System.out.println(d1); //3
		System.out.println(d2); //3.0
		
	}

}
