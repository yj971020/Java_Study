package ch04_2_swtich;

public class SwitchExample {

	public static void main(String[] args) {
		
		int dice = (int) (Math.random() * 6 + 1);

		switch(dice) { 	//dice 값을 출력하는 switch 문. case 마다  break;
		case 1:
			System.out.println("주사위 값은 1");
			break;
		case 2:
			System.out.println("주사위 값은 2");
			break;
		case 3:
			System.out.println("주사위 값은 3");
			break;
		case 4:
			System.out.println("주사위 값은 4");
			break;
		case 5:
			System.out.println("주사위 값은 5");
			break;
		default:
			System.out.println("주사위 값은 6");
			break;
		}
		
//		//점수에 따른 등급을 알려주는 프로그램
//		int score=85;
//		char grade=0;
		
//		switch (score) {
//		case 100:				//break 가 없으므로 다음줄로 내려감
//		case 99 :
//		case 98 :
//			... //이런식으로 90까지
//			grade = 'a'
//			break;
//		case 89:
//		
//		}
		
		
		//계절을 출력하는 프로그램 (switch 문 이용 )
		
		int month = 3;
		
		switch(month) {
		case 12:
		case 1:
		case 2:
			System.out.println("겨울입니다");
			break;
		case 3:
		case 4:
		case 5:
			System.out.println("봄입니다");
			break;
		case 6:
		case 7:
		case 8:
			System.out.println("여름입니다");
			break;
		case 9:
		case 10:
		case 11:
			System.out.println("가을입니다");
			break;
		}

	}

}
