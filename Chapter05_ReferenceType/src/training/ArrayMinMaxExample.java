package training;

public class ArrayMinMaxExample {

	public static void main(String[] args) {

		int[] array = { 1, 2, 3, 4, 5, 6, 7 };
		System.out.println("min: " + minValue(array));
		System.out.println("max: " + maxValue(array));

	}

	public static int minValue(int[] arr) {
		int min = arr[0];
		// int min = 0 ; 0으로 초기화 하면 오류. 0이 최솟값 일수 있음
		// int minNum=Integer.MIN_VALUE(); : 이렇게 해도 됨 : 정수로 표현할 수 있는 가장 작은값
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
