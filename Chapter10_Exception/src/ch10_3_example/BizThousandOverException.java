package ch10_3_example;

public class BizThousandOverException extends Exception {
	public String toString(){
		return "입력값이 1000이 넘습니다. 확인요망";
	}

}
