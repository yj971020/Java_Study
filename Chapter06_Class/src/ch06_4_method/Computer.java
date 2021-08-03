package ch06_4_method;

public class Computer {
	int[] intList;

	int sum1(int[] values) {

		return arraySum(values);
	}

	int sum2(int... values) { // ...사용 : 메소드 호출 시 넘겨준 값의 수에 따라 자동으로 배열 생성, 매개값으로 사용
		int sum = 0;
		for (int i = 0; i < values.length; i++) {
			sum += values[i];
		}
		return sum;
	}
//	int sum2(int... values) { 
//		return arraySum(values); // 중복 제거 해서 이렇게 써도 됨
//	}

	int arraySum(int[] ars) {
		int total = 0;
		for (int i = 0; i < ars.length; i++) {
			total += ars[i];
		}
		return total;
	}
}
