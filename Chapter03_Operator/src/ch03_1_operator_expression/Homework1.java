package ch03_1_operator_expression;

import java.io.IOException;

public class Homework1 {

	public static void main(String[] args) throws IOException {
		
		int charCode= System.in.read();
	

		if ((charCode >= 65) & (charCode <= 90)) {
			System.out.println("�빮�ڱ���");
		}
		if ((charCode >= 97) & (charCode <= 122)) {
			System.out.println("�ҹ��ڱ���");
		}
		if ((charCode > 57) & (charCode < 48)) {
			System.out.println("0~9 ���ڱ���");
		}
		if((charCode%2==0)|(charCode%3==0)) {
			System.out.println("2 �Ǵ� 3�� �������");
		}
		if((charCode%2==0)||(charCode%3==0)) {
			System.out.println("2 �Ǵ� 3�� �������");
		}
	}

}
