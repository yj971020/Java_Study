package ch04_3_for;

public class ContinueExample {

	public static void main(String[] args) {
		
		//continue 이용
		//홀수를 건너뛰고 짝수만 출력 하는 프로그램 
		
		for(int i=0;i<=10; i++) {
			if(i%2!=0) {
				continue;	//i 가 홀수라면 for 문의 조건문으로 돌아간다
			}
			System.out.println(i);	//홀수일때 출력되지 않음
		}
	}
}
