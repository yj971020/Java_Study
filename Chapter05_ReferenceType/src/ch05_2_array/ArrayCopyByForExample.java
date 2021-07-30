package ch05_2_array;

public class ArrayCopyByForExample {

	public static void main(String[] args) {

		/*
		 * 배열복사 하는이유: oldIntArray 에 숫자를 추가하고 싶어도 배열은 크기가 정해지면 변겅할 수 없으므로 더 큰 배열을 선언하여
		 * 복사하여 집어넣는것
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
