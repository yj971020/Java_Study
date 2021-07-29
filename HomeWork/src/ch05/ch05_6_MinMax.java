package ch05;

import java.io.IOException;
import java.util.Scanner;

public class ch05_6_MinMax {

	public static void main(String[] args) throws IOException {

		boolean run = true;
		int studentNum = 0;
		int[] scores = null;
		Scanner scn = new Scanner(System.in);

		int max = 0;
		int sum = 0;
		double avg = 0;

		while (run) {
			System.out.println("---------------------------------");
			System.out.println("1.학생수|2.점수입력|3.점수리스트|4.분석|5.종료");
			System.out.println("---------------------------------");
			System.out.print("선택> ");

			int selectNo = Integer.parseInt(scn.nextLine()); // 문자열을 받아 int 로 변환

			if (selectNo == 1) {
				System.out.print("학생수> ");
				studentNum = Integer.parseInt(scn.nextLine()); //받은 문자열을 정수형으로 변환
				// studentNum = System.in.read(); 오류
				//studentNum=scn.nextInt(); //오류
				scores = new int[studentNum];

			} else if (selectNo == 2) {

				for (int i = 0; i < studentNum; i++) {
					System.out.printf("scores[%d] >", i);
					// scores[i] = Integer.parseInt(scn.nextLine());
					scores[i] =scn.nextInt(); //오류
	
				}

			} else if (selectNo == 3) {
				for (int i = 0; i < studentNum; i++) {
					System.out.printf("scores[%d] > %d \n", i, scores[i]);
				}

			} else if (selectNo == 4) {
				for (int i = 0; i < studentNum; i++) {
					if (max < scores[i]) {
						max = scores[i];
					}
					sum += scores[i];
				}
				avg = (double) sum / studentNum; //(double)(sum/studentNum) -> 에러 : 이미 int 값으로 연산결과 저장되어 값손실 일어난뒤  double 형변환 해봤자임
				System.out.println("최고 점수: " + max);
				System.out.println("평균 점수: " + avg);
			} else if (selectNo == 5) {
				run = false;
			}
		}
		System.out.println("프로그램 종료");
	}

}
