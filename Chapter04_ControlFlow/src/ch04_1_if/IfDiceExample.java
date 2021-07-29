package ch04_1_if;

public class IfDiceExample {

	public static void main(String[] args) {

		// Math.random 은 0에서 1 사이 무작위 변수 .

		System.out.println((int) (Math.random() * 10)); // 0~9 무작위 변수 Math.random()*10;
		System.out.println((int) (Math.random() * 10));

		System.out.println((int) (Math.random() * 10 + 1)); // 1~10 무작위 변수 Math.random()*10 +1
		System.out.println((int) (Math.random() * 10 + 1));

		// 주사위 (1~6)
		System.out.println((int) (Math.random() * 6 + 1)); // 1~6 무작위 변수
		
		// 주사위 값을 출력하는 매우 비효율적인 if else 문
		int dice = (int)(Math.random()*6+1);
		
		if (dice==1) {
			System.out.println("주사위 값은 1");
		}
		else if (dice==2){
			System.out.println("주사위 값은 2");
		}
		else if (dice==3){
			System.out.println("주사위 값은 3");
		}
		else  if (dice==4){
			System.out.println("주사위 값은 4");
		}
		else if (dice==5){
			System.out.println("주사위 값은 5");
		}
		else {
			System.out.println("주사위 값은 6");
		}
	

	}

}
