package ch05_2_array;

public class ArrayCopyByForExample {

	public static void main(String[] args) {

		/*
		 * �迭���� �ϴ�����: oldIntArray �� ���ڸ� �߰��ϰ� �; �迭�� ũ�Ⱑ �������� ������ �� �����Ƿ� �� ū �迭�� �����Ͽ�
		 * �����Ͽ� ����ִ°�
		 */
		int[] oldIntArray = { 1, 2, 3 };
		int[] newIntArray = new int[5];

		for (int i = 0; i < oldIntArray.length; i++) {
			newIntArray[i] = oldIntArray[i];

		}

		for (int i = 0; i < newIntArray.length; i++) {

			System.out.println(newIntArray[i]);
		}

	}

}
