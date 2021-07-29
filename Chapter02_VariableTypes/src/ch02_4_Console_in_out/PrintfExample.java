package ch02_4_Console_in_out;

public class PrintfExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.printf("이름: %s","김자바");
		
		int value =123;
		System.out.printf("상품의 가격: %d원\n",value); //%d:정수
		System.out.printf("상품의 가격: %6d원\n",value); //6자리 정수, 왼쪽빈자리 공백
		System.out.printf("상품의 가격: %-6d원\n",value); //6자리 정수, 오른쪽빈자리 공백
		System.out.printf("상품의 가격: %06d원\n",value); //6자리 정수, 왼쪽 빈자리에 0
		
		double area = 3.14159*10*10;
		System.out.printf("반지름이 %d 인 원의 넓이: %10.2f\n",10,area ); // %10.2f :소수점 이상 7자리, 소수점 이하 2자리, 왼쪽 빈 자리 공백 (= 소수점 포함 10자리, 소숫점 (포함) 이하 2자리) 

		String name ="홍길동 ";
		String job = "도적";
		System.out.printf("%6d | %-10s | %10s \n",name,job);
		
		}

}
