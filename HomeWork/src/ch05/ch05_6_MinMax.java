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
			System.out.println("1.�л���|2.�����Է�|3.��������Ʈ|4.�м�|5.����");
			System.out.println("---------------------------------");
			System.out.print("����> ");

			int selectNo = Integer.parseInt(scn.nextLine()); // ���ڿ��� �޾� int �� ��ȯ

			if (selectNo == 1) {
				System.out.print("�л���> ");
				studentNum = Integer.parseInt(scn.nextLine()); //���� ���ڿ��� ���������� ��ȯ
				// studentNum = System.in.read(); ����
				//studentNum=scn.nextInt(); //����
				scores = new int[studentNum];

			} else if (selectNo == 2) {

				for (int i = 0; i < studentNum; i++) {
					System.out.printf("scores[%d] >", i);
					// scores[i] = Integer.parseInt(scn.nextLine());
					scores[i] =scn.nextInt(); //����
	
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
				avg = (double) sum / studentNum; //(double)(sum/studentNum) -> ���� : �̹� int ������ ������ ����Ǿ� ���ս� �Ͼ��  double ����ȯ �غ�����
				System.out.println("�ְ� ����: " + max);
				System.out.println("��� ����: " + avg);
			} else if (selectNo == 5) {
				run = false;
			}
		}
		System.out.println("���α׷� ����");
	}

}
