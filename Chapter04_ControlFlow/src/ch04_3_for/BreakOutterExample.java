package ch04_3_for;

public class BreakOutterExample {

	public static void main(String[] args) {
		// for �� �߰��� break �� �ѹ��� ���������� ���

		Outter: for (char upper = 'A'; upper <= 'Z'; upper++) { // Outter:for���� �̸� ���� ���� ,,���ϴ� �̸� ���� ���� �� ����
			for (char lower = 'a'; lower <= 'z'; lower++) {

				System.out.println(upper + "-" + lower);

				if (lower == 'g') {
					break Outter; // Outter ��ü�� �������Ͷ�
				}
			}
		}
	}

}
