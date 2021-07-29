package ch02_1_variable;

public class VariableScopeExample {

	public static void main(String[] args) {
		
		int v1=15;
		if(v1>10) {
			
			//System.out.println(v1>10); 결과:true
			int v2; //if문 안에서만 사용가능한 변수
			v2=v1-10;
			
		}
		//int v3=v1+v2+5; //v2 변수를 사용할 수 없어 컴파일 에러
		
	}

}
