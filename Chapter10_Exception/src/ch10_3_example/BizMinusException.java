package ch10_3_example;

public class BizMinusException extends Exception {

	public String toString() {
		return "결과값이 음수입니다. 확인요망";
	}
}
