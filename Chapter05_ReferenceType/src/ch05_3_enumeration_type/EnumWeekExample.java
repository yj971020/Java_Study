package ch05_3_enumeration_type;

import java.util.Calendar;
import java.util.Scanner;

public class EnumWeekExample {

	public static void main(String[] args) {

		Week today = null; // 열거타입 변수 선언: Week 라는 enum 파일을 만들어 놓은 상태에서 사용

		Calendar cal = Calendar.getInstance();
		int week = cal.get(Calendar.DAY_OF_WEEK); // 일(1) ~ 토(7) 까지의 숫자를 리턴

		switch (week) {
		case 1:
			today = Week.SUNDAY;
			break;
		case 2:
			today = Week.MONDAY;
			break;
		case 3:
			today = Week.TUESDAY;
			break;
		case 4:
			today = Week.WEDNESDAY;
			break;
		case 5:
			today = Week.THURSDAY;
			break;
		case 6:
			today = Week.FRIDAY;
			break;
		case 7:
			today = Week.SATURDAY;
			break;
		}
		if(today ==Week.SUNDAY) {
		System.out.println("일요일엔 축구를 합니다");
		}else {
			System.out.println("열심히 자바공부를 합니다.");
		}
		}

}
