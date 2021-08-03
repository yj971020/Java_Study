package ch06_4_method;

public class Computer {
	int[] intList;

	int sum1(int[] values) {

		return arraySum(values);
	}

	int sum2(int... values) { // ...��� : �޼ҵ� ȣ�� �� �Ѱ��� ���� ���� ���� �ڵ����� �迭 ����, �Ű������� ���
		int sum = 0;
		for (int i = 0; i < values.length; i++) {
			sum += values[i];
		}
		return sum;
	}
//	int sum2(int... values) { 
//		return arraySum(values); // �ߺ� ���� �ؼ� �̷��� �ᵵ ��
//	}

	int arraySum(int[] ars) {
		int total = 0;
		for (int i = 0; i < ars.length; i++) {
			total += ars[i];
		}
		return total;
	}
}
