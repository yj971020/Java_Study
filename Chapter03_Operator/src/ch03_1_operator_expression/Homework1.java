package ch03_1_operator_expression;

import java.io.IOException;

public class Homework1 {

	public static void main(String[] args) throws IOException {
		
		int charCode= System.in.read();
	

		if ((charCode >= 65) & (charCode <= 90)) {
			System.out.println("대문자군요");
		}
		if ((charCode >= 97) & (charCode <= 122)) {
			System.out.println("소문자군요");
		}
		if ((charCode > 57) & (charCode < 48)) {
			System.out.println("0~9 숫자군요");
		}
		if((charCode%2==0)|(charCode%3==0)) {
			System.out.println("2 또는 3의 배수군용");
		}
		if((charCode%2==0)||(charCode%3==0)) {
			System.out.println("2 또는 3의 배수군용");
		}
	}

}
