package ch04_3_for;

public class BreakOutterExample {

	public static void main(String[] args) {
		// for 문 중간에 break 로 한번에 빠져나오는 방법

		Outter: for (char upper = 'A'; upper <= 'Z'; upper++) { // Outter:for문의 이름 같은 느낌 ,,원하는 이름 으로 정할 수 있음
			for (char lower = 'a'; lower <= 'z'; lower++) {

				System.out.println(upper + "-" + lower);

				if (lower == 'g') {
					break Outter; // Outter 자체를 빠져나와라
				}
			}
		}
	}

}
