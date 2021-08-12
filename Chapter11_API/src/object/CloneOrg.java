package object;

import java.util.Arrays;

public class CloneOrg {

	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5};
		int[] arrCopy = arr.clone();
		for(int i : arrCopy) {//반복하며 i 에 알아서 대입해줌
			System.out.print(i+", ");
		}
		System.out.println();
		System.out.println(Arrays.toString(arrCopy)); //배열을 전부 출력해줌
	}

}
