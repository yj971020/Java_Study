package ch05_3_enumeration_type;

import java.util.Calendar;
import java.util.Scanner;

public class EnumWeekExample {

	public static void main(String[] args) {

		Week today = null; // ����Ÿ�� ���� ����: Week ��� enum ������ ����� ���� ���¿��� ���

		Calendar cal = Calendar.getInstance();
		int week = cal.get(Calendar.DAY_OF_WEEK); // ��(1) ~ ��(7) ������ ���ڸ� ����

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
		System.out.println("�Ͽ��Ͽ� �౸�� �մϴ�");
		}else {
			System.out.println("������ �ڹٰ��θ� �մϴ�.");
		}
		}

}
