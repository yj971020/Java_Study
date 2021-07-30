package training;

public class ArrayMinMaxExample {

	public static void main(String[] args) {

		int[] array = { 1, 2, 3, 4, 5, 6, 7 };
		System.out.println("min: " + minValue(array));
		System.out.println("max: " + maxValue(array));

	}

	public static int minValue(int[] arr) {
		int min = arr[0];
		// int min = 0 ; 0���� �ʱ�ȭ �ϸ� ����. 0�� �ּڰ� �ϼ� ����
		// int minNum=Integer.MIN_VALUE(); : �̷��� �ص� �� : ������ ǥ���� �� �ִ� ���� ������
		for (int i = 0; i < arr.length; i++) {
			if (min > arr[i]) {
				min = arr[i];
			}
		}
		return min;
	}

	public static int maxValue(int[] arr) {
		int max = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (max < arr[i]) {
				max = arr[i];
			}
		}
		return max;
	}

}
