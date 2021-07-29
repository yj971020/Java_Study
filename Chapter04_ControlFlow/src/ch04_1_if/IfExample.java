package ch04_1_if;

public class IfExample {

	public static void main(String[] args) {
		
		int score =95;
		char grade =0 ; //초기화 
		
		 if (score > 90 ) {
			 grade = 'A';
		 }
		 else if (score > 80) {
			 grade='B';
		 }
		 
		 System.out.println("등급은 : "+ grade);
		 
		 grade = (score > 90) ? 'A':'B';
		 System.out.println("등급은 : "+ grade);
		 
		 grade = (score >90) ? 'A' : ( (score>80) ? 'B':'C'); //삼항연산자는 if- else 문으로 바꿀수 있다. 
		// 삼항연산자는 grade 를 초기화 안시켜줘도 사용 가능.( 선택지중 무조건 하나라도 할당되기 때문)
		// if - else 일경우에는 초기화 필수 (grade=0;) : 모두 false 일 경우 할당되는 값이 없을 수 있기 때문에 에러발생 가능 (오류방지 위해서는 else 까지 입력)
		 System.out.println("등급은 : "+ grade);

	}
}
